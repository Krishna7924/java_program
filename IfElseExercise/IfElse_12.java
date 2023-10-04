import java.util.Scanner;

public class IfElse_12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float physic,chemistry,computer_application,total;
        float percentage;
        System.out.println("enter the marks of physic,chemistry,computer application:");
        physic = sc.nextFloat();
        chemistry = sc.nextFloat();
        computer_application = sc.nextFloat();
        total=physic+chemistry+computer_application;
        System.out.println("total = " + total);
        percentage=total/3;
        System.out.println("percent = " + percentage);
        if (percentage>=80 && percentage<=100)
        {
            System.out.println("divison = first");
        }
        else if(percentage>=55 && percentage<80)
        {
            System.out.println("divison = second");
        }
        else if (percentage>=33 && percentage<55)
        {
            System.out.println("divison = third");
        }
        sc.close();
    }
}