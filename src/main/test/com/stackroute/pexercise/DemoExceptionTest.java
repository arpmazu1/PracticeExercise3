package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class DemoExceptionTest {
    DemoException demo;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        demo= new DemoException();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        demo=null;

    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before class");

    }
    @AfterClass
    public static void tearDownBeforeClass(){
        System.out.println("After class");


    }
    @Test
    public void givenPalindromeNumberShouldReturnCorrectMessage(){
        //arange

        //Act
        String result =  demo.demo();

        //Assert
        assertEquals("Exception statement\n" +
                "Catch statement\n" +
                "Finally statement",result);
    }

}