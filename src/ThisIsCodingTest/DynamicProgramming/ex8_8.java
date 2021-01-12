package ThisIsCodingTest.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex8_8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        int list[] = new int[N];

        for(int i =0; i<N;i++){
            list[i] = sc.nextInt();
        }

        // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
        int[] d = new int[M + 1];
        Arrays.fill(d, 10001);

        //다이나믹 프로그래밍
        d[0] = 0;

        for(int i = 0;i<N;i++){

            for(int j=list[i];j<=M;j++){
                if(d[j-list[i]]!=10001){
                    d[j] = Math.min(d[j],d[j-list[i]]+1);
                }
            }
        }

        if (d[M] == 10001) { // 최종적으로 M원을 만드는 방법이 없는 경우
            System.out.println(-1);
        }
        else {
            System.out.println(d[M]);
        }
    }
}
