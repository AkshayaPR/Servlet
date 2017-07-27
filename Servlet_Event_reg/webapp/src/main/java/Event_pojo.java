
import java.util.*;
import java.sql.Time;

public class Event_pojo {
 
    private String firstName;
    private String lastName;
    //private String email;
   /* private Date date;
    private Time time;
    private String topic;*/
 
   
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //public String getemail() {
    //    return email;
   // }
    //public void setemail(String email) {
    //    this.email = email;
   // }
  /*  public Date getdate()
    {
        return date;
    }
    public void setdate(Date date)
    {
        this.date=date;
    }*/

    @Override
    public String toString() {
     return  firstName + "firstName " + lastName + "lastName";        


 
}
}