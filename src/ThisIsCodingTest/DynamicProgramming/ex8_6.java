package ThisIsCodingTest.DynamicProgramming;

import java.util.Scanner;

public class ex8_6 {
    public static int Max[] = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int list[] = new int[N];

        for(int i=0;i<N;i++ ){
            list[i]=sc.nextInt();
        }


        //첫번째와 두번째 정의
        Max[0] = list[0];
        Max[1] = Math.max(list[0],list[1]);

        for(int i =2;i<N;i++){
            Max[i] = Math.max(Max[i-1],list[i]+Max[i-2]);
        }

        System.out.println(Max[N-1]);
    }
}
