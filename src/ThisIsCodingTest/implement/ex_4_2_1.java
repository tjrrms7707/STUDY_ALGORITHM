package ThisIsCodingTest.implement;

import java.util.Scanner;

public class ex_4_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int arrLength = 8;
        String loc = sc.nextLine();

        int x =Integer.parseInt(loc.substring(1))-1;
        //int x =loc.charAt(1)-'0';
        int y =loc.charAt(0)-97;
        //int y =loc.charAt(0)-'a';


        int dx[] ={1,-1,1,-1,2,2,-2,-2};
        int dy[] ={2,2,-2,-2,1,-1,1,-1};

        int cnt = 0;
        for(int i =0;i<8;i++){
            int a = 0, b = 0;
            a=x+dx[i];
            b=y+dy[i];

            if(a<0||b<0||a>arrLength||b>arrLength){
                continue;
            }
            cnt++;

        }
        System.out.println(cnt);
    }
}
