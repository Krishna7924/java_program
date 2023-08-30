// package string_array;
import java.util.Scanner;

public class JaggedArray 
{
    public static void main(String[] args) 
    {
        // String CountryNames[]={"india","America","Australia"};
        // String states[][]={
        //     {"UP","MP","Bihar"},
        //     {"New york","San Fransisco","San deigo","california","Texas","los angeles"},
        //     {"south wales","columbia"}
        // };
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter countries:");
        int countries=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter countries name");
        String CountryNames[]=new String[countries];
        for (int i = 0; i < CountryNames.length; i++) 
        {
            CountryNames[i]=sc.nextLine();
        }
        
        String states[][]=new String[countries][];
        for (int i = 0; i < states.length; i++) 
        {
            System.out.println("how many states name u wanna store in "+CountryNames[i]+":");
            states[i]=new String[sc.nextInt()];
            sc.nextLine();
            for (int j = 0; j < states[i].length; j++) 
            {
                System.out.print("enter state "+j+" name :");
                states[i][j]=sc.nextLine();
            }
        }
        
        System.out.println("\nThe Given Data is :");
        for (int i = 0; i < states.length; i++) //3
        {
            System.out.println(CountryNames[i]+":");
            for (int j = 0; j < states[i].length; j++) 
            {
                System.out.print("\t"+states[i][j]);    
            }
            System.out.println();
        }


    }
}
