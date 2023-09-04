
import java.util.*;

public class Example_Of_2D
{

    public static void main(String[] args)
    {

        String []school={"JK modern","vanasthali public school","nav bharti public school"};
        String [][] batch=
        {
            {"1st batch","2nd batch" ,"3rd batch" ,"4th batch"},
            {"5th batch","6th batch" ,"7th batch" ,"8th batch"},
            {"9th batch","10th batch","11th batch","12th batch"}
        };

        int [][]student=new int[3][4];

        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("enter the data of "+school[i]); 

            for (int j = 0; j < 4; j++) 
            {

                System.out.print("\t"+batch[i][j]+": ");

                student[i][j]=sc.nextInt();
            } 
        }
        System.out.println("the data are ");
        for (int i = 0; i < student.length; i++) 
        {
            for (int j = 0; j < student[i].length; j++) 
            {
                System.out.print(student[i][j]+" ");
            }   
            System.out.println();
        }
        
        sc.close();
    }
}
