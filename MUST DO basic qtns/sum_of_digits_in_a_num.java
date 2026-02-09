import java.util.Scanner;

public class sum_of_digits_in_a_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();

        int sum=0;
        while (n>0) {
            int lastDigit=n%10;
             sum+=lastDigit;
             n/=10;
        }

        System.out.println("Sum of no is "+sum);
    }
}
