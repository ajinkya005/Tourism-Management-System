package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;
import java.util.*;;
import java.io.PrintWriter;;

public final class delete_005fhotel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/tour";
String user = "root";
String psw = "";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Delete Data</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        </br></br></br></br></br></br></br></br></br></br></br></br>\n");
      out.write("        <center>\n");
      out.write("            <form action=\"delete_hotel.jsp\">\n");
      out.write("            \n");
      out.write("                    \n");
      out.write("            <h2 style=\"display:inline-block\"> Enter the hotel ID  <input type=\"text\" name=\"id\"/></h2>\n");
      out.write("            \n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Delete\" style=\"display:inline-block\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("         </center>   \n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

    
     
String id = request.getParameter("id");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
//String sql2 = "select * from package where p_id="+personID;
String sql = "DELETE FROM hotels WHERE hotel_id="+personID;
ps = con.prepareStatement(sql);
int i = ps.executeUpdate();
if(i > 0)
{
      out.write('\n');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("/successful_deletion.jsp");
        return;
      }
      out.write('\n');
 
}
else

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("/failure_deletion.jsp");
        return;
      }
      out.write('\n');

}

catch(SQLException sqe)
{
request.setAttribute("error", sqe);
out.println(sqe);
}
}

      out.write("<br>\n");
      out.write("<center>  <a href=\"admin_manipulation.jsp\"><button  class=\"btn btn-primary btn-lg\"> Back</button></a> </center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
