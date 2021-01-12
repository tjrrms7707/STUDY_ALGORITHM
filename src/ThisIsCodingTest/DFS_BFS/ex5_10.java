package ThisIsCodingTest.DFS_BFS;

import java.util.Scanner;

public class ex5_10 {
    public static int dx[] = {0,0,1,-1};
    public static int dy[] = {1,-1,0,0};



    public static void bfs(int x , int y ,int arr[][]){
        arr[x][y] = 1;


        for(int i =0;i<4;i++){
            if(x+dx[i]<arr.length && x+dx[i]>=0 && y+dy[i]>=0 && y+dy[i]<arr[0].length){
                if(arr[x+dx[i]][y+dy[i]]==0){
                    bfs(x+dx[i],y+dy[i],arr);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int map[][] = new int[N][M];
        sc.nextLine();
        for(int i =0;i<N;i++){
         String temp = sc.nextLine();

         for(int j = 0 ;j<M;j++){
            map[i][j] = Integer.parseInt(temp.substring(j,j+1));
            //map[i][j] = temp.charAt[j]-'0';
         }

        }

        int result = 0;
        for(int i =0;i<N;i++){
            for(int j = 0; j<M;j++){
                if(map[i][j]==0){
                    bfs(i,j,map);
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}

