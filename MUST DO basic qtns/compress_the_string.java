import java.util.Scanner;

public class compress_the_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        String newstr="";
        int count=1;

        for(int i=0;i<str.length();i++){
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }

            newstr += str.charAt(i);
            if(count>1){
                newstr+=count;
            }
            count=1;
        }

        System.out.println("OP: "+newstr);
    }
}
