package Patterns;

// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

import java.util.Scanner;
public class Square_pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            //now what to print in each row
            for(int star=1;star<=n;star++){
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
    }
}