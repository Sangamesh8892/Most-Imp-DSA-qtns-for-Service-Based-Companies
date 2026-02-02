package Patterns;

// *****
//  ****
//   ***
//    **
//     *


import java.util.Scanner;

public class rotated_and_inverted_Half_pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            //spaces
            for(int space=1;space<=(line-1);space++){
                System.out.print(" ");
            }
            //star
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }

            System.out.println(); //next line
        }
    }
}
