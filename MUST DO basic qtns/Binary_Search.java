public class Binary_Search {

    public static int binarySearch(int[] arr,int key){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=(start+end)/2;
            if (key==arr[mid]) {
                return mid;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,89,101};
        int key=89;
        int idx=binarySearch(arr,key);
        if(idx<0){
            System.out.println("Key not found");
        }else{
            System.out.println("Key Found at idx "+idx);
        }
    }
}
