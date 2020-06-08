package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class itinerary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Kashmir</title>\n");
      out.write("        <head>\n");
      out.write("\t\t<style>\n");
      out.write("\t\th1 {\n");
      out.write("\t\t\ttext-shadow: 2px 2px black;\n");
      out.write("\t\t\tfont-size:60px;\n");
      out.write("\t\t\tcolor:#ecf542;\n");
      out.write("                   }\n");
      out.write("\t   \n");
      out.write("                h2{\n");
      out.write("                        text-shadow: 2px 2px black;\n");
      out.write("            \t\tfont-size:30px;\n");
      out.write("\t\t\tcolor:#ecf542;\n");
      out.write("                  }\n");
      out.write("\t   \t.container {\n");
      out.write("  position: relative;\n");
      out.write("  text-align: center;\n");
      out.write("  color: black;\n");
      out.write("  \n");
      out.write("  font-family:Comic Sans MS\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".bottom-left {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  left: 16px;\n");
      out.write("}\n");
      out.write(".top-left {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 8px;\n");
      out.write("  left: 16px;\n");
      out.write("}\n");
      out.write(".bottom-right {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  right: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("/* The navbar */\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color:#ecf542;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Navbar links */\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  color:black ;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color:;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1 {font-size: 10px;}\n");
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
      out.write("</\n");
      out.write("\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t</head>\n");
      out.write("     <body>\n");
      out.write("     ");

  try{      
    int id =  Integer.parseInt(request.getParameter("imgid"));
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
    Statement stmt=con.createStatement();
    String strQuery = "select * from package where p_id="+id;
    ResultSet rs = stmt.executeQuery(strQuery);
    while(rs.next()){
       
      out.write("\n");
      out.write("     <center><h1></h1> </center>\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                    <img src=\"image.jsp?imgid=");
      out.print(rs.getInt("p_id"));
      out.write("\" width=\"1320\" height=\"500\" style=\"border:#ecf542 dashed;Opacity:0.75;\"  >\n");
      out.write("\t\t \n");
      out.write("\t\t \n");
      out.write("\t\t <div class=\"bottom-left\"><p style=\"font-size:50px; font-family:Comic Sans MS;\">Group Tour::");
      out.print(rs.getString("p_name"));
      out.write("</p></div>\n");
      out.write("\t\t <div class=\"bottom-right\"><p style=\"font-size:50px; font-family:Comic Sans MS;\"> Days:");
      out.print(rs.getString("days"));
      out.write("</p></div>\n");
      out.write("\t\t\n");
      out.write("\t\t </div>\n");
      out.write("\t\t \n");
      out.write("\t\t <div class=\"topnav\">\n");
      out.write("      <a href=\"#tour\">Tour Details</a>\n");
      out.write("      <a href=\"#iternary\">Iternary </a>\n");
      out.write("\t  <a href=\"#h\">Hotels</a>\n");
      out.write("      <a href=\"#in\">Inclusions</a>\n");
      out.write("      <a href=\"#ex\">Exclusions</a>\n");
      out.write("    </div>\n");
      out.write("\t\t <hr>\n");

Statement stmt2=con.createStatement();   
String strQuery2 = "select * from package_cities where p_id="+id+" order by dayNo";
ResultSet rs2 = stmt2.executeQuery(strQuery2);

      out.write("\t\n");
      out.write("\n");
      out.write("\t\t<a name=\"tour\"><div id=\"tour\"> <h2>Tour Details</2></div></a>\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t<p style=\"font-size:20px; font-family:Comic Sans MS;\"></p>\n");
      out.write("\t\t<hr>\n");
      out.write("                <a name=\"iternary\"><div id=\"iternary\"> <h2>Iternary</2></div></a>\n");
      out.write("\t\t <p style=\"font-size:20px; font-family:Comic Sans MS;\"><br>\n");
      out.write("                 ");

                    while(rs2.next()){
                 
      out.write("\n");
      out.write("                  <br>  Day ");
      out.print(rs2.getInt("dayNo"));
      out.write(":\n");
      out.write("                  <br> City: ");
      out.print(rs2.getString("cityName"));
      out.write("\n");
      out.write("\n");
      out.write("                 ");

                 int cid=0;
                 cid=rs2.getInt("city_id");
                 Statement stmt3=con.createStatement();
                 String strQuery3 = "select * from cities where city_id="+cid;
                 ResultSet rs3 = stmt3.executeQuery(strQuery3);
                 rs3.next();
                  
      out.write("\t\n");
      out.write("                  <br> Day outings: ");
      out.print(rs3.getString("city_iti"));
      out.write("\n");
      out.write("                 ");

                    }
                 
      out.write("\n");
      out.write("                 <a name=\"cost\"><div id=\"cost\"> <h2>Cost</2></div></a>\n");
      out.write("\t\t <p style=\"font-size:20px; font-family:Comic Sans MS;\">\n");
      out.write("                 ");
      out.print(rs.getInt("cost"));
      out.write("\n");
      out.write("                 rupees\n");
      out.write("                 \n");
      out.write("                 <a name=\"h\"><div id=\"h\"> <h2>Hotels</2></div></a>\n");

                rs2 = stmt2.executeQuery(strQuery2);
                  while(rs2.next()){
                int cid1=0;
                 cid1=rs2.getInt("city_id");
                 System.out.println(cid1);
                 Statement stmt4=con.createStatement();   
                 String strQuery4 = "select * from hotels where city_id="+cid1;
                 ResultSet rs4 = stmt4.executeQuery(strQuery4);
                 while(rs4.next()){
                     

      out.write("\t\n");
      out.write("            \n");
      out.write("                 <p style=\"font-size:20px; font-family:Comic Sans MS;\">Hotel (");
      out.print(rs2.getString("cityName"));
      out.write("):: ");
      out.print(rs4.getString("hotel_name"));
      out.write("</p>\n");
      out.write("                 <img src=\"image.jsp?imgid=");
      out.print(rs4.getInt("hotel_id"));
      out.write("\" width=\"200\" height=\"200\">\n");
      out.write("                 <br>\n");
      out.write("                 ");

                    }
                 }
                 
      out.write("\n");
      out.write("                 <a name=\"in\"><div id=\"in\"> <h2>Inclusions</2></div></a>\n");
      out.write("\t\t <p style=\"font-size:20px; font-family:Comic Sans MS;\">Tour Manager Services from Day 01 Meeting point till the dropping point on last day<br>Travel by comfortable A/c or Non A/c coach / Vehicle as per the tour itinerary<br>Entrance fees of all sightseeing places to be visited from inside<br>Accommodation in comfortable and convenient hotels<br>All Meals ? Breakfast, Lunch, Dinner (set menu) as mentioned in the itinerary<br>All Tips ? Guide, Driver & Restaurants1 Lt. Water Bottle per person per day</p>\n");
      out.write("\t\t <hr>\n");
      out.write("\t\t <a name=\"ex\"><div id=\"ex\"> <h2>Exclusions</2></div></a>\n");
      out.write("\t\t <p style=\"font-size:20px; font-family:Comic Sans MS;\">Govt Tax of 5.00% over and above the Tour Cost mentioned<br>Any upgradation in hotel room category<br>Cost of InsuranceCost of Pre/Post tour hotel accommodation<br>Any extra expense such as route change, Date change, Accommodation facilities, etc incurred due to the unforeseen, unavoidable forced majeure circumstances during the tour</p>\n");
      out.write("\t\t <hr>\n");
      out.write("                 <center><img src=\"images/Heart.gif\">\n");
      out.write("\t\t <p style=\"font-size:20px; font-family:Comic Sans MS;\">Let?s stitch travel dreams together!</p></center>\n");
      out.write("\t\t <center><a href=\"booknow.jsp?imgid=");
      out.print(id);
      out.write("\"><button class=\"button button1\" style=\"font-size:15px; \"><b>Book Now</b></button></a></center>\n");
      out.write("\t\n");
      out.write("     ");

    }    
    rs.close();
    con.close();
    stmt.close();
  }
  catch(Exception e)
  {
    e.getMessage();
  }
  
      out.write("\t\n");
      out.write("\t</body>\n");
      out.write("\t\n");
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
