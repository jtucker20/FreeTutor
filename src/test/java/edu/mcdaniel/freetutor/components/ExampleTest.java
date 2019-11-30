package edu.mcdaniel.freetutor.components;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    private Example exampleClass;

    @BeforeEach
    void setUp() {

        exampleClass = new Example();

    }

    @Test
    void getMessage() {

        // Arrange
        String expected = "Hello World!";

        // Act
        String actual = exampleClass.getMessage();

        // Assert
        assertEquals(expected, actual);
    }
}