package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SunTest {
    @Test
    void testSunGetAndSetName() {
        // Arrange
        Orbital sun = new Sun();

        // Act
        sun.setName("Sol");

        // Assert
        assertEquals("Sol", sun.getName());
    }

}