package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void testPlanetGetAndSetName() {
        // Arrange
        Orbital earth = new Planet();

        // Act
        earth.setName("earth");

        // Assert
        assertEquals("earth", earth.getName());
    }

    @Test
    void testPlanetGetAndSetLengthOfYear() {
        // Arrange
        Orbital earth = new Planet();

        // Act
        earth.setLengthOfYear(265.25);

        // Assert
        assertEquals(265.25, earth.getLengthOfYear());
    }

    @Test
    void testAmountOfMoonsAreCirculatingAPlanet() {
        // Arrange
        Orbital earth = new Planet("Earth", 365.25);
        Orbital earth2 = new Planet("Earth2", 1);
        Orbital moon1 = new Moon("Moon1", 200);
        Orbital moon2 = new Moon("Moon2", 300);

        // Act
        earth.setCirculatingOrbital(moon1);
        earth.setCirculatingOrbital(moon2);

        // Assert
        assertEquals(2, earth.countCirculatingOrbitals());
        assertEquals(1, earth.countCirculatingOrbitals() - 1);
        assertEquals(0, earth2.countCirculatingOrbitals());
    }
}