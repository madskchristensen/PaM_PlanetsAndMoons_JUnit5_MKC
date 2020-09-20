package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    @Test
    void testMoonGetAndSetName() {
        // Arrange
        Orbital moon = new Moon();

        // Act
        moon.setName("moon");

        // Assert
        assertEquals("moon", moon.getName());
    }

    @Test
    void testIsCirculatingPlanet() {
        // Arrange
        Orbital moon = new Moon();
        Orbital earth = new Planet("earth", 365.25);

        // Act
        moon.setName("moon");
        moon.setCirculating(earth);

        // Assert
        assertEquals("earth", moon.getCirculating().getName());
    }
}