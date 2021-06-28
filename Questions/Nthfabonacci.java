/*
question: https://leetcode.com/problems/fibonacci-number/

*/

import java.util.*;

class Nthfabonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth place to get Nth fabonacci number:");
        int num = sc.nextInt();

        System.out.println("Nth fabonacci number is: "+ fabonacci(num-1));
    }

    public static int fabonacci(int n){
        if(n == 1)
            return 1;

        if(n == 0)
            return 0;
        

        n = fabonacci(n-1) + fabonacci(n-2);
        return n;
    }
}