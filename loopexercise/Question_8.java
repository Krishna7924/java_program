import java.util.Scanner;

public class Question_8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,num;
        System.out.println("enter the no.: ");
        num = sc.nextInt();
        for (int i = 1; i < num; i+= 2)
        {
            System.out.println("" +i);
            sum=sum+i;
        }
        System.out.println("sum of odd number " +sum);
        sc.close();
    }
}