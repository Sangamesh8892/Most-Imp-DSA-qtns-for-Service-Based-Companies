package Patterns;

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

import java.util.Scanner;
public class Inverted_Right_Angled_Triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of rows");
        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
