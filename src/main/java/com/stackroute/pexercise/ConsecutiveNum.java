package com.stackroute.pexercise;

public class ConsecutiveNum {
    public String check( int a[]){
        int max = a[0];
        int min = a[0];
        String s="";
        for (int i = 1; i < a.length; i++)
        {   if (a[i] < min)
                min = a[i];
            if(a[i]> max)
                max =a[i];
        }
        if(max-min+1==a.length)
            s="The numbers are consequtive";
        else
            s="The numbers are not consequtive";

        return s;
    }
}
