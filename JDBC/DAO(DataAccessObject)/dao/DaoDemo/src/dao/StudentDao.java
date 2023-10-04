// ky kaam hona chiye vo ye bta rha hai
package dao;

import java.util.List;

import entities.Student;

public interface StudentDao 
{
    boolean addStudent(Student student, Student student2, Student student3);
    boolean addStudent(Student student);
    boolean updateStudent(Student newstudent);
    boolean deleteStudentbyno(int rollno);
    boolean getStudentbyno(int rollno);
    List<Student>getallStudents();
    
}
