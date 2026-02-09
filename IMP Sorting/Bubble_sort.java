

public class Bubble_sort {

    public static void bubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,11,9,110,0,3,5,1,4,5,55,12,4};
        bubbleSort(arr);
        
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
