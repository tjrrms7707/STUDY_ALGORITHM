package ThisIsCodingTest.greedy;

import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int K = sc.nextByte();

        int res = 0;

        //1.두가지 방식을 차례대로 진행하는 방식
        //코드는 짧지만 진행시간은 더 길것으로 예상된다.
    /*    while(N!=1){
        N = (N%K==0)?N/K : N-1;
        res++;
        }*/

        //2.진행방식을 간소화 하는 방식\
        while(true){

            int target = (N/K)*K;
            //결과값이 K보다 작다면 모두 빼서 1을 만들어야 하므로 루프문 탈출
            if(target<K){
                res+= N  - 1;
                break;
            }else{
                res+=N-target+1;
                N=target/K;
            }
        }

        System.out.println(res);

    }
}
