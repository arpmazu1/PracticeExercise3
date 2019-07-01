package com.stackroute.pexercise;

public class PrintChessPattern
{
    public String print(){
        //String[][] board = new String[8][8];
        String[][] board = new String[8][8];
        String s="";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = (i + j) % 2 == 0 ? "WW" : "BB";
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                s=s+(board[i][j]+" ");
               // System.out.println(s);
            }
            s=s+"\n";
        }

    return s.trim();
}}
