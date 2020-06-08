package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class retrieve_005fpackage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

String id = request.getParameter("userid");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" \n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        .tr{\n");
      out.write("            \n");
      out.write("            font-color:none;\n");
      out.write("            background-color:skyblue; \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>   \n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("    </br></br></br></br></br></br></br></br></br>\n");
      out.write("<h1>Retrieve data from database in jsp</h1>\n");
      out.write("<table border=\"1\">\n");
      out.write("<tr>\n");
      out.write("<td>Package ID</td>\n");
      out.write("<td>Package Type</td>\n");
      out.write("<td>Package name</td>\n");
      out.write("<td>Days</td>\n");
      out.write("<td>Nights</td>\n");
      out.write("<td>Cost</td>\n");
      out.write("<td>Images</td>\n");
      out.write("\n");
      out.write("</tr>\n");


try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from package";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(resultSet.getString("p_id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("p_type") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("p_name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("days") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("nights") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("cost") );
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("\n");
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
