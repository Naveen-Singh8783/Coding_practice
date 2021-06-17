/*
Pattern:
              *
                        **
                       ***
                      ****
                     *****
                       ***
                      ****
                     *****
                    ******
                   *******
                     *****
                    ******
                   *******
                  ********
                 *********
                   *******
                  ********
                 *********
                **********
               ***********
                 *********
                **********
               ***********
              ************
             *************
*/

import java.util.*;

class rightAngleFlag{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the height of tree greater than 3:");
        int height = sc.nextInt();
        int star = 1;
        int space = height*height;

        for(int tree=1;tree<=height;tree++){

            for(int row=1;row<=height;row++){

                for(int col=1;col<=space;col++)
                    System.out.print(" ");

                for(int col=1;col<=star;col++)
                    System.out.print("*");

                if(row==height){
                    space+=2;
                    star-=2;
                }else{
                    space--;
                    star++;
                }
                System.out.println();
            }
        }
    }
}