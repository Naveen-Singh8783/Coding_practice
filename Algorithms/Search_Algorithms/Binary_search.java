import java.util.*;

class Binary_search{
    public static void main(String[] args){
        int[] arr = {1, 5, 15, 24, 28, 32, 33, 50, 68, 71, 79};
        Scanner sc = new Scanner(System.in);

        
        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");

        System.out.println("\nEnter number to find in array:");

        int num = sc.nextInt();
        int index = binary_search(num,arr);

        if(index == -1){
            System.out.println("Number not found in Array.");
        }else{
            System.out.println(num+" found on index "+ index);
        }
        
    }

    public static int binary_search(int num,int[] arr){
        int index = -1;
        int mid = arr.length/2;
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            if(arr[mid] == num){
                index = mid;
                return index;
            }
           else if(arr[mid] < num){
                low = mid+1;
                mid = (low + high)/2;
            }else {
                high = mid-1;
                mid = (low + high)/2;
            }
        }

        return index;

    }
}