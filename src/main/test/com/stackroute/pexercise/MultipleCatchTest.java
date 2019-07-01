package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class MultipleCatchTest {
    MultipleCatch m;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        m= new MultipleCatch();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        m=null;

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
    public void givenNegativNumShouldReturnErrorMessage(){
        //arange


        //Act
        String result =  m.multiple(-8);

        //Assert
        assertEquals("Can't create array of negative size",result);
    }

    @Test
    public void givenNullValueShouldReturnErrorMessage(){
        //arange


        //Act
        String result =  m.multiple(null);

        //Assert
        assertEquals("null values",result);
    }
    @Test
    public void givenArrayOutofBoundShouldReturnErrorMessage(){
        //arange


        //Act
        String result =  m.multiple(4);

        //Assert
        assertEquals("Array index out of bound",result);
    }


}