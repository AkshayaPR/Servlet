    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession;  
    import javax.servlet.annotation.WebServlet;  
    @WebServlet("/LoginServlet") 
    //  @WebFilter(filterName="MyFilter", urlPatterns="/eventregister.jsp")
    public class LoginServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                        throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
           //request.getRequestDispatcher("ProfileSevlet").include(request, response);  
            String name=request.getParameter("name");  
            String password1=request.getParameter("password");  
             System.out.println(password1); 

            if(password1.equals("admin123")){  
             out.print("Welcome, "+name); 
            
            HttpSession session=request.getSession();  
            session.setAttribute("name",name);  

     response.sendRedirect("ProfileServlet");
    // request.getRequestDispatcher("ProfileServlet").forward(request, response);  
   //  out.print("Welcome, "+name); 
            }  
            else{  
                out.print("Sorry, username or password error!");  
              // response.sendRedirect("Profile.html");
               // request.getRequestDispatcher("login.html").include(request, response);  
            }  
            
            out.close();  
        }  
    }  