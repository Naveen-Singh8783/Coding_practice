/*
Question: https://www.geeksforgeeks.org/check-if-the-given-array-is-mirror-inverse/

*/

import java.util.*;

class mirrorInverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        boolean check = true;

        for(int i=0;i<size;i++){
            if(arr[i] < size){
                if(arr[arr[i]] != i){
                    check = false;
                }

            }else{
                check = false;
            }
        }

        if(check)
            System.out.println("Mirror inverse Array");
        else
            System.out.println("Not a Mirror inverse Array");
    }
}