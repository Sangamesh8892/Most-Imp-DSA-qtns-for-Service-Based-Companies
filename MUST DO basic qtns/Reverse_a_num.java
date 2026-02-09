import java.util.Scanner;

// Enter a num
// 567
// 765

public class Reverse_a_num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();

        int lastDigit; int rev=0;

        while (n>0) {
            lastDigit=n%10;
            n=n/10;
            rev=(rev*10)+lastDigit;
        }
        System.out.println(rev);
    }
}