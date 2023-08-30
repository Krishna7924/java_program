// package goodquestion;

import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,n1=0,n2=1,result;
        System.out.println("enter the number:");
        num = sc.nextInt();

        System.out.println("" +n1+ "" +n2);
        for (int i = 1; i < num-1; i++)
        {
        result=n1+n2;
        System.out.println("" +result);
        n1 = n2;
        n2 = result;
        }
        sc.close();
    }
}