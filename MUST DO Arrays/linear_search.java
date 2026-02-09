
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();

        int[] arr=new int[n];
        
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter key to search");
        int key=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if (arr[i]==key) {
                System.out.println("Key found at index "+i);
                return;
            }
        }
        
        System.out.println("Key not found");
    }
}
