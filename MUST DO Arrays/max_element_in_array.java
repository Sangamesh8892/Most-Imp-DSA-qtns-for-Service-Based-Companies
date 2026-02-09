
public class max_element_in_array {
    public static void findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element is "+max);
    }

    public static void main(String[] args){
        int[] arr={123,13,535,6,46,12421,6,46,7,47,112};
        findMax(arr);
    }
}
