/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2021-07-28 09:33:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.learn.mycart.entities.User;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/components/common_css_js.jsp", Long.valueOf(1611400889650L));
    _jspx_dependants.put("/components/message.jsp", Long.valueOf(1610719582984L));
    _jspx_dependants.put("/components/navbar.jsp", Long.valueOf(1611508382764L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.learn.mycart.entities.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--JavaScript -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"\r\n");
      out.write("\tintegrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Registration Form</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url('img/signup.jpg'); height:100%; background-repeat: no-repeat; background-position: center; background-size: cover;\">\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	User user1=(User)session.getAttribute("current-user");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark custom-bg\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  \t<a class=\"navbar-brand\" href=\"index.jsp\">MyCart</a>\r\n");
      out.write("\t  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t  </button>\r\n");
      out.write("\t\r\n");
      out.write("\t  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t      <li class=\"nav-item active\">\r\n");
      out.write("\t        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("\t      </li>\r\n");
      out.write("\t      <li class=\"nav-item dropdown\">\r\n");
      out.write("\t        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t          Categories\r\n");
      out.write("\t        </a>\r\n");
      out.write("\t        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t          <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("\t          <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("\t          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t          <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t      </li>\r\n");
      out.write("\t    </ul>\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t    \r\n");
      out.write("\t    \t<li class=\"nav-item active\">\r\n");
      out.write("\t    \t\t<a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#cart\" href=\"#\"><i class=\"fa fa-cart-plus\" style=\"font-size: 20px\"><span class=\"cart-items\">(0)</span></i></a>\r\n");
      out.write("\t  \t\t</li>\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    ");

		    
	    
	    	if(user1==null)
	    	{
      out.write("\r\n");
      out.write("\t    \t\t\r\n");
      out.write("\t\t\t    \t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t        \t<a class=\"nav-link\" href=\"login.jsp\">Login</a>\r\n");
      out.write("\t\t\t      \t</li>\r\n");
      out.write("\t\t\t      \t\r\n");
      out.write("\t\t\t      \t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t        \t<a class=\"nav-link\" href=\"register.jsp\">Register</a>\r\n");
      out.write("\t\t\t      \t</li>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    </ul>\r\n");
      out.write("\t    \t");
}
	    	else
	    	{
      out.write("\r\n");
      out.write("\t    \t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t    \t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t        \t<a class=\"nav-link\" href=\"");
      out.print( user1.getUserType().equals("admin")?"admin.jsp":"normal.jsp" );
      out.write('"');
      out.write('>');
      out.print( user1.getUserName() );
      out.write("</a>\r\n");
      out.write("\t\t\t      \t</li>\r\n");
      out.write("\t\t\t      \t\r\n");
      out.write("\t\t\t      \t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t        \t<a class=\"nav-link\" href=\"LogoutServlet\">Logout</a>\r\n");
      out.write("\t\t\t      \t</li>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    </ul>\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t\t\r\n");
      out.write("\t    \t");
}
	    
	    
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row mt-4\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 offset-md-1\">\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t");

	String message=(String)session.getAttribute("message");
	if(message=="User with this email already exist" || message=="Invalid Details")
	{

      out.write("\r\n");
      out.write("\t\t<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("\t\t  <strong>");
      out.print( message );
      out.write("</strong>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n");
      out.write("\t\t    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t  </button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");

		session.removeAttribute("message");
	}
	else if(message!=null)
	{

      out.write("\r\n");
      out.write("\t\t<div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("\t\t  <strong>");
      out.print( message );
      out.write("</strong>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n");
      out.write("\t\t    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t  </button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");

		session.removeAttribute("message");
	}
	



      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/registration.png\" alt=\"registration icon\" style=\"max-width:70px\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 style=\"text-shadow: 2px 2px purple\">Sign up here</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<form action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t    <label for=\"name\">User Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t    <input required name=\"user_name\" type=\"text\" class=\"form-control\" id=\"name\" aria-describedby=\"emailHelp\" placeholder=\"Enter name\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t    <label for=\"email\">User Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t    <input required name=\"user_email\" type=\"email\" class=\"form-control\" id=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Enter Email\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t    <label for=\"password\">User Password</label>\r\n");
      out.write("\t\t\t\t\t\t\t    <input required name=\"user_password\" type=\"password\" class=\"form-control\" id=\"password\" aria-describedby=\"emailHelp\" placeholder=\"Enter Password\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t    <label for=\"phone\">User Phone</label>\r\n");
      out.write("\t\t\t\t\t\t\t    <input required name=\"user_phone\" type=\"number\" class=\"form-control\" id=\"phonel\" aria-describedby=\"emailHelp\" placeholder=\"Enter Phone\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t    <label for=\"address\">User Address</label>\r\n");
      out.write("\t\t\t\t\t\t\t    <textarea required name=\"user_address\" style=\"height:100px\" class=\"form-control\" placeholder=\"Enter Address\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-outline-success\">Register</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"reset\" class=\"btn btn-outline-warning\">Reset</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
