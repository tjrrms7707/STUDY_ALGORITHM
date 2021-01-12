package ThisIsCodingTest.implement;

import java.util.Scanner;

public class ex_4_1_2 {

    public static boolean check(int H,int M,int S){
        if(H%10 ==3 || M/10==3 || M%10==3 || S/10==3 || S%10==3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();

        int cnt = 0;
        for(int i =0;i<H+1;i++){
            for(int j=0;j<60;j++){
                for(int k=0;k<60;k++){
                    if(check(i,j,k)) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
