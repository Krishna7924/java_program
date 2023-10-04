import java.util.Scanner;

public class Worker 
{

    public static void main(String[] args) 
    {
    //     Employee E1=new Employee("aman", 9582440781l,"aman2734@gmail.com",
    //                             "1",60000.00,"yes");
        // E1.showDetails();
        // System.out.println();
        // Scanner sc=new Scanner(System.in);
        // int n;
        // System.out.println("how many employee join: ");
        // n=sc.nextInt();
        // Employee Employee[]=new Employee[n];

        Employee Employee[]=new Employee[4];
        Employee[0]=new Employee("rohit", 985672421, "rai1234@gmail.com", 100, 15000.00, "no",new E_address("noidasec-56"));
        Employee[1]=new Employee("sumit", 897546824, "sumit4286@gmail.com", 101, 45000.00, "yes",new E_address("gitanjali vihar khora colony"));
        Employee[2]=new Employee("mohit", 999902777, "bisht8876@gmail.com", 102, 150000.00, "no",new E_address("dehradhun uttrakhand"));
        Employee[3]=new Employee("ankit", 985672431, "pandey9876@gmail.com", 103, 50000.00, "yes",new E_address("noida sec-12"));

        System.out.println("\n---------------- all employee details --------------\n");
        for (Employee employee : Employee) 
        {
            employee.showDetails();
        }
    }
}