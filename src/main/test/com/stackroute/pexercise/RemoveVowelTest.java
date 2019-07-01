package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveVowelTest {
    RemoveVowel rem;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        rem= new RemoveVowel();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        rem=null;

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
    public void givenStringShouldReturnCorrectMessage(){
        //arange
        String[] str={"India","Australia"};
        //Act
        String result = rem.remove(str);

        //Assert
        assertEquals("Place Name without Vowels:0Ind\n" +
                "Place Name without Vowels:1Astrl\n",result);
    }

    @Test
    public void givenAnotherStringShouldReturnCorrectMessage(){
        //arange
        String[] str={"India",
                "United States",
                "Germany",
                "Egypt",
                "czechoslovakia"};
        //Act
        String result = rem.remove(str);

        //Assert
        assertEquals("Place Name without Vowels:0Ind\n" +
                "Place Name without Vowels:1Untd Stts\n" +
                "Place Name without Vowels:2Grmny\n" +
                "Place Name without Vowels:3Egypt\n" +
                "Place Name without Vowels:4czchslvk\n",result);
    }


}