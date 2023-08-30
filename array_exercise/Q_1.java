import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,max=0;
        System.out.println("enter the size of arry:");
        n= sc.nextInt();
        int arry []= new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++)
        {
            System.out.print("array["+i+"]: ");
            arry[i]=sc.nextInt();
        }
        max= arry [0];
        for (int i = 0; i < n; i++)
        {
            if ( arry[i]>max)
            {
                max= arry[i];
            }
        }
        System.out.println("maximum is " +max);
        sc.close();
    }
}