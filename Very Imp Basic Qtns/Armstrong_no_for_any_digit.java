import java.util.Scanner;

public class Armstrong_no_for_any_digit {
    public static int power(int x,int y){
        //Power cal function
        if(y==0){
            return 1;
        }
        if(y%2==0){
            return power(x, y/2)*power(x, y/2);
        }
        return x*power(x, y/2)*power(x, y/2);
    }

    public static int count(int n){
        //Function for counting no of digits in No
        int c=0;
        while (n>0) {
            c++;
            n=n/10;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();

        int org=n;
        int sum=0;
        int countOfDigits=count(n);

        while (n>0) {
            int lastDigit=n%10;
            sum=sum+power(lastDigit,countOfDigits);
            n=n/10;

        }

        if (org==sum) {
            System.out.println("Armstrong No");
        }else{
            System.out.println("Not a armstrong no");
        }
    }
}


