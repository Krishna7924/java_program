import java.util.Scanner;

public class simple_interest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p,r,t,result;
        System.out.println("enter the value of p,r,t");
        r = sc.nextFloat();
        p = sc.nextFloat();
        t = sc.nextFloat();

        result=p*r*t/100.0f;
        System.out.println("simple interest " + result);
        sc.close();
        
    }
}