package type.dp;

import java.util.Scanner;

public class no_9507 {

    public static long arr[] = new long[69];

    public static long fibonacci(int n){
        if(arr[n]!=0)
            return arr[n];
        if(n <2) {
            arr[n] = 1;
        }
        if(n ==2){
            arr[n]=2;
        }
        if(n ==3 ){
            arr[n]=4;
        }
        if(n>3){
            arr[n] = fibonacci(n-1) +fibonacci(n-2)+fibonacci(n-3)+fibonacci(n-4);
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0;i<t;i++){
            System.out.println(fibonacci(sc.nextInt()));
        }

    }
}
