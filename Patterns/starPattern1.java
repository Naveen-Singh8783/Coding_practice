/*
Pattern:

*       *
**     **
***   ***
**** ****
*********

*/

import java.util.*;

class starPattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number of Rows:");
        int Rows = sc.nextInt();
        int space = (2 * Rows) - 2;
        
        int row = 1;
        

        while(row <= Rows){
            int col = 1;
            while(col <= row){
                System.out.print("*");
                col++;
            } 

            while(col <= space){
                System.out.print(" ");
                col++;
            }

            col = 1;
            while(col <= row){
                if(row == Rows){
                    if(col == row){
                        col++;
                    }else{
                        System.out.print("*");
                        col++;

                    }
                }else{
                    System.out.print("*");
                col++;

                }
                
                
            }

            System.out.println();
            row++;
            space = space - 1;

        }
    }
}