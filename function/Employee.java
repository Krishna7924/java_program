
public class Employee 
{
    String employee_name;
    long phoneNo;
    String gmail;
    int employee_id;
    double salary;
    String married;
    E_address employee_Address;

    // Employee(String name)
        // {
        //     this.name=name;
        // }
    
    Employee(String employee_name, long phoneNo, String gmail, int employee_id, double salary, String married,
            E_address employee_Address) 
    {
        this.employee_name = employee_name;
        this.phoneNo = phoneNo;
        this.gmail = gmail;
        this.employee_id = employee_id;
        this.salary = salary;
        this.married = married;
        this.employee_Address = employee_Address;
    }

    void showDetails()
    {
        System.out.println("------------- "+employee_name+" details --------------");
        System.out.println("phone no.: "+phoneNo);
        System.out.println("gmail: "+gmail);
        System.out.println("married: "+employee_id);
        System.out.println("salary: "+salary);
        System.out.println("married: "+married);
        System.out.println("employee_Address: "+employee_Address.employee_Address);

    }
    
}