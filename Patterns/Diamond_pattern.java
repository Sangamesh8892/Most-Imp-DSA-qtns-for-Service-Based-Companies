package Patterns;

// Enter no of rows(half diamond height)
// 5
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *



import java.util.Scanner;

public class Diamond_pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows(half diamond height)");
        int n=sc.nextInt();

        //first halfr
        for(int line=1;line<=n;line++){
            //spaces
            for(int space=1;space<=n-line;space++){
                System.out.print(" ");
            }
            //star
            for(int star=1;star<=2*line-1;star++){
                System.out.print("*");
            }
            //next line
            System.out.println();
        }
        //second half(inverted)
        for(int line=n;line>=0;line--){
            //spaces
            for(int space=1;space<=n-line;space++){
                System.out.print(" ");
            }
            //star
            for(int star=1;star<=2*line-1;star++){
                System.out.print("*");
            }
            //next line
            System.out.println();
        }
    }

}