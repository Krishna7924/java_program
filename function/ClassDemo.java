package function;
// blueprint !
class car
{
    int wheels=5;
    String ModelNo="porsche 911";
    double speed=307;
    //c=a+b bcz we can't right logic in blueprint.
    void accelerate()
    {
        System.out.println("accelerating the car");
    }
    void showdata()
    {
        System.out.println("======== car details =======");
        System.out.println("wheels: "+ wheels);
        System.out.println("model no.: "+ ModelNo);
        System.out.println("speed: " + speed);
    }
}


public class ClassDemo 
{
    public static void main(String[] args) 
    {
        int a; //isme 'a' jo hai variable hai 
        car krishnakicar; // reference variable :- krishnakicar ek variable hai jise hamne declare kiya hai
        new car(); /*  new means memorey dene ke liye
                    new ka ek box bn jyega or usme car type ka memory store hoga*/


        
    }
    
}

