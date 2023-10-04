package entities;

import java.util.Arrays;

public class Student 
{
    private int rollno;
    private String name;
    private float fees;
    private String skills[];
    private char gender;
    private long mobileno;

    public Student() {}

    public Student(int rollno, String name, float fees, String[] skills, char gender, long mobileno) 
    {
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
        this.skills = skills;
        this.gender = gender;
        this.mobileno = mobileno;
    }

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getFees() {
        return fees;
    }
    public void setFees(float fees) {
        this.fees = fees;
    }
    public String[] getSkills() {
        return skills;
    }
    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public long getMobileno() {
        return mobileno;
    }
    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString(){
        return "student [rollno=" + rollno + ", name=" + name + ", fees=" + fees + ", skills=" + Arrays.toString(skills)
                + ", gender=" + gender + ", mobileno=" + mobileno + "]";
    }
    
}
