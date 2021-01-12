package ThisIsCodingTest.DynamicProgramming;

public class ex8_2 {

    //한 번 계산된 결과를 메모이제이션(Memoiztion)
    public static long[] d = new long[100];

    //피보자치 함수를 재귀함수로 구현
    public static long fibo(int x){
        //종료조건 (1 혹은 2 일때 1을 반환
    if(x == 1 || x == 2 ){
        return 1;
    }
    //이미 계산한 적 있는 문제라면 그대로 반환
    if(d[x] != 0){
        return d[x];
    }

    //아직 계산하지 않은 문제라면 점화식에 따라 피보나치 결과 반환
        d[x] = fibo(x-1) + fibo(x-2);
        return d[x];
    }

    public static void main(String[] args) {

        System.out.println(fibo(50));
    }
}
