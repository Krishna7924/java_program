import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,result,sum=0;
        System.out.println("enter the value:\n");
        num = sc.nextInt();
        // if (num<0)
        // {
        //     num= -num;
        // }
        while (num !=0)
        {
            result=num%10;
            if (result %2==0)
            {
                sum=sum+result;
            }
            num/=10;
        }
        // if (count==0)
        // {
        //     count=1;
        // }
        System.out.println("" +sum);
        sc.close();
    }
}