import java.util.*;
import java.lang.*;

class Jump_search{
    public static void main(String[] args){
        int[] arr = {1, 5, 15, 24, 28, 32, 33, 50, 68, 71, 79};
        Scanner sc = new Scanner(System.in);

        
        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");

        System.out.println("\nEnter number to find in array:");

        int num = sc.nextInt();
        int index = jump_search(num,arr);

        if(index == -1){
            System.out.println("Number not found in Array.");
        }else{
            System.out.println(num+" found on index "+ index);
        }
        
    }


    public static int jump_search(int num,int[] arr){
        int n = arr.length;
        int prev = 0;

        int step = (int)Math.floor(Math.sqrt(n));
        

        while(arr[Math.min(step, n) - 1] < num){

            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            

            if(prev >= n)
                return -1;
        }

        while(arr[prev] < num){
            prev++;

            if(prev == Math.min(step,n))
                return -1;
        }

        if(arr[prev] == num)
            return prev;

        return -1;

    }

}