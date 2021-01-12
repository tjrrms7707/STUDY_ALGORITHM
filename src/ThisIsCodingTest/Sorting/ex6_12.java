package ThisIsCodingTest.Sorting;

import java.util.Arrays;
import java.util.Scanner;

 public class ex6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //배열의 길이
        int N = sc.nextInt();
        //바꿀 수 있는 횟수
        int K = sc.nextInt();

        int arr1[] = new int[N];
        int arr2[] = new int[N];

        for(int i =0;i<N;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i =0;i<N;i++){
            arr2[i] = sc.nextInt();
        }


        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int total = 0;
        for(int i=0;i<N;i++){
            if(i<K){
                total +=arr2[N-1-i];
            }else{
                total +=arr1[i];
            }
        }
        System.out.println(total);

    }
}
