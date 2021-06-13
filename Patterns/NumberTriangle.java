/*
patttern:

1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1

*/

import java.util.*;

class NumberTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows:");
        int rows = sc.nextInt();
        

        for(int i=1;i<=rows;i++){
            int col = 1;
            while(col <= i*2 - 1){
                if(col%2 != 0){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }
                col++;
            }
             System.out.println(); 
        }

        for(int i= rows-1;i>=0;i--){
            int col = 1;
            while(col <= i*2 - 1){
                if(col%2 != 0){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }
                col++;
            }
             System.out.println(); 
        }
    }
}