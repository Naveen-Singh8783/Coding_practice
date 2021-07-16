/*
Questions: https://leetcode.com/problems/rotate-array/
*/

import java.util.*;

class Rotate_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter steps to which you want to rotate array:");
        int num = sc.nextInt();
        rotate_array(arr, num);
        System.out.println("After rotation:");

        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");

    }

    public static void rotate_array(int[] arr, int num){
        num = num % arr.length; 
        reverse(arr,0, arr.length-1);
        reverse(arr,0, num-1);
        reverse(arr, num, arr.length-1);

    }

    public static void reverse(int[] arr,int low, int high){
        if(high == 0)
            return;

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
} 