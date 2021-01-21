package ThisIsCodingTest.Questions;

import java.util.Scanner;

public class q18 {
    public static void bind(String q){

        int num1 = 0;
        int num2 = 0;
        String u,v;
        int index = 0;
        for(int i = 0;i<q.length();i++){
            if(q.substring(i,i+1).equals("(")){
                num1++;
            }else{
                num2++;
            }
                if(num1 ==num2){
                   index = i+1;
                    break;
                }

        }
        u = q.substring(0,index);
        v = q.substring(index,q.length());
        System.out.println(u);
        System.out.println(v);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String q = sc.nextLine();

        q = q.substring(1,q.length()-1);


        bind(q);

    }
}
