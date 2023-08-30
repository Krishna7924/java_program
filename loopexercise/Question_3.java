// package loopexercise;

import java.util.Scanner;

public class Question_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i <= 7; i++) {
            System.out.println("" +i);
            sum=sum+i;
        }
        System.out.println("the sum of natural number upto 7 terms " +sum);
        sc.close();
    }
}