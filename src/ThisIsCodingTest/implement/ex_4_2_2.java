package ThisIsCodingTest.implement;

import java.util.Scanner;

public class ex_4_2_2 {
    public static int tunr_left(int d){
        if(d-1<0){
            return 3;
        }else
        return d-1;
    }

    public static boolean test(int a[]){
        a[0]=1;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();

        int arr[][] = new int[N][M];

        for(int i =0;i<N;i++){
         for(int j =0;j<M;j++){
             arr[i][j]=sc.nextInt();
         }
        }

        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};

       while(true){


       }


    }
}
