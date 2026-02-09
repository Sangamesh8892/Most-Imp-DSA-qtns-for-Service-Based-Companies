import java.util.Scanner;

//145=1!+4!+5!

public class check_if_no_is_strong_no {
    public static int Factorial(int n){
        int mul=1;
        for(int i=1;i<=n;i++){
            mul=mul*i;
        }

        return mul;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();

        int sum=0; int org=n;
        while (n>0) {
            int lastDigit=n%10;
            sum=sum+Factorial(lastDigit);
            n=n/10;
        }

        if (org==sum) {
            System.out.println("Strong No");
        }else{
            System.out.println("not a strong no");
        }
    }
}
