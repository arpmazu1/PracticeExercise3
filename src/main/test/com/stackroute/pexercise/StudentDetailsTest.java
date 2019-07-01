package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentDetailsTest {
    StudentDetails stu;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        stu= new StudentDetails();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        stu=null;

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
    public void givenGradesShouldReturnCorrectMessage(){
        //arange
        int a[]={34,45,67,89};
        //Act
        String result= stu.details(4,a);

        //Assert
        assertEquals("The average is58\n" +
                "The minimum is34\n" +
                "The maximum is89",result);
    }

    @Test
    public void givenDifferentGradesShouldReturnCorrectMessage(){
        //arange
        int a[]={34,23,45,67,89};
        //Act
        String result= stu.details(5,a);

        //Assert
        assertEquals("The average is51\n" +
                "The minimum is23\n" +
                "The maximum is89",result);
    }
    @Test
    public void givenGradesOutOfRangeShouldReturnErrorMessage(){
        //arange
        int a[]={34,23,45,167,89};
        //Act
        String result= stu.details(5,a);

        //Assert
        assertEquals("the numbers are out of range",result);
    }

}