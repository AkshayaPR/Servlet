import java.io.*;  
import java.sql.*; 
import java.sql.Date; 
import javax.servlet.http.*; 
import javax.servlet.annotation.*;
import javax.servlet.annotation.WebServlet;
//import java.util.Date;
  @WebServlet("/DBUtil")
public class DBUtil extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
        
String firstname=request.getParameter("firstname");  
String lastname=request.getParameter("lastname"); 

//SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
//Date dt =objSDF.parse(date);


try{
            Class.forName(
                "com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_registration", "root", "");
        
            PreparedStatement ps=conn.prepareStatement("insert into event values(?,?)");
          //ps.executeUpdate("insert into registeruser values(?,?,?,?,?,?,?)");

ps.setString(1,firstname);  
ps.setString(2,lastname);  
  
int i=ps.executeUpdate();  

ResultSet rs = ps.executeQuery("Select * from event");

out.println("<table border=1 style='background-color:White'>");


while (rs.next())
 {
out.println("<tr><td>" + rs.getString(1) + "<td>" + rs.getString(2) + "<td>" + rs.getString(3) + "<td>" + rs.getString(4) + "<td>" + rs.getString(5) + "<td>"
+ rs.getString(6) + "<td>"+ rs.getString(7) + "</tr>");
}
out.println("</table>");

out.print("You are successfully registered..."); 
out.close();
conn.close();
}
catch(Exception e)
            {
                System.out.println(e);
            }  }

public static Connection getConnection() {
	return null;
}
}

