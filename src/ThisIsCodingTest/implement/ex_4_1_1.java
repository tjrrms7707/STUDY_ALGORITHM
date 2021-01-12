package ThisIsCodingTest.implement;

import java.util.Scanner;

public class ex_4_1_1 {
    //4_1. 상하좌우(110P)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] move =sc.nextLine().split(" ");


        int x =1 ,y = 1;

        for(int i =0;i<move.length;i++){
            switch (move[i]){
                case "L" :
                    if(y==1){
                        break;
                    }else{
                        y--;
                    }
                    break;
                case "R" :
                    if(y==move.length){
                        break;
                    }else{
                        y++;
                    }
                    break;
                case "U" :
                    if(x==1){
                        break;
                    }else{
                        x--;
                    }
                    break;
                case "D" :
                    if(x==move.length){
                        break;
                    }else{
                        x++;
                    }
                    break;
            }
        }


        System.out.println(x+" "+y);



    }
}
