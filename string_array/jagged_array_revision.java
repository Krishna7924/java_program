import java.util.Scanner;

public class jagged_array_revision 
{

    public static void main(String[] args) 
    {
        // String countrynames[]={"india","australia","america"};
        // String states[][]=
        // {
        //     {"delhi","uttrakhand","uttarpradesh"},
        //     {"new york","san fransisco","san deigo","california","texas","los angeles"},
        //     {"south wales","columbia"}
        // };
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the country :");
        int country=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the countries name:");
        String countriesnames[]=new String[country];
        for (int i = 0; i < countriesnames.length; i++) {
            countriesnames[i]=sc.nextLine();
        }

        String states[][]=new String[country][];
        for (int i = 0; i < states.length; i++) 
        {
            System.out.println("how many states u wanna store in "+countriesnames[i]+": ");
            states[i]=new String[sc.nextInt()];
            sc. nextLine();
            for (int j = 0; j < states[i].length; j++) 
            {
                System.out.println("enter states "+j+"names:");
                states[i][j]=sc.nextLine();
            }
        }
        System.out.println();

        System.out.println("the given data is :");
        for (int i = 0; i < states.length; i++) 
        {
            System.out.println(countriesnames[i]+": ");
            for (int j = 0; j < states[i].length; j++) 
            {
                System.out.print(states[i][j]+" \t");
            }
            System.out.println();
        }
    }
}