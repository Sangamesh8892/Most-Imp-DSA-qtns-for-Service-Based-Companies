import java.util.Scanner;

public class Sort_a_string {
    public static void main(String[] args){
        //We will do bubble sort
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);

        for(int i=0;i<str.length()-1;i++){
            for(int j=0;j<str.length()-1-i;j++){
                if(sb.charAt(j)>sb.charAt(j+1)){
                    char temp=sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(j+1));
                    sb.setCharAt(j+1, temp);
                }
            }
        }

        System.out.println("Sorted string is "+sb);
    }
}
