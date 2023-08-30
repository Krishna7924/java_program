// package goodquestion;

import java.util.Scanner;

public class Question_1 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num,result=1,i;
        System.out.println("enter the value:\n");
        num = sc.nextInt();
        for ( i = num; i > 0; i--)
        {
            result=result*i;
        }
        System.out.println("" +result);
        sc.close();
    }
}
