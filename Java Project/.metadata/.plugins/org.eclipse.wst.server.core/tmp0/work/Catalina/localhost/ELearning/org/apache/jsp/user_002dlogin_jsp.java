/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-07-17 07:54:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1716967835611L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1720880559542L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Simple Learning</title>\r\n");
      out.write("    \r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Icon Font Stylesheet -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("        <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\r\n");
      out.write("            <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Navbar Start -->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow sticky-top p-0\">\r\n");
      out.write("        <a href=\"index.jsp\" class=\"navbar-brand d-flex align-items-center px-4 px-lg-5\">\r\n");
      out.write("            <h2 class=\"m-0 text-primary\"><i class=\"fa fa-book me-3\"></i>Simple Learning</h2>\r\n");
      out.write("        </a>\r\n");
      out.write("        <button type=\"button\" class=\"navbar-toggler me-4\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("            <div class=\"navbar-nav ms-auto p-4 p-lg-0\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("                <a href=\"about-page.jsp\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("                <a href=\"courses-page.jsp\" class=\"nav-item nav-link\">Courses</a>\r\n");
      out.write("                <div class=\"nav-item dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                    <div class=\"dropdown-menu fade-down m-0\">\r\n");
      out.write("                        <a href=\"team-page.jsp\" class=\"dropdown-item\">Our Team</a>\r\n");
      out.write("                        <a href=\"testimonial-page.jsp\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                        <a href=\"404.html\" class=\"dropdown-item\">404 Page</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"nav-item dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Register</a>\r\n");
      out.write("                    <div class=\"dropdown-menu fade-down m-0\">\r\n");
      out.write("                        <a href=\"user-register.jsp\" class=\"dropdown-item\">User-Register</a>\r\n");
      out.write("                        <a href=\"teacher-register.jsp\" class=\"dropdown-item\">Faculty-Register</a>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"nav-item dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Login</a>\r\n");
      out.write("                    <div class=\"dropdown-menu fade-down m-0\">\r\n");
      out.write("                        <a href=\"user-login.jsp\" class=\"dropdown-item\">User-Login</a>\r\n");
      out.write("                        <a href=\"teacher-login.jsp\" class=\"dropdown-item\">Faculty-Login</a>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"contact-page.jsp\" class=\"nav-item nav-link\">Contact</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"user-login.jsp\" class=\"btn btn-primary py-4 px-lg-5 d-none d-lg-block\">Join Now<i class=\"fa fa-arrow-right ms-3\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Spinner Start -->\r\n");
      out.write("   \r\n");
      out.write("    <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Start -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- Header End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Contact Start -->\r\n");
      out.write("    <div class=\"container-xxl py-5\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"text-center wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                \r\n");
      out.write("                <h1 class=\"mb-5\"> User Login Page</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row g-4\">\r\n");
      out.write("            \r\n");
      out.write("            ");
 String reg = (String)request.getAttribute("reg");
                      
                      if(reg!=null)
                      {
                    	  
                      
      out.write(" \r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-12\">\r\n");
      out.write("					  <h4 class=\"contact-title\">");
out.print(reg);
      out.write("</h4>\r\n");
      out.write("					  \r\n");
      out.write("					  </div>\r\n");
      out.write("					  ");
 } 
      out.write("\r\n");
      out.write("					  \r\n");
      out.write("		 ");
 String pass = (String)request.getAttribute("pass");
                      
                      if(pass!=null)
                      {
                    	  
                      
      out.write(" \r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-12\">\r\n");
      out.write("					  <h4 class=\"contact-title\">");
out.print(pass);
      out.write("</h4>\r\n");
      out.write("					  \r\n");
      out.write("					  </div>\r\n");
      out.write("					  ");
 } 
      out.write("\r\n");
      out.write("					  \r\n");
      out.write("					   ");
 String msg = (String)request.getAttribute("msg");
                      
                      if(msg!=null)
                      {
                    	  
                      
      out.write(" \r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-12\">\r\n");
      out.write("					  <h4 class=\"contact-title\">");
out.print(msg);
      out.write("</h4>\r\n");
      out.write("					  \r\n");
      out.write("					  </div>\r\n");
      out.write("					  ");
 } 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                 <div class=\"container-fluid contact py-5\">\r\n");
      out.write("            <div class=\"container py-5\">\r\n");
      out.write("                <div class=\"p-5 bg-light rounded\">\r\n");
      out.write("                    <div class=\"row g-4\">\r\n");
      out.write("                       \r\n");
      out.write("                     \r\n");
      out.write("                  \r\n");
      out.write("                        \r\n");
      out.write("                         <div class=\"col-lg-7\">\r\n");
      out.write("                            <form action=\"UserController\" class=\"\" method=\"post\">\r\n");
      out.write("                               \r\n");
      out.write("                                <input type=\"email\" name=\"email\" class=\"w-100 form-control border-0 py-3 mb-4\" placeholder=\"Enter Your Email\">\r\n");
      out.write("                                \r\n");
      out.write("                                <input type=\"password\" name=\"password\" class=\"w-100 form-control border-0 py-3 mb-4\" placeholder=\"Enter Your Password\">\r\n");
      out.write("                                <button class=\"w-100 btn form-control border-secondary py-3 bg-white text-primary \" name=\"action\" value=\"login\" type=\"submit\">Login</button>\r\n");
      out.write("                                \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                     <div class=\"col-lg-5\">\r\n");
      out.write("                            \r\n");
      out.write("                            <h4><a href=\"user-forgot-pass.jsp\">Forgot Password?</a></h4>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"user-register.jsp\">Sign Up</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Contact End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer Start -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"container-fluid bg-dark text-light footer pt-5 mt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("        <div class=\"container py-5\">\r\n");
      out.write("            <div class=\"row g-5\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <h4 class=\"text-white mb-3\">Quick Link</h4>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">About Us</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Contact Us</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Privacy Policy</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">FAQs & Help</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <h4 class=\"text-white mb-3\">Contact</h4>\r\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>123 Street, New York, USA</p>\r\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+012 345 67890</p>\r\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>info@example.com</p>\r\n");
      out.write("                    <div class=\"d-flex pt-2\">\r\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <h4 class=\"text-white mb-3\">Gallery</h4>\r\n");
      out.write("                    <div class=\"row g-2 pt-2\">\r\n");
      out.write("                        <div class=\"col-4\">\r\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/course-1.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-4\">\r\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/course-2.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-4\">\r\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/course-3.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-4\">\r\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/course-2.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-4\">\r\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/course-3.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-4\">\r\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/course-1.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <h4 class=\"text-white mb-3\">Newsletter</h4>\r\n");
      out.write("                    <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>\r\n");
      out.write("                    <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\r\n");
      out.write("                        <input class=\"form-control border-0 w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Your email\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2\">SignUp</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"copyright\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                        &copy; <a class=\"border-bottom\" href=\"#\">Your Site Name</a>, All Right Reserved.\r\n");
      out.write("\r\n");
      out.write("                        <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                        Designed By <a class=\"border-bottom\" href=\"https://htmlcodex.com\">HTML Codex</a><br><br>\r\n");
      out.write("                        Distributed By <a class=\"border-bottom\" href=\"https://themewagon.com\">ThemeWagon</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-end\">\r\n");
      out.write("                        <div class=\"footer-menu\">\r\n");
      out.write("                            <a href=\"\">Home</a>\r\n");
      out.write("                            <a href=\"\">Cookies</a>\r\n");
      out.write("                            <a href=\"\">Help</a>\r\n");
      out.write("                            <a href=\"\">FQAs</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Back to Top -->\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("    \r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
