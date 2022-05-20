package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodReturnTypesTest {

    @Test
    void returnString() {
        String expected = "deez";
        String actual = MethodReturnTypes.returnString();

        assertEquals(expected, actual);
    }

    @Test
    void returnInt() {
        int expected = 5;
        int actual = MethodReturnTypes.returnInt();

        assertEquals(expected, actual);
    }

    @Test
    void returnBoolean() {
        boolean expected = false;
        boolean actual = MethodReturnTypes.returnBoolean();

        assertEquals(expected, actual);
    }
}