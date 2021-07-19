/*

Question: https://leetcode.com/problems/two-sum/

*/

import java.util.*;

class Two_sum {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter element in array:");
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter target:");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target - arr[i] == arr[j]){
                    System.out.println("Two no.'s index is: "+i+" and "+j);
                    return;
                }
            }
        }

        System.out.println("NO two no addition make target.");

    }
}