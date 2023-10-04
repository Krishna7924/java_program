import java.util.Scanner;

public class IfElse_11 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        float plusx,subx,a,b,c;
        System.out.println("enter the a,b,c");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        plusx=(int) ( ((-b) + Math.sqrt(b*b - 4*a*c))/2.0*a) ;
        subx= (int)( ((-b) - Math.sqrt(b*b - 4*a*c))/2.0*a) ;

        System.out.println(" sub x = " + plusx);
        System.out.println(" plus x = " + subx);

        if (subx >=0 && plusx>=0)
        {
            System.out.println(" Both are real numbers \n");
        }
        else if (subx <0 && plusx<0)
        {
            System.out.println(" Both are Imaginory numbers \n");
        }
        else
        {
            System.out.println(" They are complex number ");
            // System.out.println(" There are no solution");
        } 
        sc.close();
    }
}