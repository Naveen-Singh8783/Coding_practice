import java.util.*;
import java.lang.*;

class trappingRainWater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number of walls:");
        int n = sc.nextInt();
        System.out.println("Please enter the heights of the walls:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int total_water_trap = water_trap(arr);
        System.out.println("Total water trapped is "+total_water_trap);
    }

    public static int water_trap(int[] arr){
        int total_water = 0;

        for(int i=1;i<arr.length-1;i++){
            int left_max = 0;
            int right_max = 0;
            for(int j=0;j<=i;j++){
                if(left_max <= arr[j])
                    left_max = arr[j];
            }

            for(int j=i;j<arr.length;j++){
                if(right_max <= arr[j])
                    right_max = arr[j];
            }
            
            
                total_water = total_water + (Math.min(left_max,right_max)-arr[i]);
            
        }

        return total_water;
    }
}