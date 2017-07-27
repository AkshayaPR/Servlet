import java.util.List;

 
public interface EventDAo {

    public void deleteEvent( String firstName);
    public List<Event_pojo> getAllEvent_pojos();


}