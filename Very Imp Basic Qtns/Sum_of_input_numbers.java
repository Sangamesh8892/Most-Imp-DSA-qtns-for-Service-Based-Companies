import java.util.Scanner;

public class Sum_of_input_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();

        int lastDigit; int rev=0; int sum=0;

        while (n>0) {
            lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }

        System.out.println("The sum of input no is "+sum);
    }
}
