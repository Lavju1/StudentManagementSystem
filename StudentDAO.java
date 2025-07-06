import java.sql.*;
import java.util.*;

public class StudentDAO {

    public void addStudent(Student s) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO students(name, department, cgpa) VALUES (?, ?, ?)");
        ps.setString(1, s.getName());
        ps.setString(2, s.getDepartment());
        ps.setDouble(3, s.getCgpa());
        ps.executeUpdate();
        con.close();
    }

    public List<Student> getAllStudents() throws Exception {
        List<Student> list = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            Student s = new Student(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("department"),
                rs.getDouble("cgpa")
            );
            list.add(s);
        }

        con.close();
        return list;
    }
}

