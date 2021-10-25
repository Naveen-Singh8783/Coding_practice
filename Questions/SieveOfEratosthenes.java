import java.util.*;

class SieveOfEratosthenes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till which require prime series:");
        int N = sc.nextInt();
        boolean[] prime = new boolean[N+1];
        for(int i=0;i<=N;i++)
            prime[i] = true;

        for(int i=2;i*i<=N;i++){

            if(prime[i]){
                for(int j = i+i; j<=N; j+=i){
                    prime[j] = false;
                }
            }
        }

        System.out.println("Prime series till given number is: ");
        for(int i=2;i<=N;i++){
            if(prime[i])
                System.out.print(i+" ");
        }
    }
}