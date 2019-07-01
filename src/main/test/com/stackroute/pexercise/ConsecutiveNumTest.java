package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {
    ConsecutiveNum num;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        num= new ConsecutiveNum();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        num=null;

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
    public void givenConsecutiveNumbersShouldReturnCorrectMessage(){
        //arange
        int[] a={1,2,3,4,5,6};
        //Act
        String result = num.check(a);

        //Assert
        assertEquals("The numbers are consequtive",result);
    }
    @Test
    public void givenNonconsecutiveNumbersShouldReturnMessage(){
        //arange
        int[] a={1,2,3,5,6};
        //Act
        String result = num.check(a);

        //Assert
        assertEquals("The numbers are not consequtive",result);
    }


}