package com.stackroute.pexercise;

public class StudentDetails {
    public String details(int num, int a[]) {
        int avg = 0, min = a[0], max = a[0], sum = 0;
        String s = "";

        for (int i = 0; i < num; i++) {

                 if (a[i] < min)
                    min = a[i];
                if (a[i] > max)
                    max = a[i];
                sum += a[i];

        }
        if(min<0||max>100)
            s="the numbers are out of range";
        else {
            avg = sum / num;

            s = "The average is" + avg + "\n" + "The minimum is" + min + "\n" + "The maximum is" + max;
        }
        return s;

    }
}
