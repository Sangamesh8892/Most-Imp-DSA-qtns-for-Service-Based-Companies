import java.util.HashSet;

public class remove_duplicates_in_an_array {
    public static void removeDuplicate(int[] arr){
        //create new hashset, add done
        HashSet<Integer> set=new HashSet<>();

        for(int n:arr){
            set.add(n);
        }

        System.out.println(set);
    }

    public static void main(String[] args){
        int[] arr={1,33,44,55,45,45,46,47,46,48,22,45,3,144,77,90,1};
        removeDuplicate(arr);
    }
}
