package ThisIsCodingTest.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q15 {
    //도시의 갯수
    public static int N;
    //도로의 갯수
    public static int M;
    //거리정보 K
    public static int K;
    //출발 도시의 정보 X
    public static int X;
    //방문 여부
    public static int visited[];
    //도시 그래프
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void bfs(int start,int end){


        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(start);
        visited[start] =0;
        while(!q.isEmpty()){
            int x = q.poll();
            for(int i =0;i<graph.get(x).size();i++){
                    int y = graph.get(x).get(i);
                    if(visited[y] == -1 ){
                        q.offer(y);
                        visited[y] = visited[x]+1;
                    }
            }
        }
    }





    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextInt();

        visited = new int[300001];

        for(int i =0;i<=N;i++){
            graph.add(new ArrayList<Integer>());
            visited[i]=-1;
        }

        for(int i =0;i<M;i++){
            graph.get(sc.nextInt()).add(sc.nextInt());
        }


       bfs(X,2);
        boolean check = false;

        for(int i =0;i<=N;i++){
            if(visited[i]==K){
                System.out.println(i+" ");
                check = true;
            }
        }
        if(check == false){
            System.out.println(-1);
        }
    }

}
