package Patterns;


// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

import java.util.Scanner;

public class floyds_triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        int num=1;

        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
