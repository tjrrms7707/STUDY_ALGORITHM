package ThisIsCodingTest.implement;

import java.util.Scanner;

public class ex_4_1_1_sub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        sc.nextLine();

        String[] line = sc.nextLine().split(" ");

        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        char[] moveType = {'R','L','D','U'};

        int nx=1,ny=1;


        for(int i =0;i<line.length;i++){
            for(int j=0;j<moveType.length;j++){
               int a =0 ,b=0;
                if(line[i].charAt(0)==moveType[j]){
                    a = nx+dx[j];
                    b = ny+dy[j];
                }
                if(a<1 || a>N ||b<1||b>N) continue;
                nx = a;
                ny = b;
            }
        }
        System.out.println(nx+" "+ny);
    }
}
