import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key,n,isfound=0;
        System.out.print("enter the size of array: ");
        n=sc.nextInt();
        int arry[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array["+i+"]: ");
            arry[i]=sc.nextInt();
        }
        System.out.println("enter the key:");
        key =sc.nextInt();
        
        for (int i = 0; i < arry.length; i++) 
        {
            if (key==arry[i]) 
            {
                System.out.println(""+key+" found at index "+i);
                isfound=1;     
            }
        }
        if (isfound!=1)
        {
            System.out.println(""+key+"  not found in array");
        }
        sc.close();
    }
}