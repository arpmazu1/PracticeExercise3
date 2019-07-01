package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class AddMatricesTest {
    AddMatrices ad;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        ad= new AddMatrices();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        ad=null;

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
    public void givenMatricesShouldReturnCorrectMessage(){
        //arange
    int[][] a= {{1,2,3},{4,5,6}};
    int[][] b={{9,8,7},{6,5,4}};
        //Act
        String result =  ad.sum(2,3,a,b);

        //Assert
        assertEquals("10 10 10 \n10 10 10",result);
    }
    @Test
    public void givenAnotherMatricesShouldReturnCorrectMessage(){
        //arange
        int[][] a= {{1,2},{3,4},{5,6}};
        int[][] b={{9,6},{4,7},{5,4}};
        //Act
        String result =  ad.sum(3,2,a,b);

        //Assert
        assertEquals("10 8 \n" +
                "7 11 \n" +
                "10 10",result);
    }

}