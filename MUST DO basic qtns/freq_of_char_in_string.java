import java.util.Scanner;

public class freq_of_char_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        int[] visit=new int[256];
        boolean[] printed=new boolean[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            visit[ch]++;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!printed[ch]){
            System.out.println(str.charAt(i)+" : "+visit[str.charAt(i)]);
            printed[ch]=true;
        }
    }
}
}

