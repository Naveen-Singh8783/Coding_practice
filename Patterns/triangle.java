/*
Pattern:
     *    
    ***   
   *****  
  ******* 
 *********

 */


import java.util.*;

class triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows in odd value:");
        int rows = sc.nextInt();
        int star = 1;
        int space = rows
        for(int cur_row=1;cur_row<=rows;cur_row++){
            for(int col=1;col<=space;col++)
                         System.out.print(" ");

            for(int col=1;col<=star;col++)
                        System.out.print("*");

            
            space--;
            star+=2;
            System.out.println();
        }
    }
}