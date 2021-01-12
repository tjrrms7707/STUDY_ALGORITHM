package ThisIsCodingTest.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int arr[] = new int[5];



        for(int i =0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);



        int x = M/(K+1);
        int y = M%(K+1);

        System.out.println(arr[N-1]
                *(K*x+y)+arr[N-2]*x);
    }
}
