/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2021-08-07 10:22:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import com.homeinsurance.dao.DepartmentDao;
import com.homeinsurance.entities.Department;
import java.util.List;
import com.homeinsurance.helper.FactoryProvider;
import com.homeinsurance.entities.NormalUser;
import com.homeinsurance.entities.AdminUser;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/components/common_css_js.jsp", Long.valueOf(1627560726089L));
    _jspx_dependants.put("/components/message.jsp", Long.valueOf(1627897993101L));
    _jspx_dependants.put("/components/navbar.jsp", Long.valueOf(1628331457711L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.homeinsurance.entities.Department");
    _jspx_imports_classes.add("com.homeinsurance.helper.FactoryProvider");
    _jspx_imports_classes.add("com.homeinsurance.entities.AdminUser");
    _jspx_imports_classes.add("com.homeinsurance.entities.NormalUser");
    _jspx_imports_classes.add("com.homeinsurance.dao.DepartmentDao");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	AdminUser user = (AdminUser)session.getAttribute("current-user");
	if(user == null){
		session.setAttribute("message", "You are not logged-in!! Login first.");
		response.sendRedirect("login.jsp");
		return;
	}

      out.write("\r\n");
      out.write("\r\n");

	DepartmentDao dao = new DepartmentDao(FactoryProvider.getFactory());
	List<Department> list = dao.getDepartments();
	/* PrintWriter writer = response.getWriter();
	for(Department d : list){
		writer.println(d.getDeptName());
	} */


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin Page</title>\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Javascript -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/de4c62eee8.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	AdminUser adminUser = null;
	NormalUser normalUser = null;
	try{
		adminUser = (AdminUser)session.getAttribute("current-user");
	}
	catch(Exception e)
	{
		normalUser =  (NormalUser)session.getAttribute("current-user");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\" style=\"font-size: 24px\"><b><i><u>EMS Portal</u></i></b></a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("       <!--  <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Link</a>\r\n");
      out.write("        </li> -->\r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("       <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("       \r\n");
      out.write("       ");
 if(adminUser == null && normalUser == null)
       { 
      out.write("\r\n");
      out.write("\t        <li class=\"nav-item text-right\">\r\n");
      out.write("\t          <a class=\"nav-link\" aria-current=\"page\" href=\"login.jsp\"><i class=\"fa fa-sign-in mx-1\" style=\"font-size: 24px\"><b>Login</b></i></a>\r\n");
      out.write("\t        </li>\r\n");
      out.write("\t        <li class=\"nav-item text-right\">\r\n");
      out.write("\t          <a class=\"nav-link\" aria-current=\"page\" href=\"signup.jsp\"><i class=\"fa fa-user\" style=\"font-size: 24px\"><b>Register</b></i></a>\r\n");
      out.write("\t        </li>\r\n");
      out.write("        ");
}
        else if(adminUser != null){ 
      out.write("\r\n");
      out.write("        \t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t    <a class=\"nav-link\" href=\"admin.jsp\"><b>");
      out.print( adminUser.getAdminName() );
      out.write("</b></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t      \t\r\n");
      out.write("\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t     <a class=\"nav-link\" href=\"LogoutServlet\"><b>Logout</b></a>\r\n");
      out.write("\t\t\t </li>\r\n");
      out.write("        ");
}
        else{ 
      out.write("\r\n");
      out.write("        \t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t    <a class=\"nav-link\" href=\"normal.jsp\"><b>");
      out.print( normalUser.getUsername() );
      out.write("</b></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t      \t\r\n");
      out.write("\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t     <a class=\"nav-link\" href=\"LogoutServlet\"><b>Logout</b></a>\r\n");
      out.write("\t\t\t </li>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("      \t\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\t<div class=\"container my-3\">\r\n");
      out.write("\t");

	String message =  (String)session.getAttribute("message");
	if(message=="User with this email already exist" || message=="Invalid Details" || message == "You are not logged-in!! Login first.") {
	
      out.write("\r\n");
      out.write("\t\t<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("\t\t  <strong>");
      out.print( message );
      out.write("</strong>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
	
		session.removeAttribute("message");
	}
	else if(message!=null){
	
      out.write("\r\n");
      out.write("\t\t<div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("\t\t  <strong>");
      out.print( message );
      out.write("</strong>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
	
	
		session.removeAttribute("message");
	}
	

      out.write("\r\n");
      out.write("\t\t<div class=\"text-end mx-auto\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-info\" data-bs-toggle=\"modal\" data-bs-target=\"#addDepartmentModal\">Add Department</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-info\" data-bs-toggle=\"modal\" data-bs-target=\"#deleteDepartmentModal\">Delete Department</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 for(Department d : list) { 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row mt-3\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t<a href=\"ShowDepartment.jsp?deptId=");
      out.print( d.getDeptId() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"card-body text-center\">\r\n");
      out.write("\t\t\t\t\t\t    <h5 class=\"card-title\">");
      out.print( d.getDeptName() );
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
}
		
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Add Department Modal  -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"addDepartmentModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t    <div class=\"modal-content\">\r\n");
      out.write("\t      <div class=\"modal-header\">\r\n");
      out.write("\t        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Add Department</h5>\r\n");
      out.write("\t        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t        <form action=\"AddDepartmentServlet\" method=\"GET\">\r\n");
      out.write("\t\t\t  <div class=\"mb-3\">\r\n");
      out.write("\t\t\t    <label for=\"addDepartment\" class=\"form-label\">Department Name</label>\r\n");
      out.write("\t\t\t    <input type=\"text\" class=\"form-control\" id=\"addDepartment\" placeholder=\"Enter Department Name\" name=\"deptName\" required>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t          <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End of Add Department Modal  -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Delete Department Modal  -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"deleteDepartmentModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t    <div class=\"modal-content\">\r\n");
      out.write("\t      <div class=\"modal-header\">\r\n");
      out.write("\t        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Delete Department</h5>\r\n");
      out.write("\t        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t        <form action=\"DeleteDepartmentServlet\" action=\"GET\">\r\n");
      out.write("\t        \t");
for(Department d: list){
      out.write("\r\n");
      out.write("\t        \t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t  <input class=\"form-check-input\" type=\"checkbox\" value=\"");
      out.print( d.getDeptId() );
      out.write("\" id=\"flexCheckDefault\" name=\"deleteDept\">\r\n");
      out.write("\t\t\t\t\t  <label class=\"form-check-label\" for=\"flexCheckDefault\">\r\n");
      out.write("\t\t\t\t\t    ");
      out.print( d.getDeptName());
      out.write("\r\n");
      out.write("\t\t\t\t\t  </label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t<button type=\"submit\" class=\"btn btn-primary\">Delete</button>\r\n");
      out.write("\t        </form>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End of Delete Department Modal  -->\r\n");
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
