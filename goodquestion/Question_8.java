import java.util.Scanner;

public class Question_8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,n,d,result;
        System.out.println("enter the number a,n,d:");
        a = sc.nextInt(); 
        n = sc.nextInt();
        d = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            result=a+i*d;
            System.out.println("" +result);
        }
        sc.close();
    }
}