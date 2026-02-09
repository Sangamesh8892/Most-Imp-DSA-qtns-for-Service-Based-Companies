import java.util.Scanner;

public class Remove_vowels_from_string {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' 
        || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!isVowel(ch)){
                sb.append(ch);
            }
        }

        System.out.println("Output string is "+sb);
    }
}
