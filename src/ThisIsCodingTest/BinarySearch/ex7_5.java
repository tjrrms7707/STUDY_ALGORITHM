package ThisIsCodingTest.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ex7_5 {

    public static int BinarySearch(int start, int end, int target, int arr[]){
        if(start>end) return -1;

        int mid =(start+end)/2;

        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return BinarySearch(start,mid-1,target,arr);
        }else{
            return BinarySearch(mid+1,end,target,arr);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();

        int list[] = new int[N];

        for(int i =0;i<N;i++){
            list[i] = sc.nextInt();
        }

        //정렬
        Arrays.sort(list);

        int K = sc.nextInt();
        int target[] = new int[K];

            for(int i =0;i<K;i++){
                target[i]=sc.nextInt();
            }

        for(int i =0;i<K;i++){
         if(BinarySearch(0,N-1,target[i],list)==-1){
             System.out.print("no ");}
             else{
             System.out.print("yes ");
             }
        }
    }
}
