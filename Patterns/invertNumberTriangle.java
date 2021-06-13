/*
Pattern:
 1 2 3 4 5 6
  2 3 4 5 6
   3 4 5 6
    4 5 6
     5 6
      6
*/

import java.util.*;

class invertNumberTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        int space = 0;
        for(int cur_row=1;cur_row<=rows;cur_row++){
            for(int col=1;col<=space;col++)
                System.out.print(" ");

            for(int col=cur_row;col<=rows;col++)
                System.out.print(" "+col);

            space++;
            System.out.println();
        }
    }
}