    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession;  
    import javax.servlet.annotation.WebServlet;  
```sh  
 @WebServlet("/ProfileServlet")      
    public class ProfileServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                          throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();             
            HttpSession session=request.getSession(false);  
            //if(session!=null){  
            String name=(String)session.getAttribute("name");
            out.print("Hello, "+name+" Welcome to Profile");  
            request.getRequestDispatcher("profile.html").forward(request, response);  
          // response.sendRedirect("Profile.html");
            }  
```
```sh            
           /* else{  
                out.print("Please login first");  
                request.getRequestDispatcher("login.html").include(request, response);  
            }  
            request.getRequestDispatcher("profile.html").forward(request, response);  
            out.close();  
        }  */
    }  