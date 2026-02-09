public class second_largest {
    public static void findSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }

            else if(arr[i]>second_largest && arr[i]!=largest){ 
                second_largest=arr[i];
            }
        }
        System.out.println("Second largest is "+second_largest);
    }

    public static void main(String[] args){
        int[] arr={1,3,4,6,33,46,77,2,4,11,34,33,55,1};
        findSecondLargest(arr);
    }
}
