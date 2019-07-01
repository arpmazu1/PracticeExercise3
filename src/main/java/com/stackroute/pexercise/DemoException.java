package com.stackroute.pexercise;

public class DemoException {

    public String demo(){
        String result="";
        try{
            throw new Exception("Exception statement");
        }
        catch(Exception e)
        {
            result+= e.getMessage();
            result+= "\nCatch statement\n";
        }
        finally
        {
            result+= "Finally statement";
        }
        return result;
    }
}
