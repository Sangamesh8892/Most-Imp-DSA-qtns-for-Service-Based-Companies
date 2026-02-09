public class Max_sum_subArray_BruteForce {
    public static void main(String[] args){
        int[] arr={1,4,5,6,7};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){ //For each sub array
                for(int k=i;k<=j;k++){ //For calculating sum of each subArray
                    sum+=arr[k];
                }
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                    sum=0;
                
            }
        }

        System.out.println("Max sum of sub array is "+maxSum);
    }
}
