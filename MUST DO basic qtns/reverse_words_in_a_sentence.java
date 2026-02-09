import java.util.Scanner;

public class reverse_words_in_a_sentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder();
        String[] words=str.split(" ");// split and add words to arr based on space

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){  //using this we can add space only till last word
                sb.append(" ");
            }
            
        }

        System.out.println("Reversed sentence is "+'"'+sb+'"');

    }
}
