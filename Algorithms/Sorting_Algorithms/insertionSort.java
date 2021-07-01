import java.util.*;

class insertionSort{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        InsertionSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    public static void InsertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

}