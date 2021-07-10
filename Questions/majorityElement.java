/*
Question: https://leetcode.com/problems/majority-element/

*/

import java.util.*;

class majorityElement{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        System.out.println("Majority element is: "+majorityelement(arr));
    }

    public static int majorityelement(int[] arr){
        int count = 0;
        int retval = 0;

        for(int i=0;i<arr.length;i++){
            if(count == 0)
                retval = arr[i];

            if(retval == arr[i])
                count++;
            else
                count--;
        }      
        return retval;
    }
}