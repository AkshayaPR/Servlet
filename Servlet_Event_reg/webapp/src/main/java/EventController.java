import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import javax.servlet.*;
 import java.util.*;
 import javax.servlet.http.*; 
import javax.servlet.annotation.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/EventController")
public class EventController extends HttpServlet {
 
    public EventDAo dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_STUDENT = "/listStudent.jsp";
    public static final String INSERT_OR_EDIT = "/student.jsp";

    public EventController() {
        dao = new EventDAoImplementations();


    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response, String firstName) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );

        if( action.equalsIgnoreCase( "delete" ) ) {
            forward = lIST_EVENT;
            int studentId = Integer.parseInt( request.getParameter("firstname") );
            dao.deleteEvent(firstName);
            request.setAttribute("students", dao.getAllEvent_pojos() );
        }
       
        else {
            forward = lIST_EVENT;
            request.setAttribute("students", dao.getAllEvent_pojos() );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Event_pojo event = new Event_pojo();
        

        
        
        
        event.setFirstName( request.getParameter( "firstName" ) );
        event.setLastName( request.getParameter( "lastName" ) );
       
        String studentId = request.getParameter("studentId");
 
      /*  if( studentId == null || studentId.isEmpty() )
            dao.addStudent(student);
        else {
            student.setStudentId( Integer.parseInt(studentId) );
            dao.updateStudent(student);
        }*/

        RequestDispatcher view = request.getRequestDispatcher( lIST_STUDENT );
        request.setAttribute("event", dao.getAllEvent_pojos());

        
        
                                 view.forward(request, response);
    }
}