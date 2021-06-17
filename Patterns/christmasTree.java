/*
Pattern:
                *
                         * *
                        * * *
                       * * * *
                      * * * * *
                        * * *
                       * * * *
                      * * * * *
                     * * * * * *
                    * * * * * * *
                      * * * * *
                     * * * * * *
                    * * * * * * *
                   * * * * * * * *
                  * * * * * * * * *
                    * * * * * * *
                   * * * * * * * *
                  * * * * * * * * *
                 * * * * * * * * * *
                * * * * * * * * * * *
                  * * * * * * * * *
                 * * * * * * * * * *
                * * * * * * * * * * *
               * * * * * * * * * * * *
              * * * * * * * * * * * * *
                      * * * * *
                      * * * * *
                      * * * * *
                      * * * * *
                      * * * * *

*/


import java.util.*;

class christmasTree{
    public static void main(String[] args){
        int height = 5; //tree has 5 branchs;
        int star = 1;
        int space = height*5;

        for(int tree=1;tree<=height;tree++){

            for(int row=1;row<=height;row++){

                for(int col=1;col<=space;col++)
                    System.out.print(" ");

                for(int col=1;col<=star;col++)
                    System.out.print(" *");

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
        space = height*5-4;
        star = height;
        for(int rows=1;rows<=height;rows++){
            for(int col=1;col<=space;col++)
                System.out.print(" ");

            for(int col=1;col<=star;col++)
                System.out.print(" *");

            System.out.println();
        }

    }
}