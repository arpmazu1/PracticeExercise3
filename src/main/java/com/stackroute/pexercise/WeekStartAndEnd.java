package com.stackroute.pexercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WeekStartAndEnd {
    public String getdate(){
        Calendar c = Calendar.getInstance();
        String s="";

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        s=s+(df.format(c.getTime()));
        s=s+"\n";
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        s=s+(df.format(c.getTime()));

        return s;
    }
}
