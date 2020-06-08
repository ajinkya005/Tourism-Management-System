package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class update_005fpackage_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "tour";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<h1>Retrieve data from database in jsp</h1>\n");
      out.write("<table border=\"1\">\n");
      out.write("<tr>\n");
      out.write("<td>id</td>\n");
      out.write("<td>package type</td>\n");
      out.write("<td>package name</td>\n");
      out.write("<td>days</td>\n");
      out.write("<td>cost</td>\n");
      out.write("<td>image</td>\n");
      out.write("<td>cities</td>\n");
      out.write("<td>Action</td>\n");
      out.write("</tr>\n");

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from package";
ResultSet rs = statement.executeQuery(sql);
while(rs.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(rs.getInt("p_id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("p_type") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("p_name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getInt("days") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getInt("cost") );
      out.write("</td>\n");
      out.write("<td><img src=\"image.jsp?imgid=");
      out.print(rs.getInt("p_id"));
      out.write("\" width=\"200\" height=\"200\"></td>\n");
      out.write("<td>");
      out.print(rs.getInt("city_count") );
      out.write("</td>\n");
      out.write("<td><a href=\"update_package_2.jsp?id=");
      out.print(rs.getInt("p_id"));
      out.write("\">update</a></td>\n");
      out.write("</tr>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
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
