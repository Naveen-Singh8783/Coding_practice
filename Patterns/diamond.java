/*
Pattern:
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

*/

import java.util.*;

class diamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in odd:");
        int rows = sc.nextInt();
        int space = rows/2 + 1;
        int star = 1;
        while(space > 0){
           for(int col=1; col <= space;col++)
                System.out.print(" ");
             
           for(int col=1;col<=star;col++)
                System.out.print("*");    
            
            System.out.println();
            space--;
            star+=2;
        }

        while(space <= rows/2+1){
            
             for(int col=1; col <= space;col++)
                System.out.print(" ");
               
            for(int col=1;col<=star;col++)
                System.out.print("*");
            
            System.out.println();
            space++;
            star-=2;    
        }  
    }
}