public class find_second_smallest {

    public static void findSecondSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                second_smallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<second_smallest && arr[i]!=smallest){
                second_smallest=arr[i];
            }
        }

        System.out.println("Second smallest is "+second_smallest);
    }
    public static void main(String[] args){
        int[] arr={12,23,55,66,77,66,55,4,6,77,43,2};
        findSecondSmallest(arr);
    }
}
