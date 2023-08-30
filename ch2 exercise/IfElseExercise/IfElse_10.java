import java.util.Scanner;

public class IfElse_10 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int maths,chem,phy,total1;
        System.out.println("enter the marks of maths,chem,phy:");
        maths = sc.nextInt();
        chem = sc.nextInt();
        phy = sc.nextInt();
        if (maths >=65 && phy >=55 && chem>=50)
        {
            total1=maths+chem+phy;
            if(total1 >= 10)
            {   
                System.out.println("candidate is capabale for admission");
            }
        }
        else
        {
            System.out.println("candidate is not capabale for admission");
        }
        sc.close();
    }
}