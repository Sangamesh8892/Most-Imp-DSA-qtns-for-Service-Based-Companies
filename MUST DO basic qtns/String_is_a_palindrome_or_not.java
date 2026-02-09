import java.util.Scanner;

public class String_is_a_palindrome_or_not{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        boolean isPalindrome=true;

        for(int i=0;i<str.length()/2;i++){
            int j=str.length()-1-i;

            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }


}