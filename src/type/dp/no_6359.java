package type.dp;

import java.util.Scanner;

public class no_6359 {

    //n보다 작은 수의 약수의 갯수가 짝,홀 구분
    public static int measure(int n){
        int result = 0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                result++;
            }
        }
        return result%2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i =0;i<t;i++){
            int n =sc.nextInt();
            int result = 0;
            for(int j =1 ;j<=n;j++){
                result = result +measure(j);
            }
            System.out.println(result);
        }

    }
}
