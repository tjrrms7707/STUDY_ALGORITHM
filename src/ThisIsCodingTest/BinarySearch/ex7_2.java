package ThisIsCodingTest.BinarySearch;

import java.util.Scanner;

public class ex7_2 {
    public static int BinarySearch(int start,int end, int arr[],int target){
        int mid =(start+end)/2;
        if(start>end) return -1;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid]>target){
            return BinarySearch(start,mid-1,arr,target);
        }else{
           return BinarySearch(mid+1,end,arr,target);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr[] =new int[N];

        for(int i =0;i<N;i++){
            arr[i] = sc.nextInt();
        }


        System.out.println(BinarySearch(0,N-1,arr,K)+1);


    }
}
