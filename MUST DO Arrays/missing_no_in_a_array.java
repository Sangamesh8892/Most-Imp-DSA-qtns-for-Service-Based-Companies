public class missing_no_in_a_array {
    public static void missingNum(int[] arr,int n){
        int actualSum=0;
        int expectedSum=(n*(n+1))/2; 

        for(int i=0;i<arr.length;i++){ //loop from 0 to n-1 incase we have given a range only like array of 9 elements
            actualSum+=arr[i];
        }

        int missing=expectedSum-actualSum;
        System.out.println("Missing element is "+missing);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,9}; //8 is missing
        int n=9;

        missingNum(arr, n);
    }
}
