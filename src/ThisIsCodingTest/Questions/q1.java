package ThisIsCodingTest.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //N값 받기
        int N = sc.nextInt();

        //모험가 공포도 행렬 생성
        int arr[] = new int[N] ;

        //모험가들의 공포도 받기
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        //정렬
        Arrays.sort(arr);

        int i = 0;
        int result = 0;
        int groupNum = 0;

        //최대 그룹 구하기
        while(i!=N){
            groupNum++;
            if(groupNum>=arr[i])
            {
                groupNum = 0;
                result++;
            }
            i++;
        }
        System.out.println(result);
    }
}
