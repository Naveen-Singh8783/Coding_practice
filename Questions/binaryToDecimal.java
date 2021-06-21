import java.util.*;
import java.lang.*;

class binaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter binary number:");
        int binary_num = sc.nextInt();
        int num = 0;
        int base = 1;

        while(binary_num>0){
            int last_digit = binary_num%10;
            binary_num = binary_num/10;

            num = num + (last_digit * base);
            base = base * 2;
            
        }

        System.out.println("Decimal value is "+num);
    }
}