public class NS_15_3rd 
{
    public static void main(String[] args) 
    {

        int space=8,star=1;
        for (int i = 1; i <= 16; i++)
        {
            if (i>12)
            {
                space=5;
                star=4;
            }
            for (int sp = space; sp >0; sp--)
            {
                System.out.print(" ");
            }
            space--;
            for (int st = 0; st < star; st++)
            {
                System.out.print(" *");
            }   
            star++;
            System.out.print("\n");
            if(i%4==0)
            {
                space+=2;
                star-=2;
            }
            
        }

    }   
}
