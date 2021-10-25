
import java.util.*;

class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Nth place of series:");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Fabonacci series till Nth place:");
        System.out.print("0 ");
        for(int i=1;i<num;i++){
            
            System.out.print(second+" ");
            int temp = first;
            first = second;
            second = temp + second;
            
            
        }
    }
}