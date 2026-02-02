package Patterns;

//     *
//    ***
//   *****
//  *******
// *********

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of lines");
        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            //space
            for(int space=1;space<=n-line;space++){
                System.out.print(" ");
            }
            //star
            for(int star=1;star<=2*line-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
