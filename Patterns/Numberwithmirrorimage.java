/*
Pattern:
 1 2 3 4 5 6 7
  2 3 4 5 6 7
   3 4 5 6 7
    4 5 6 7
     5 6 7
      6 7
       7
      6 7
     5 6 7
    4 5 6 7
   3 4 5 6 7
  2 3 4 5 6 7
 1 2 3 4 5 6 7
*/

import java.util.*;

class Numberwithmirrorimage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end number:");
        int input = sc.nextInt();
        int space = 0;

        for(int row=1;row<=input;row++){
            for(int col=1;col<=space;col++)
                System.out.print(" ");

            for(int col=row;col<=input;col++)
                System.out.print(" "+col);

            System.out.println();
            space++;
        }

        space-=2;
        int num = input-1;
        for(int row=input-1;row>0;row--){
            for(int col=1;col<=space;col++)
                System.out.print(" ");

            for(int col=num;col<=input;col++)
                System.out.print(" "+col);

            System.out.println();
            space--;
            num--;
        }
    }
}