package Patterns;



// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter half butterfly height");
        int n=sc.nextInt();

        //first half
        for(int line=1;line<=n;line++){
            //star
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            //space
            for(int space=1;space<=2*(n-line);space++){
                System.out.print(" ");
            }
            //star
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
            //second half
    for(int line=n;line>=0;line--){
         //star
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            //space
            for(int space=1;space<=2*(n-line);space++){
                System.out.print(" ");
            }
            //star
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
    }
    }

}
