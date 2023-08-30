import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,min=0;
        System.out.println("enter the size of arry:");
        n= sc.nextInt();
        int arry []= new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++)
        {
            System.out.print("array["+i+"]: ");
            arry[i]=sc.nextInt();
        }
        min= arry [0];
        for (int i = 0; i < n; i++)
        {
            if ( arry[i]<min)
            {
                min= arry[i];
            }
        }
        System.out.println("minimum is " +min);
        sc.close();
    }
}