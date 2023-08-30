import java.util.Scanner;

/**
 * IfElse_21
 */
public class IfElse_21 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day_number;
        System.out.println(" enter the day number :");
        day_number = sc.nextInt();

        if (day_number==1)
        {
            System.out.println("Monday");
        }
        else if (day_number==2)
        {
            System.out.println("Tuesday");
        }
        else if (day_number==3)
        {
            System.out.println("Wednesday");
        }
        else if (day_number==4)
        {
            System.out.println("Thrusday");
        }
        else if (day_number==5)
        {
            System.out.println("Friday");
        }
        else if (day_number==6)
        {
            System.out.println("Saturday");
        }
        else if (day_number==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("invalid day");
        }
    sc.close();
    }
}