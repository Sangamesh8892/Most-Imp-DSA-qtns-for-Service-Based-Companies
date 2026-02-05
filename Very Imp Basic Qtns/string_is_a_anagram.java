import java.util.Scanner;

public class string_is_a_anagram {

    public static String sortString(String str){
        StringBuilder sb=new StringBuilder(str);

        //bubble sort
        for(int i=0;i<sb.length()-1;i++){
            for(int j=0;j<sb.length()-1-i;j++){
                if(sb.charAt(j)>sb.charAt(j+1)){
                    char temp=sb.charAt(j);
                    sb.setCharAt(j,sb.charAt(j+1));
                    sb.setCharAt(j+1, temp);
                }
            }
        }

        return sb.toString();
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string one");
        String str1=sc.next();
        str1.toLowerCase();
        System.out.println("Enter String two");
        String str2=sc.next();
        str2.toLowerCase();

        String sorted_str1=sortString(str1);
        String sorted_str2=sortString(str2);

        if(sorted_str1.equals(sorted_str2)){
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("Two strings are not anagrams");
        }

    }
}
