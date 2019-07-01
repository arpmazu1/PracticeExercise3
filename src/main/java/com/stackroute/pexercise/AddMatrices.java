package com.stackroute.pexercise;

public class AddMatrices {
    public String sum(int row, int col, int mat1[][], int mat2[][]){
        String s="";
            int a[][]=new int[row][col];
            for(int i=0;i<row;i++) {
               for(int j=0;j<col;j++){
                   a[i][j]=mat1[i][j]+ mat2[i][j];
                   s=s+a[i][j]+" ";
               }
               s=s +"\n";
           }


      return s.trim();
    }
}
