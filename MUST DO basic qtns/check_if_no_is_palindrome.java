import java.util.Scanner;

public class check_if_no_is_palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int org=n; int rev=0;

        while (n>0) {
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }

        if(org==rev){
            System.out.println("No is a palindrome");
           

        }else{
            System.out.println("No is not a palindrome");
        }
    }
}
