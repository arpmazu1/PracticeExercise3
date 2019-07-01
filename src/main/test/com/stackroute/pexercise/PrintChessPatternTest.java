package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class PrintChessPatternTest {
    PrintChessPattern p;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        p= new PrintChessPattern();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        p=null;

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
    public void givenPatternReturnCorrectMessage(){
        //arange


        //Act
        String result =  p.print();

        //Assert
        assertEquals("WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW",result);
    }

}