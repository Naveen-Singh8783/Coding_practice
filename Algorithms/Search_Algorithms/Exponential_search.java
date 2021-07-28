import java.util.*;

class Exponential_search{
    public static void main(String[] args){

        int[] arr = {1, 5, 15, 24, 28, 32, 33, 50, 68, 71, 79};
        Scanner sc = new Scanner(System.in);

        
        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");

        System.out.println("\nEnter number to find in array:");
        int num = sc.nextInt();

        int index = exponential_search(arr,num);

        System.out.print((index < 0)?  "Element is not present in array" : "Element present at "+index);

    }

    public static int exponential_search(int[] arr, int num){
        int n = arr.length;
        if(arr[0] == num)
            return 0;

        int i = 1;
        while(i<n && arr[i] < num)
            i = i*2;

        return binary_search(arr,i/2,Math.min(i,n-1), num);

    }

    public static int binary_search(int[] arr,int min, int max,int num){
        while(min <= max){
            int mid = (min + max)/2;

            if(arr[mid] == num)
                return mid;
            else if(arr[mid] < num)
                min = mid + 1;
            else
                max = mid - 1;
        
        }

        return -1;
    }
}