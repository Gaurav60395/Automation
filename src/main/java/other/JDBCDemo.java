package other;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDemo {
    public static void main(String[] args) throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url ="jdbc.mysql://localhost:3306/globalit";
    String uname="root";
    String password="gaurav@224";
    Connection con=DriverManager.getConnection(url,uname,password);
    Statement st=con.createStatement();
    ResultSet resultSet =st.executeQuery("select * from student");
        while (resultSet.next()) {

            System.out.println("Student id :"+resultSet.getInt(1));
            System.out.println("Student Name :"+resultSet.getString(2));
            System.out.println("Student Address :"+resultSet.getString(3));
        }
    }
}
