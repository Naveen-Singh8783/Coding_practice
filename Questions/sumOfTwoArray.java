import java.util.*;

class sumOfTwoArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array:");
        int size1 = sc.nextInt();
        System.out.println("Enter element in array:");
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++)
            arr1[i] = sc.nextInt();


        System.out.println("Enter the size of 2st array:");
        int size2 = sc.nextInt();
        System.out.println("Enter element in array:");
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++)
            arr2[i] = sc.nextInt();

        int ans = 0;
       
        if(size1 >= size2)
          ans = sumOfTwo(arr1,arr2,size1,size2);
        else
          ans = sumOfTwo(arr1,arr2,size2,size1);

        System.out.println("Answer is: "+ans);
    }

    static int sumOfTwo(int[] arr1,int[] arr2,int n,int m){
        int[] sum = new int[n];
        int i = n-1, j = m-1, k = n-1;
        int carry = 0,ans = 0;

        while(j >= 0){
            if(arr1[i]+arr2[j]+carry > 9){
                sum[k] = (arr1[i]+arr2[j]+carry)%10;
                carry = 1;
            }else{
                sum[k] = arr1[i]+arr2[j]+carry;
                carry = 0;
            }
            k--;
            i--;
            j--;
        }


        while(i >= 0){
            if(arr1[i]+carry > 9){
                sum[k] = (arr1[i]+carry)%10;
                carry = 1;
            }else{
                sum[k] = arr1[i]+carry;
                carry = 0;
            }
            k--;
            i--;
        }

        if(carry > 0)
            ans = 10;

        for(i=0;i<n;i++){
            ans+=sum[i];
            ans*=10;
        }

        return ans/10;
    }
}