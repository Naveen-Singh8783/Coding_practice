/*
Patterns:

**** ****
***   ***
**     **
*       *

*       *
**     **
***   ***
**** ****

*/

import java.util.*;

class hollowRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int rows = sc.nextInt();
        int space = 1;
        int star = rows/2;

        while(star >= 0){
            for(int col = 1;col<=star;col++)
                System.out.print("*");

            for(int col=1;col<=space;col++)
                System.out.print(" ");  

            for(int col = 1;col<=star;col++)
                System.out.print("*");  

             star--;
             space+=2;
             System.out.println();      
        }

        space-=4;
        for(star=1;star<=rows/2;star++){
            for(int col = 1;col<=star;col++)
                System.out.print("*");

            for(int col=1;col<=space;col++)
                System.out.print(" ");  

            for(int col = 1;col<=star;col++)
                System.out.print("*");  

           
             space-=2;
             System.out.println(); 

        }
    }
}