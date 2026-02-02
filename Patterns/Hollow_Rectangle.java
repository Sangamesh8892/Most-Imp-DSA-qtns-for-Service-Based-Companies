package Patterns;

// Enter no of rows
// 5
// Enter no of cols
// 7
// * * * * * * * 
// *           * 
// *           * 
// *           * 
// * * * * * * * 


import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no of cols");
        int cols=sc.nextInt();

        for(int line=1;line<=rows;line++){
            for(int star=1;star<=cols;star++){
                if(line==1 || line== rows || star==1 || star==cols){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
