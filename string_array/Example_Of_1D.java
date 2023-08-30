// package string_array;
import java.util.Scanner;

public class Example_Of_1D 
{

    public static void main(String[] args) 
    {
        
        // write a freinds name by using string arry

        Scanner sc=new Scanner(System.in);
        int name;
        String friends[];
        System.out.print("how many freinds name you write: ");
        name=sc.nextInt();

        // friends=new String[sc.nextInt()];
        friends=new String[name];
        sc.nextLine();
        for (int i = 0; i < friends.length; i++) 
        {
            System.out.print(""+(i+1)+"st freind name: ");
            friends[i]=sc.nextLine();
        }
        System.out.println();
        for (int j = 0; j < friends.length; j++) {
            System.out.println(""+(j+1)+": "+friends[j]);
        }
        sc.close();
    }
}