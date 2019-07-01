package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class WeekStartAndEndTest {
    WeekStartAndEnd d;

    @Before
    public void setUp() {
        System.out.println("Inside before");
        d = new WeekStartAndEnd();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        d = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Before class");

    }

    @AfterClass
    public static void tearDownBeforeClass() {
        System.out.println("After class");


    }

    @Test
    public void givenPatternReturnCorrectMessage() {
        //arange


        //Act
        String result = d.getdate();

        //Assert
        assertEquals("Mon 01/07/2019\n" +
                "Sun 07/07/2019", result);

    }
}