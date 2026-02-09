public class KODANES_Algo_Max_Sum_subarray {
    public static void main(String[] args){

        int[] arr={1,-1,-3,12,-4,-30,1,-100,7,-35};
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];

            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }

        System.out.println("Max sum of sub array "+maxSum);
    }
}
