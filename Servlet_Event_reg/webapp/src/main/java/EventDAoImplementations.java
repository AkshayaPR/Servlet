import java.util.*;


public class EventDAoImplementations implements EventDAo {
 
    private Connection conn;
 
    public EventDAoImplementations() {
        conn = DBUtil.getConnection();
    }
   
   
    @Override
    public void deleteEvent( String firstName) {
        try {
            String query = "delete from event where firstname=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, firstName);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Event_pojo> getAllEvent_pojos() {
        List<Event_pojo> students = new ArrayList<Event_pojo>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery( "select * from event" );
            while( resultSet.next() ) {
                Event_pojo student = new Event_pojo();
               
                student.setFirstName( resultSet.getString( "firstName" ) );
                student.setLastName( resultSet.getString( "lastName" ) );
                student.setCourse( resultSet.getString( "course" ) );
              
            }
            resultSet.close();
            statement.close();
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
        return event;