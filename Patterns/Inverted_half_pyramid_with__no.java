package Patterns;

// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 



import java.util.Scanner;

public class Inverted_half_pyramid_with__no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print(star+" ");
            }
            System.out.println();
        }
    }
}
