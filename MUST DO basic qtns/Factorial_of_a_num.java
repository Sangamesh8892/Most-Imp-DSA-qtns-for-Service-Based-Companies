import java.util.Scanner;

public class Factorial_of_a_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();

        int mul=1;

        for(int i=1;i<=n;i++){
            mul=mul*i;
        }

        System.out.println("The factorial of no is "+mul);
        
    }
    
}
