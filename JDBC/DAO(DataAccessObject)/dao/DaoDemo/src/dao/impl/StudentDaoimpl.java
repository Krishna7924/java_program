// kaam kese hona chiye vo isme bta rha hai

package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dao.StudentDao;
import entities.Student;
import util.ConnectionProvider;

public class StudentDaoimpl implements StudentDao
{
    private Connection con=null;
   @Override
	public boolean addStudent(Student s) 
    {
		int status=0;
		try {
            con=ConnectionProvider.getMySqlConnection();
			String query="insert into students values(?,?,?,?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, s.getRollno());
            stmt.setString(2, s.getName());
            stmt.setFloat(3, s.getFees());
            stmt.setString(4, Arrays.toString(s.getSkills()));
            stmt.setString(5, String.valueOf(s.getGender()));
            stmt.setLong(6, s.getMobileno());
            status=stmt.executeUpdate();
            con.close();
		} 
        catch (SQLException e) {
			e.printStackTrace();
		}
		return status>0 ? true : false;
	}

    @Override
    public boolean updateStudent(Student newstudent) 
    {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateStudent'");
    }

    @Override
    public boolean deleteStudentbyno(int rollno) 
    {
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudentbyno'");
    }

    @Override
    public boolean getStudentbyno(int rollno) 
    {
        throw new UnsupportedOperationException("Unimplemented method 'getStudentbyno'");
    }

    @Override
    public List<Student> getallStudents() 
    {
        try 
        {
            Connection con=ConnectionProvider.getMySqlConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Students;");
            List<Student> allStudents=new    ArrayList<>();
            while (rs.next()) 
            {
                Student student=new Student();
                student.setRollno(rs.getInt("rollno"));
                student.setName(rs.getString("name"));
                student.setFees(rs.getFloat("fees"));
                student.setGender(rs.getString("gender").charAt(0));
                student.setMobileno(rs.getInt("mobileno"));
                String arr[]=rs.getString("skills").substring(1, rs.getString("skills").length()-1).split(","); 
                student.setSkills(arr);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addStudent(Student student, Student student2, Student student3) 
    {
        throw new UnsupportedOperationException("Unimplemented method 'addStudent'");
    }

}
