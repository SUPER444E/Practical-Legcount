package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class legCountTest {

    @Test
    //'lion', 'monkey', 'deer', 'snake', 'elephant'
    public void TestCase1() {
        String[] animals = {"lion", "monkey", "deer", "snake", "elephant"};
        int expected = 3;
        int actual = legCount.legCount(animals);
        assertEquals(expected, actual);

    }

    @Test
    public void TestCase2() {
        String[] animals = {"lion", "monkey", "deer", "snake", "penguin"};
        int expected = 2;
        int actual = legCount.legCount(animals);
        assertEquals(expected, actual);

    }

    @Test
    public void TestCase3() {
        String[] animals = {"lion", "cat", "deer", "dog", "elephant"};
        int expected = 5;
        int actual = legCount.legCount(animals);
        assertEquals(expected, actual);

    }

    @Test // checking if null is an input
    public void edgeCase1() {
        int expected = 0;
        int actual = legCount.legCount(null);
        assertEquals(expected, actual);
    }

    @Test // checking for empty string in the array
    public void edgeCase2() {
        String[] animals = {"", "lion", "monkey", "deer", "snake", "penguin"};
        int expected = 2;
        int actual = legCount.legCount(animals);
        assertEquals(expected, actual);
    }

    @Test
    public void edgeCase3() {
        String[] animals = {"", "liOn", "moNKey", "DEer", "sNake", "penguin"};
        int expected = 2;
        int actual = legCount.legCount(animals);
        assertEquals(expected, actual);
    }
}