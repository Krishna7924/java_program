import java.util.Scanner;

public class NS_15_2nd 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row(multiplication of 4)");
        int r=sc.nextInt();
        // int rem=r/4;
        int c=r;
        int space=r-1;
        for (int i = 1; i <=r; i++) 
        {
            for (int j = 1; j <= c; j++) 
            {

                if(j<=space)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            
            if (i%4==0) 
            {
                space=space+1;
                
            }
            else
            {
                space=space-1;
                
            }
            System.out.println();
        }
       for (int i = 0; i < 4; i++) 
       {
        for (int j = 0; j < 8; j++) 
        {
            if(j<4)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("* ");
            }
        }
        System.out.println();
       }
    sc.close();
    }
}