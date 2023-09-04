import java.util.Scanner;

public class threeD_StringArray_Revision 
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // 2*2*3=12
        String grandson[][][]=
        {
            {
                {"mahesh","manoj","vasu"},
                {"rakesh","tarun","rohit"}
            },
            {
                {"pinky","shrutii","anjali"},
                {"kajal","komal","akansha"}
            }
        };
        for (int i = 0; i < grandson.length; i++) 
        {
            System.out.println("grandfather: ");
            for (int j = 0; j < grandson[i].length; j++) 
            {
                System.out.println("\t father: ");
                System.out.print("\t\t\tgrandson:- ");

                for (int k = 0; k < grandson[i][j].length; k++) 
                {
                    System.out.print("\t"+ grandson[i][j][k]);
                }
                System.out.println();

            }
            System.out.println();
        }
        sc.close();
    }
}