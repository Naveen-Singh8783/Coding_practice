import java.util.*;

class decimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int[] binary = new int[32];

        int i=0;
        while(num !=0){
            int rem = num%2;
            num = num/2;
            binary[i] = rem;
            i++;
        }
        System.out.print("Binary conversion is: ");
        for(int j=i-1;j>=0;j--)
            System.out.print(binary[j]);
    }
}