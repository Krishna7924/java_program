import java.util.Scanner;

public class IfElse_13 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.println("enter the temperature:\n");
        temp = sc.nextInt();
        if (temp<=0)
        {
            System.out.println("freezing weather");
        }
        else if (temp>0 && temp<=10)
        {
            System.out.println("very cold weather");
        }
        else if (temp>10 && temp<=20)
        {
            System.out.println("cold weather");
        }
        else if (temp>20 && temp<=30)
        {
            System.out.println("noramal in temp");
        }
        else if (temp>30 && temp<=40)
        {
            System.out.println("its hot");
        }
        else if (temp>40)
        {
            System.out.println("its very hot");
        }
        sc.close();
    }
}