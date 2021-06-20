import java.util.*;
import java.lang.*;

class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check:");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();

        int temp = num;
        int sum = 0;
        while(temp != 0){
            int n = temp%10;
            temp = temp/10;

            sum =(int)( sum +  Math.pow(n,length));
        }

        if(sum == num)
            System.out.println(num+" is a armstrong number.");
        else
            System.out.println(num+" is not a armstrong number.");

    }
}