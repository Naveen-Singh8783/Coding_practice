import java.util.*;
/*
Pattern 1.

1
2 3
4 5 6
7 8 9 10
11 12 13 14
 */

class NumberRightangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int input = sc.nextInt();
        int num = 1;
        int row = 1;
        int col = 1;
        while(row <= input){
            while(col <= row){
                System.out.print(num+" ");
                num++;
                col++;
            }
            System.out.println();
            row++;
            col = 1;
        }
    }
}