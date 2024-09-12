package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MethodsLifeCycleTest {

    @BeforeAll
    static void setUp() {
        System.out.println("@BeforeAll: expensive tedt fixture goes here (e.g., database connection).");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("@AfterAll: Code to close and/or free resources of @BeforeAll goes here.");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("@BeforeEach: repetitive fixture code (e.g., common configuretion of SUT instances).");
    }

    @AfterEach
    void afterEach() {
        System.out.println("@AfterEach: code to close and/or free resources of @BeforeEach.");
    }

    @Test
    void someTest() {
        System.out.println("@Test: Some test case code goes here (1).");
    }

    @Test
    void otherTest() {
        System.out.println("@Test: Some test case code goes here (2)");
    }
}