import java.util.Scanner;

public class remove_duplicates_in_strinng {
    public static void main(String[] args){
        //will work for lowercase
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        boolean[] seen=new boolean[256];
        String newstr="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!seen[ch]){
                newstr +=ch;
                seen[ch]=true;
            }
        }

        System.out.println(newstr);
    }
}
