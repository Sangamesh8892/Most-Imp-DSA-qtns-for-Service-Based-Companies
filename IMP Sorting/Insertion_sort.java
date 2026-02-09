

public class Insertion_sort {

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){ //i=1 is because consider first element is already sorted

            int curr=arr[i]; //starting element
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) { //shift bigger elements to right
                arr[prev+1]=arr[prev];
                prev--;
            }

            //now assign
            arr[prev+1]=curr;

        }
    }

    public static void main(String[] args){
        int[] arr={123,4,5,123,56,12,2};
        insertionSort(arr);

        for(int n:arr){
            System.out.print(n+" ");
        }
    }

}
