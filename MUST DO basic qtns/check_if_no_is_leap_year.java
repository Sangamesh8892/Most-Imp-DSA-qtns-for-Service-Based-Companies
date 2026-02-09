import java.util.Scanner;

public class check_if_no_is_leap_year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int n=sc.nextInt();

        boolean leap=false;

        if (n%4==0) {
            if (n%100==0) {
                if (n%400==0) {
                    leap=true; //divisible by 4 and 100 then it should be divisible by 400
                }else{
                    leap=false;
                }
            }else{
                leap=true;  //divisible by 4 but no by 100
            }  
        }

        System.out.println(leap);
    }
}
