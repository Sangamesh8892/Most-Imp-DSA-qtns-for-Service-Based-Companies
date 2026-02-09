

public class min_element {
    
    public static void findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Min value is "+min);
    }
    public static void main(String[] args){
        int[] arr={12,34,5,66,4,6,7,3,3,31,3,46};
        findMin(arr);
    }
}
