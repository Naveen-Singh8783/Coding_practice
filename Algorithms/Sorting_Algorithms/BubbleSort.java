import java.util.*;

class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        bubbleSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>=arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}