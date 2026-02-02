package Patterns;


// A 
// B C 
// D E F 
// G H I J 
// K L M N O 




import java.util.Scanner;

public class Half_Pyramid_Pattern_with_incrementing_Char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        char ch='A';

        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
