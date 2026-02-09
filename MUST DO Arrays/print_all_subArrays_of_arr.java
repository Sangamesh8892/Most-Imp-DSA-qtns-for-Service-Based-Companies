public class print_all_subArrays_of_arr {
    public static void main(String[] args){
        int[] arr={1,4,5,11,13,13};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
