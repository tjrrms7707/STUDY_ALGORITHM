package ThisIsCodingTest.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int res[] =new int[N];
        // 방법1.배열에 담아서 배열을 오름차순으로 정리해서 작은수를 뽑는 방법
        /*for(int i =0;i<N;i++){
            int temp[] = new int[M];
            for(int j=0;j<M;j++){
                temp[j] =sc.nextInt();
            }
            Arrays.sort(temp);
            res[i]=temp[N-1];
        }*/

        //방법2 배열에 담지 않고 입력 받은 줄에서 가장 작은 수만 찾기
        for(int i =0;i<N;i++){
            int max = 10001;
            for(int j = 0; j<M ; j++){
                int temp = sc.nextInt();
                if(max>temp){
                    max = temp;
                    res[i] = temp;
                }
            }
        }

        Arrays.sort(res);
        System.out.println(res[0]);
    }


}
