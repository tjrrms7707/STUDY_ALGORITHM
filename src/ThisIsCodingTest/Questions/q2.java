package ThisIsCodingTest.Questions;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        int arr[] = new int[line.length()];

        for(int i =0;i<arr.length;i++){
            arr[i]=line.charAt(i)-'0';
        }

        if(arr.length ==1){
            System.out.println(arr[0]);
        }else{

            int max = arr[0];
            for(int i =1;i<arr.length;i++){
                max = Math.max(max + arr[i],max * arr[i]);
            }
            System.out.println(max);
        }
    }
}
