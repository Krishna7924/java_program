import java.util.Scanner;

public class IfElse_19 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit;
        float amount=0,surcharge;
        System.out.println("enter unit consumed :");
        unit = sc.nextInt();

        if (unit >0 && unit<200)
        {
            amount=unit*1.20f;
        }
        else if (unit>=200 && unit<400)
        {
            amount=unit*1.50f;
        }
        else if (unit>=400 && unit<600)
        {
            amount=unit*1.80f;
        }
        else if (unit>=600 )
        {
            amount=unit*2.0f;
        }
        else
        {
            System.out.println("invalid unit ");
        }
        
        if (amount>=400)
        {
            surcharge=amount*15.0f/100.0f;
            System.out.println("added surcharge @15%% : " + surcharge);
            amount=amount+surcharge;
        }
        if (amount<100)
        {
            System.out.println("minimum bill of Rs. 100");
            amount=100;
        }
        System.out.println("the final amount is " + amount);
        sc.close();
    }
}