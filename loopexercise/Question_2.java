// package loopexercise;

import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("" +i);
            sum=sum+i;
            
        }
        System.out.println("the sum is " +sum);
        sc.close();
    }
}