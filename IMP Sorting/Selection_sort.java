
public class Selection_sort {

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int minPos=i; //assume it as smallest

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j; //find min pos in unsorted array
                }

                //Now swap the arr[i] with arr[minPos]
                int temp=arr[i];
                arr[i]=arr[minPos];
                arr[minPos]=temp;
            }
        }


    } 
    public static void main(String[] args){
        int[] arr={45,2,33,56,11,67,13,67,3};
        selectionSort(arr);

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
