import java.sql.*;

public class Table {
public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "SYSTEM";
		String password = "1234";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		String createQuery="CREATE TABLE EXAM2(ID NUMBER(10),NAME VARCHAR(50), SUBJECT VARCHAR(30),MARKS NUMBER(20))";
		stmt.executeUpdate(createQuery);
		
		String insertQuery="INSERT INTO EXAM2(ID, NAME, SUBJECT, MARKS) VALUES (1, 'ASHA','BIOLOGY',100)";
		stmt.executeUpdate(insertQuery);
		insertQuery="INSERT INTO EXAM2(ID,NAME,SUBJECT,MARKS) VALUES (2, 'BINDU','CHEMISTRY',50)";
		stmt.executeUpdate(insertQuery);
		insertQuery="INSERT INTO EXAM2(ID, NAME , SUBJECT, MARKS) VALUES (3, 'CHANDAN','PHYSICS',40)";
		stmt.executeUpdate(insertQuery);
		insertQuery="INSERT INTO EXAM2(ID, NAME, SUBJECT, MARKS) VALUES (4, 'DARSHAN','MATHS',80)";
		stmt.executeUpdate(insertQuery);
		
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM EXAM2 ");
		
		System.out.println("Query execution" + rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("ID") + " : " +  rs.getString("NAME")+ " : " +  rs.getString("SUBJECT")+ " : " +  rs.getString("MARKS"));
		}
		con.close();

	}

}


