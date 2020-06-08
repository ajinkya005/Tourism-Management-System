package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class domestic_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<title>Domestic</title>\n");
      out.write("<head>\n");
      out.write("\t<style>\n");
      out.write("\t\th1 {\n");
      out.write("\t\t\ttext-shadow: 2px 2px black;\n");
      out.write("\t\t\tfont-size:60px;\n");
      out.write("\t\t\tcolor:#ecf542;\n");
      out.write("\t\t\t\n");
      out.write("       }\n");
      out.write("\t   \n");
      out.write("\t   h2{\n");
      out.write("\t   text-shadow: 2px 2px black;\n");
      out.write("\t\t\tfont-size:30px;\n");
      out.write("\t\t\tcolor:#ecf542;\n");
      out.write("\t   }\n");
      out.write("\t   \n");
      out.write("\t   ul {\n");
      out.write("\t\t\tlist-style-type: none;\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\toverflow: hidden;\n");
      out.write("\t\t\tbackground-color:#ecf542;\n");
      out.write("\t\t\ttext-shadow: 2px 2px white;\n");
      out.write("\t\t\tdisplay:flex;\n");
      out.write("\t\t\tfont-size:20px;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\tli:last-child {\n");
      out.write("\t\t\tborder-right: none;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\tli a {\n");
      out.write("\t\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tcolor: black;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tpadding: 14px 16px;\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tborder: dashed white;\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\tli a:hover:not(.active) {\n");
      out.write("\t\tbackground-color: white;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t.active {\n");
      out.write("\t\tbackground-color:#ecf542;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\tfieldset{\n");
      out.write("\t\tfloat:left;\n");
      out.write("\t\twidth:50%;\n");
      out.write("\t\tmargin:100;\n");
      out.write("\t\tpadding:30;\n");
      out.write("\t\tbox-sizing:border-box;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t.dropdown {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f9f9f9;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".desc {\n");
      out.write("  padding: 15px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\t\n");
      out.write("\t\t\t\n");
      out.write("\t.button1 {font-size: 10px;}\n");
      out.write("\n");
      out.write("\t\t.button {\n");
      out.write("  background-color: #ecf542;\n");
      out.write("  border: none;\n");
      out.write("  color: black;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p{\n");
      out.write(" font:bold;\n");
      out.write(" font-family:Comic Sans MS;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img{\n");
      out.write("border-radius:25px;\n");
      out.write("}\n");
      out.write("</head>\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \t\t<center><h1>Domestic Packages</h1> </center>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li style=\"float:right\"><a  href=\"#home\"><b>Domestic Tours</b></a></li>\n");
      out.write("\t\t\t<li style=\"float:right\"><a href=\"international.html\"><b>International Tours</b></a></li>\n");
      out.write("\t\t\t<li style=\"float:right\"><a href=\"home.jsp\"><b>Home</b></a></li>\n");
      out.write("\t\t</ul>\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<hr>\n");
      out.write("<h1>Click On Image to get details</h1>\n");
      out.write("                ");

  try{      
      
      
       System.out.println("_____________________--------------");

      
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
    Statement stmt=con.createStatement();
    String dom= "'domestic'";
    String strQuery = "select * from package where p_type="+dom;
    ResultSet rs = stmt.executeQuery(strQuery);
    while(rs.next()){
       
      out.write("\n");
      out.write("\t\t<fieldset style=\"border:dashed; border-color:#ecf542;width:450px;height:550px;\">\n");
      out.write("\t\t<legend><h2>");
      out.print(rs.getString("p_name"));
      out.write("</h2></legend>\n");
      out.write("                <a href=\"itinerary.jsp?imgid=");
      out.print(rs.getInt("p_id"));
      out.write("\"><img src=\"image.jsp?imgid=");
      out.print(rs.getInt("p_id"));
      out.write("\" width=\"400\" height=\"400\" align=\"left\"></a>\n");
      out.write("                </fieldset>\n");
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
  
      out.write("          \n");
      out.write("    \t\t<link href=\"footer.html\">\n");
      out.write("    </body>\n");
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
