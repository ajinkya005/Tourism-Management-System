package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class im_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<HTML>\n");
      out.write("    <center>\n");
      out.write("    \n");
      out.write("        <form action=\"after_onclick.jsp\" method=\"post\">\n");
      out.write(" \n");
      out.write("   ");

  try{      
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
    Statement stmt=con.createStatement();
    String strQuery = "select * from package";
    ResultSet rs = stmt.executeQuery(strQuery);
    
  //  session.setAttribute("id", );
    
    
    while(rs.next()){
       
      out.write("\n");
      out.write("      \n");
      out.write("      <p>");
      out.print(rs.getInt("p_id"));
      out.write("</p>\n");
      out.write("      <p>");
      out.print(rs.getString("p_type"));
      out.write("</p>\n");
      out.write("      <p>");
      out.print(rs.getString("p_name"));
      out.write("</p>\n");
      out.write("      <p>");
      out.print(rs.getInt("days"));
      out.write("</p>\n");
      out.write("      <p>");
      out.print(rs.getString("itinery"));
      out.write("</p>\n");
      out.write("      <p>");
      out.print(rs.getInt("cost"));
      out.write("</p>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("     \n");
      out.write("\n");
      out.write("          <a href=\"after_onclick.jsp\"><img src=\"image.jsp?imgid=");
      out.print(rs.getInt("p_id"));
      out.write("\" width=\"200\" height=\"200\"></a>\n");
      out.write("\n");
      out.write("<!--            <a href=\"after_onclick.jsp\"><img src=\"image.jsp?imgid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"200\" height=\"200\"></a>-->\n");
      out.write("     \n");
      out.write("      ");

    }
    rs.close();
    con.close();
    stmt.close();
  }
  catch(Exception e)
  {
    e.getMessage();
  }
  
      out.write("\n");
      out.write(" </form>\n");
      out.write(" \n");
      out.write("    </CENTER>\n");
      out.write(" \n");
      out.write("</HTML>");
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
