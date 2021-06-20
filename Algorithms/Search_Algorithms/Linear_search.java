import java.util.*;

class Linear_search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,7,9,10};
        boolean check = true;

        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

        System.out.println("\nPlease enter the number to search in array:");
        int num = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(num == arr[i]){
                System.out.println(num+" is found at index "+i);
                check = false;
            }
                
        }

        if(check)
            System.out.println(num+" is not found in array.");

    }
}