// package goodquestion;

import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,digit,count=0;
        System.out.println("enter the number:\n");
        num = sc.nextInt();
        // if (num<0)
        // {
        //     num= -num;
        // }
        while (num!=0)
        {
            digit= num%10;
            if (digit %2 !=0)
            {
                count++;
            }
            num/=10;
        }
        // if (count==0)
        // {
        //     count=1;
        // }
        System.out.println("" +count);
        sc.close();
    }
}