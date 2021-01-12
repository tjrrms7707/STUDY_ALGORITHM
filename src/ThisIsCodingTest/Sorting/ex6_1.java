package ThisIsCodingTest.Sorting;

public class ex6_1 {
    //선택정렬
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for(int i =0;i<arr.length;i++){

            int i_val_min = i;

            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[i_val_min]){
                        i_val_min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[i_val_min];
            arr[i_val_min] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
