import java.util.*;

class QuickSort{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        quickSort(arr, 0, arr.length-1);
        System.out.println("After sorting: ");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){

            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);

        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

       
        int i = low-1;

        for(int j=low;j<=high;j++){

            if(arr[j] < pivot){

                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,high);
        return (i+1);
        
    }

    public static void swap(int[] arr,int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}