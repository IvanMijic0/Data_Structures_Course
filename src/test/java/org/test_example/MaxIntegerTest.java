package org.test_example;

import org.example.MaxInteger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MaxIntegerTest {

    static int[] numbers;
    static  final String path = "C://Users//User//IdeaProjects//DS_firstLab//TextFiles//numbers.txt";


    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        numbers = MaxInteger.readNumbers(path);
    }

    @BeforeEach
    public void setUp() {}

    @AfterEach
    public void tearDown() {}

    @AfterAll
    public static void tearDownAfterClass() {        numbers = null;
    }

    @Test
    public void testFindsCorrectMaximum() {
        int maxNumber = MaxInteger.findMax(numbers);
        assertEquals(998, maxNumber);
    }

    @Test
    public void testFindsIncorrectMaximum() {
        int maxNumber = MaxInteger.findMax(numbers);
        assertNotEquals(13, maxNumber);
    }
}
