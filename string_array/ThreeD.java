package string_array;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeD 
{
    public static void main(String[] args) 
    {
        // 2*2*3 =6
        // String cities[][][]=
        // {
        //     {
        //         {"bhopal","ujjain","bhuvneshwar"},
        //         {"noida","gzb","hapur"}
        //     },
        //     {
        //         {"A","B","C"},
        //         {"D","E","F"}
        //     }
        // };
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of coutries,states and cities");
        String cities[][][]=new String[sc.nextInt()][sc.nextInt()][sc.nextInt()];

        sc.nextLine();
        System.out.println("Enter city names:");
        for (int i = 0; i < cities.length; i++) 
        {
            System.out.println("Country "+i+":");
            for (int j = 0; j < cities[i].length; j++) 
            {
                System.out.println("\tStates "+j+":");
                for (int k = 0; k < cities[i][j].length; k++) 
                {
                    System.out.print("\t\tCities "+k+":");
                    cities[i][j][k]=sc.nextLine();
                }
            }
        }
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < cities.length; i++) 
        {
            System.out.println("Country "+i+":");
            for (int j = 0; j < cities[i].length; j++) 
            {
                System.out.println("\tStates "+j+":");
                for (int k = 0; k < cities[i][j].length; k++) 
                {
                    System.out.print("\t\tCities "+k+":");
                    System.out.print(cities[i][j][k]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}