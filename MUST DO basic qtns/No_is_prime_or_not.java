import java.util.Scanner;

public class No_is_prime_or_not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();

        boolean isPrime=true;

        if(n==1){
            isPrime=false;
        }else if(n==2){
            isPrime=true;
        }else{
            for(int i=2;i<=n-1;i++){ //this can be from 2 to sqrt(n) too
                if(n%i==0){
                    isPrime=false;
                }
            }
        }

        if(isPrime){
            System.out.println("No is a prime no");
        }else{
            System.out.println("No is not a prime");
        }
    }
}