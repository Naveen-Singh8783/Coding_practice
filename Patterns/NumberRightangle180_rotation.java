/*
Pattern 2

       1
     2 3
   4 5 6
 7 8 9 10 

after 10 pattern will not work perfectly due to double digit no come.
*/



import java.util.*;

class NumberRightangle180_rotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int input = sc.nextInt();
        int row = 1;
        int num = 1;
        int space = input-1;

        while(row <= input){
            int col = 1;
            while(col <= space){
                System.out.print("  ");
                col++;
            }

            while(col <= input){
                System.out.print(num+" ");
                num++;
                col++;
            }

            row++;
            space--;
            System.out.println();
        }
    }
}