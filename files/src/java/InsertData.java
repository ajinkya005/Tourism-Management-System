import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement; 
  
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
  
// Import Database Connection Class file 
  
// Servlet Name 
@WebServlet("/InsertData") 
public class InsertData extends HttpServlet { 
    private static final long serialVersionUID = 1L; 
  
    protected void doPost(HttpServletRequest request,  
HttpServletResponse response) 
        throws ServletException, IOException 
    { 
        try { 
  
            // Initialize the database 
            Connection con = DatabaseConnection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("insert into package values(?,?,?,?,?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setString(1, request.getParameter("type")); 
            
            st.setString(2, request.getParameter("p_name")); 
            
            st.setInt(3, Integer.valueOf(request.getParameter("days"))); 
            
            st.setInt(4, Integer.valueOf(request.getParameter("nights"))); 
            
            st.setInt(5, Integer.valueOf(request.getParameter("cost"))); 
            // Same for second parameter 
            
  
            // Execute the insert command using executeUpdate() 
            // to make changes in database 
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the succesful result 
            PrintWriter out = response.getWriter(); 
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>"); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
} 