package ThisIsCodingTest.Questions;

import java.util.Scanner;

public class q16 {
    public static int N , M , result;
    public static int map[][];
    public static int TempMap[][];

    public static int dx[] ={0,0,1,-1};
    public static int dy[] ={1,-1,0,0};

    public static void virus(int x , int y){
        for(int i =0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >=0 && nx <N && ny >=0 && ny <M){
                if(TempMap[nx][ny]==0){
                    TempMap[nx][ny] = 2;
                    virus(nx,ny);
                }
            }
        }

    }

    public static int getScore(){
        int score = 0;
        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
                if(TempMap[i][j] == 0){
                    score++;
                }
            }
        }
        return score;
    }
    public static void dfs(int count){
        if(count == 3){
            for(int i =0;i<N;i++) {
                for (int j = 0; j < M; j++) {
                    TempMap[i][j] = map[i][j];
                }
            }

            for(int i =0;i<N;i++) {
                for (int j = 0; j < M; j++) {
                        if(TempMap[i][j] == 2){
                            virus(i,j);
                        }
                }

            }

           result = Math.max(result,getScore());
            return;
        }

        for(int i =0;i<N;i++){
            for(int j = 0;j<M;j++){
                if(map[i][j]==0){
                    count++;
                    map[i][j] = 1;
                    dfs(count);
                    map[i][j] =0;
                    count--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        TempMap = new int[N][M];

        for(int i =0;i<N;i++){
            for(int j = 0;j<M;j++){
             map[i][j] = sc.nextInt();
            }
        }

        dfs(0);
        System.out.println(result);



    }
}
