package com.stackroute.pexercise;

import java.util.*;


public class RemoveVowel {
    public String remove(String str[]) {
        String s="";
        for (int i = 0; i < str.length; i++)
        {
            //if (str[i].contains("a|e|i|o|u")) {
//                str[i].replaceAll("a|e|i|o|u", "");
                s=s +"Place Name without Vowels:"+i+str[i].replaceAll("a|e|i|o|u", "")+"\n";
            //}
        }


        return s;
    }
}
