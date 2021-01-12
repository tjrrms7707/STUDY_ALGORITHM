package ThisIsCodingTest.DynamicProgramming;

import java.util.Scanner;

public class ex8_7 {
    public static int res[] = new int[1001];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        res[1] = 1;
        res[2] = 3;

        for(int i =3;i<=N;i++){
            res[i] = res[i-2]*2 + res[i-1];
        }

        System.out.println(res[N]%796796);
    }
}
