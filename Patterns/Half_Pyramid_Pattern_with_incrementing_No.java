package Patterns;

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

import java.util.Scanner;
public class Half_Pyramid_Pattern_with_incrementing_No {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of rows");
        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print(star+" ");
            }
            System.out.println();
        }

    }
}
