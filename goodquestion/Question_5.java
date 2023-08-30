// package goodquestion;

import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,result=0,count=0;
        System.out.println("enter the value:");
        num = sc.nextInt();
        if (num<0)
        {
            num= -num;
        }
        while (num !=0)
        {
            result=num%10;
            if (result %2==0)
            {
                count++;
            }
            num/=10;
        }
        if (count==0)
        {
            count=1;
        }
        System.out.println("" +result);
        sc.close();
    }
}