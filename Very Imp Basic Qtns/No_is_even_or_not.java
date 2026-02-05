import java.util.Scanner;

public class No_is_even_or_not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("Sout no is a even");
        }else{
            System.out.println("No is a odd no");
        }
    }
}
