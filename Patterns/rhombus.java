/*
Pattern:
    *****
   ***** 
  *****
 *****
*****

*/

import java.util.*;

class rhombus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        int cur_row,col;

        for(cur_row=1;cur_row<=rows;cur_row++){

            for(col=1;col<=rows-cur_row;col++)
                System.out.print(" ");

            for(col=1;col<=rows;col++)
                System.out.print("*");

            System.out.println();
        }
        
    }
}