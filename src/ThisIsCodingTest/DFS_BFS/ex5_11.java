package ThisIsCodingTest.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class ex5_11 {
    public static int dx[]={0,0,1,-1};
    public static int dy[]={1,-1,0,0};


    public static int N,M;
    public static int graph[][];


    public static int bfs(int start_x, int start_y){

        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(start_x,start_y));

        while (!queue.isEmpty()){
            Node node = queue.poll();

            int x = node.getX();
            int y = node.getY();

            for(int i=0 ;i<dx.length;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                //미로 안에 공간을 벗어나는 경우
                if(nx<0||nx>=N ||ny<0||ny>=M) continue;

                //처음 방문한 노드가 아닐 경우
                if(graph[nx][ny] == 0) continue;

                //처음 방문한 노드일 경우
                if(graph[nx][ny]==1){
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new Node(nx,ny));
                }
            }
        }

        return graph[N-1][M-1];

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //정수 받기
        N = sc.nextInt();
        M = sc.nextInt();

        sc.nextLine();

        //그래프 선언
        graph = new int[N][M];

        //그래프 값 받기
        for(int i =0;i<N;i++){
            String line = sc.nextLine();
            for(int j=0;j<M;j++){
                graph[i][j]=line.charAt(j)-'0';
            }
        }

        System.out.println(bfs(0,0));





    }
}
