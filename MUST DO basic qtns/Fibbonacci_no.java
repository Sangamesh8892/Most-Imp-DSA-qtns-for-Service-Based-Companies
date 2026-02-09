import java.util.Scanner;

public class Fibbonacci_no {
    public static int Fibbonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fibbonacci(n-1)+Fibbonacci(n-2);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();

        int ans=Fibbonacci(n);

        System.out.println("The fibbonacci of Num is "+ans);
    }
}
