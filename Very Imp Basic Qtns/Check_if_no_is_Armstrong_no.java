import java.util.Scanner;

public class Check_if_no_is_Armstrong_no{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No");
        int n=sc.nextInt();
        int org=n;
        int sum=0;
       while (n>0) {
            int lastDigit=n%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            n=n/10;            
        }

        if (sum==org) {
            System.out.println("No is a Armstrong no");
        }else{
            System.out.println("No is not a Armstrong No");
        }
    }
}