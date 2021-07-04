/*

Question: https://leetcode.com/problems/move-zeroes/

*/

import java.util.*;

class moveZeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        moveZerosToLast(arr);

        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }

    public static void moveZerosToLast(int[] arr){
       int begin = 0;
       int count = 0;
       for(int i=0;i<arr.length;i++){
           if(arr[i] != 0){
               arr[begin] = arr[i];
               begin++;
           }else{
               count++;
           }
       }

       while(count != 0){
           arr[begin] = 0;
           count--;
           begin++;
       }
    }
}