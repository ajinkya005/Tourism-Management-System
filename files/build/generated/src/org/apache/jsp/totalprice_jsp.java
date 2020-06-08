package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class totalprice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.html");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      
        String hot_cat=request.getParameter("hot_cat");
        int id =  Integer.parseInt(request.getParameter("imgid"));  
    int adults=Integer.parseInt(request.getParameter("adults"));
     int children=Integer.parseInt(request.getParameter("children"));
     int tot = adults + children;
             double price=0;
            int id1 =  Integer.parseInt(request.getParameter("imgid"));  
            Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
            Statement stmt7=con2.createStatement();
            String strQuery5 = "select * from date_availability where p_id="+id1;
            ResultSet rs3 = stmt7.executeQuery(strQuery5);
            rs3.next();
            int seat=rs3.getInt("seats");
           
            if(seat <= 0)
            {
       
      out.write("\n");
      out.write("            \n");
      out.write("       <h1>seats not available try for another date</h1>\n");
      out.write("       \n");
      out.write("       ");

            }
            else
            {    
              
       
      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <h1>Total Price:</h1>\n");
      out.write(" ");

    
     
    
     
     Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
    Statement stmt2=con.createStatement();
    String strQuery2 = "select * from package where p_id="+id;
    ResultSet rs2 = stmt2.executeQuery(strQuery2);
    rs2.next();
    int basic_price=rs2.getInt("cost");
    Statement stmt=con.createStatement();
    String strQuery = "select * from hotels where( city_id in (select city_id from package_cities where p_id="+ id +"))";
    ResultSet rs = stmt.executeQuery(strQuery);
    price=price+adults*basic_price;
    price=price+children*0.8*basic_price;
    System.out.println(hot_cat);
     
    while(rs.next())
    {
        System.out.println(rs.getInt("Standar_Price"));
        if(hot_cat.equals("Standard"))
        {
          int hot_price= rs.getInt("Standar_Price");
          price=price+hot_price;
        }
        else if(hot_cat.equals("Deluxe"))
        {
          int hot_price= rs.getInt("Deluxe_Price");
          price=price+hot_price;
        }
    }
    price=price+(0.05 * price);
    System.out.println(price);
    
    String Sessname=(String)session.getAttribute("sessname"); 
  
      out.write("\n");
      out.write("  ");
      out.print(price);
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("        \n");
      out.write("       ");

           // String name = "'"Sessname"'";
            Connection con6=DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
            Statement stmt6=con.createStatement();
            String strQuery6 = "select * from customer where c_name=" + "'"+Sessname+"'";
            ResultSet rs6 = stmt6.executeQuery(strQuery6);
            rs6.next();      
       
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write(" ");

    String date = request.getParameter("dat");
    Statement stmt3=con.createStatement();
    System.out.println(date);
    String strQuery3 = "update date_availability set seats=(seats-"+tot+") where date=" + "'"+date+"'";
    int i = stmt3.executeUpdate(strQuery3); 

      out.write("       \n");
      out.write("  \n");

    Statement stmt4=con.createStatement();
    String strQuery4 = "insert into customer_booking(c_id , p_id , price , date , adults , children, hotel_type)"+"values(?,?,?,?,?,?,?)";
    PreparedStatement psmt=null;
    psmt=con.prepareStatement(strQuery4);
    psmt.setInt(1, rs6.getInt("c_id"));
    psmt.setInt(2, id);
    psmt.setDouble(3, price);
    psmt.setString(4, date);
    psmt.setInt(5, adults);
    psmt.setInt(6, children);
    psmt.setString(7, hot_cat);    
    int s = psmt.executeUpdate();
    
    Statement stmt8=con.createStatement();
    String strQuery8 = "select * from customer_booking where p_id="+id+" and c_id="+rs6.getInt("c_id")+";";
    System.out.println("--===");
    int cid1 = rs6.getInt("c_id");
        System.out.println(cid1);
    ResultSet rs8 = stmt2.executeQuery(strQuery8);
        System.out.println("--===");
rs8.next();
        System.out.println("--===");
        int bid=rs8.getInt("b_id");
        System.out.println(bid);
        
        
        
        HttpSession session1 = request.getSession();
        session1.setAttribute("p_id" , String.valueOf(id));
        
        HttpSession session2 = request.getSession();
        session2.setAttribute("c_id" , String.valueOf(cid1));
        
        

      out.write("\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("    \n");
      out.write("    <form action=\"generate_receipt.jsp?imgid=");
      out.print(bid);
      out.write("\">\n");
      out.write("        <h2>CLICK BELOW TO GENERATE RECEIPT</h2>\n");
      out.write("        <input type=\"submit\" value=\"generate receipt\">\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("</center>\n");
      out.write("\n");

       




            }

      out.write("\n");
      out.write("\n");
      out.write(" <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("  ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"footer, address, phone, icons\" />\r\n");
      out.write("\r\n");
      out.write("\t<title>Footer With Address And Phones</title>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/demo.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/footer-distributed-with-address-and-phones.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"http://fonts.googleapis.com/css?family=Cookie\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- The content of your page would go here. -->\r\n");
      out.write("\r\n");
      out.write("\t\t<footer class=\"footer-distributed\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"footer-left\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h3>Company<span>logo</span></h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"footer-links\">\r\n");
      out.write("                                    <a href=\"home.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t\tÂ·\r\n");
      out.write("                                        <a href=\"package.html\">Packages</a>\r\n");
      out.write("\t\t\t\t\tÂ·\r\n");
      out.write("                                        <a href=\"domestic_new.jsp\">Domestic</a>\r\n");
      out.write("\t\t\t\t\tÂ·\r\n");
      out.write("                                        <a href=\"international.jsp\">International</a>\r\n");
      out.write("\t\t\t\t\tÂ·\r\n");
      out.write("                                        <a href=\"login.jsp\">Login</a>\r\n");
      out.write("\t\t\t\t\tÂ·\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Contact</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"footer-company-name\">Company Name &copy; 2019</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"footer-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-map-marker\"></i>\r\n");
      out.write("\t\t\t\t\t<p><span>21 PICT</span>Katraj ,Pune</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-phone\"></i>\r\n");
      out.write("\t\t\t\t\t<p>8793699840</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t<p><a href=\"mailto:support@company.com\">support@company.com</a></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"footer-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"footer-company-about\">\r\n");
      out.write("\t\t\t\t\t<span>About the company</span>\r\n");
      out.write("\t\t\t\t\tTours & Travels\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"footer-icons\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-github\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write(" \n");
      out.write("   ");
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
