    import java.sql.*;    
        public class Dao {  
      
        public static Connection getConnection(){  
            Connection con=null;  
            try{  
                Class.forName( "com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_page", "root", "");  
            }catch(Exception e){System.out.println(e);}  
            return con;  
        }      
         public static int save(Pojo e){  
            int status=0;     
            try{  
                Connection con=Dao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "insert into login_details(username,password) values (?,?)");  
                ps.setString(1,e.getUsername());  
                ps.setString(2,e.getPassword());                    
                status=ps.executeUpdate();  
                con.close();  
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }  
              
            return status;  
        }  
      
    }  