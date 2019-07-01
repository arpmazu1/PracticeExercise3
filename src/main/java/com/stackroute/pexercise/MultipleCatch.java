package com.stackroute.pexercise;

public class MultipleCatch {
    public String multiple(Integer arrsize) {
        try {
            int[] myArray = new int[arrsize];
            System.out.println(myArray[arrsize+1]);
            return "The array is " + myArray;
        }
        catch (NegativeArraySizeException ex) {
            return ("Can't create array of negative size");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return "Array index out of bound";
        }
        catch(NullPointerException ex){
            return "null values";
        }
    }
}
