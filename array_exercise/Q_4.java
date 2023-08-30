import java.util.Scanner;

public class Q_4 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the length: ");
        n =sc.nextInt();
        int arry1[]=new int[n];
        int arry2[]=new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("array1["+i+"]=");
            arry1[i]=sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++)
        {
            arry2[i]=arry1[i];
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println("array2["+i+"]= "+arry2[i]);
        }
        
        System.out.print("\n");
        
    }
}