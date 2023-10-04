import dao.StudentDao;
import dao.impl.StudentDaoimpl;
import entities.Student;

// import util.ConnectionProvider;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // System.out.println("Hello, World!");

        // ConnectionProvider.getMySqlConnection();

        StudentDao dao=new StudentDaoimpl();
        boolean status=addStudent(new Student(3, "Aman", 5999, new String[]{"C","C++"}, 'M', 9891062743L),
        (new Student(4, "ankit", 599, new String[]{"C","java","C++"}, 'M', 9991068543L)),
        (new Student(5, "mohit", 999, new String[]{"python","C++"}, 'M', 9278062743L)));

        if (status) {
            System.out.println();
        } else {
            System.out.println();
        }
    }

    private static boolean addStudent(Student student, Student student2, Student student3) {
        return false;
    }

    // private static boolean addStudent(Student student, Student student2, Student student3) {
    //     return false;
    // }
}
