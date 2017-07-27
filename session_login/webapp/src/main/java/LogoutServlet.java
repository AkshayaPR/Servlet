    import java.io.IOException;  
    import java.io.PrintWriter;    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
  
  
    @WebServlet("/LogoutServlet")
    public class LogoutServlet extends HttpServlet {  
            protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                                    throws ServletException, IOException {  
                response.setContentType("text/html");  
                PrintWriter out=response.getWriter();   
                //HttpSession session=request.getSession(false);  
                //session.invalidate();  
                out.print("You are successfully logged out!"); 
                // response.sendRedirect("index.html");
                request.getRequestDispatcher("/logout.html").forward(request, response);  
                out.close();  
        }  
    }  