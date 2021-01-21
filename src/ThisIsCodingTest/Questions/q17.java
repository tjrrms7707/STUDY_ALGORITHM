package ThisIsCodingTest.Questions;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    private int x;
    private int y;
    private int second;

    public Node(int x,int y,int second){
        this.x = x;
        this.y = y;
        this.second = second;

    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getSecond(){return this.second;}
}

public class q17 {
    public static int N,K,S,X,Y;
    public static int map[][];


    public static int dx[] = {0,0,1,-1};
    public static int dy[] = {1,-1,0,0};


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //첫 번째 줄 값 받기
        N = sc.nextInt();
        K = sc.nextInt();

        //시험관 생성
        map = new int[N][N];

        //시험관 바이러스 값 받기
        for(int i = 0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j] = sc.nextInt();
            }
        }

        //S,X,Y 받기
        S = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        Queue<Node> q = new LinkedList<>();


        for(int k =1;k<=K;k++){
            for(int i = 0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(map[i][j]==k){
                        q.add(new Node(i,j,0));
                    }
                }
            }
        }


        while(!q.isEmpty()){
            Node node = q.poll();

            int x = node.getX();
            int y = node.getY();
            int second = node.getSecond();
            if(second == S){
                break;
            }

            for(int i =0;i<dx.length;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >=0 && nx <N && ny >=0 && ny<N ){
                    if(map[nx][ny] ==0){
                        map[nx][ny] = map[x][y];
                        q.add(new Node(nx,ny,++second));
                        //q.add(new Node(nx,ny,second++));

                    }
                }
            }

        }

        System.out.println(map[X-1][Y-1]);

    }

}
