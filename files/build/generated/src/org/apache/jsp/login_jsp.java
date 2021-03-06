package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/css/home.css");
    _jspx_dependants.add("/css/login.css");
    _jspx_dependants.add("/header.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: black;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("  background-color: skyblue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  outline: none;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 0;\n");
      out.write("  margin: 100px;\n");
      out.write("  min-width: 300px;\n");
      out.write("  padding: 16px;\n");
      out.write("  background-color: white;\n");
      out.write("  min-height: 200px;\n");
      out.write("  \n");
      out.write("  opacity: 0.6;\n");
      out.write("  filter: alpha(opacity=50);\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-img {\n");
      out.write("  \n");
      out.write("  background-image: url(\"images/bg_1.jpg\");\n");
      out.write("\n");
      out.write("  //min-width: 100%;\n");
      out.write("  min-height: 500px;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("  min-height:70px\n");
      out.write("  text-align:center;    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("  float: right;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("  float: right;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("  font-size: 16px;  \n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: black;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  background-color: yellow;\n");
      out.write("  font-family: inherit;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn {\n");
      out.write("  background-color: skyblue;\n");
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
      out.write(".dropdown-content a {\n");
      out.write("  float: none;\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("div.polaroid {\n");
      out.write("  width: 20%;\n");
      out.write("  height:20%\n");
      out.write("  background-color: white;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 5, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("  margin-bottom: 25px;\n");
      out.write("  display:inline-block;\n");
      out.write("  padding-top: 50px;\n");
      out.write("  padding-right: 30px;\n");
      out.write("  padding-bottom: 50px;\n");
      out.write("  padding-left: 80px;\n");
      out.write("      \n");
      out.write("}\n");
      out.write("\n");
      out.write("div.container2 {\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("     .col-lg-3 {\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("        ");
      out.write("<style>\n");
      out.write("\n");
      out.write(".bg-mg {\n");
      out.write("  \n");
      out.write("  background-image: url(\"images/login_background.jpg\");\n");
      out.write("\n");
      out.write("  min-width: 100%;\n");
      out.write("  min-height: 100%;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: black;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("  background-color: skyblue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  outline: none;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 0;\n");
      out.write("  margin: 100px;\n");
      out.write("  min-width: 300px;\n");
      out.write("  padding: 16px;\n");
      out.write("  background-color: white;\n");
      out.write("  min-height: 200px;\n");
      out.write("  \n");
      out.write("  opacity: 0.6;\n");
      out.write("  filter: alpha(opacity=50);\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-img {\n");
      out.write("  \n");
      out.write("  background-image: url(\"images/bg_1.jpg\");\n");
      out.write("\n");
      out.write("  //min-width: 100%;\n");
      out.write("  min-height: 500px;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("  min-height:70px\n");
      out.write("  text-align:center;    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("  float: right;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("  float: right;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("  font-size: 16px;  \n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: black;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  background-color: yellow;\n");
      out.write("  font-family: inherit;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn {\n");
      out.write("  background-color: skyblue;\n");
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
      out.write(".dropdown-content a {\n");
      out.write("  float: none;\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("div.polaroid {\n");
      out.write("  width: 20%;\n");
      out.write("  height:20%\n");
      out.write("  background-color: white;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 5, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("  margin-bottom: 25px;\n");
      out.write("  display:inline-block;\n");
      out.write("  padding-top: 50px;\n");
      out.write("  padding-right: 30px;\n");
      out.write("  padding-bottom: 50px;\n");
      out.write("  padding-left: 80px;\n");
      out.write("      \n");
      out.write("}\n");
      out.write("\n");
      out.write("div.container2 {\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("     .col-lg-3 {\n");
      out.write("\n");
      out.write("}\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("    <a href=\"login.jsp\">Login</a>  \n");
      out.write("  <a href=\"home.jsp\">Home</a>\n");
      out.write("  <a href=\"#news\">News</a>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Packages \n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"domestic_new.jsp\">Domestic</a>\n");
      out.write("      <a href=\"international.jsp\">International</a>\n");
      out.write("<!--      <a href=\"#\">Link 3</a>-->\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write("        <div class=\"bg-mg\">   \n");
      out.write("            <center>\n");
      out.write("                </br></br></br></br></br></br></br></br></br></br></br>   \n");
      out.write("                <form action=\"LoginCustomerController\" style=\"display:inline-block\" method=\"post\">\n");
      out.write("                    <h1> Customer Login</h1></br>\n");
      out.write("                    <label><b>Email :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Email\" name=\"c_email\" required>\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <label><b>Password :&nbsp;&nbsp;&nbsp;</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"c_psw\" required>\n");
      out.write("                    <br/><br/>\n");
      out.write("                                        \n");
      out.write("                    <button type=\"submit\" value=\"Login\">Login</button>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <form action=\"LoginController\" style=\"display:inline-block\" method=\"post\">\n");
      out.write("                    <h1> Admin Login</h1>\n");
      out.write("                    </br>\n");
      out.write("                    <label><b>Email :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Email\" name=\"a_email\" required>\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <label><b>Password :&nbsp;&nbsp;&nbsp;</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"a_psw\" required>\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <button type=\"submit\" value=\"Login\">Login</button>\n");
      out.write("                </form>\n");
      out.write("            </center>    \n");
      out.write("            <center>\n");
      out.write("                <p style=\"display:inline-block\">New User??<a href=\"registration.jsp\">&nbsp;&nbsp;&nbsp; Register Here</a></p>\n");
      out.write("            </center>   \n");
      out.write("        </div>\n");
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
