/*
Pattern:

*        *
  *    *
    *
  *    *
*        *

*/

import java.util.*;

class starPattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows in odds:");
        int input = sc.nextInt();
        int row = 1;
        int count = input + 1;
        while(row <= input){
            int col = 1;
            while(col <= input){
                if(col == row || col == count-row){
                    System.out.print("*");
                    
                }

                if(col <= count || col >count){
                    System.out.print("  ");
                   
                } 
                col++;
            }
            System.out.println();
            row++;
            
        }
    }
}