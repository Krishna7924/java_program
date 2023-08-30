// package loopexercise;

import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        double avg;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("" +i);
            sum=sum+i;
        }
        avg=sum/10.00;
        System.out.println("sum of 10 no. is " +sum);
        System.out.println("average is " +avg);
        sc.close();
    }
}