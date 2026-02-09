public class Move_zero_to_end {
public static void main(String[] args){
    int j=0;

    int[] arr={1,2,0,334,0,11,22,4,67,34,0,22,0,11,0,1,0,22,0,3};

    //step 1: add all non zero element to start
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[j]=arr[i];
            j++;
        }
    }

    //populate remaining length with zero
    while (j<arr.length) {
        arr[j]=0;
        j++;
    }

    for(int n:arr){
        System.out.print(n+" ");
    }
} 
}
