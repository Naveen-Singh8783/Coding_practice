import java.util.*;

class selectionSort{
    public static void main(String[] args){
        int[] arr = {1, 5, 7, 2, 3, 9, 5, 6};
          for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
            
             SelectionSort(arr);

        System.out.println("\nAfter sorting:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void SelectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
    }
}