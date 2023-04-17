/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-17 07:28:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp._0417_005fJSP_005f프로그래밍;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class J02_005f쿠키가져오기_005f겟쿠키_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>쿠키설정</title>\r\n");
      out.write("  <style>\r\n");
      out.write("    body{\r\n");
      out.write("      text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h1>쿠키 가져오기(getCookie)</h1>\r\n");
      out.write("  ");

     // 쿠키 배열 처리
     // Cookie[] 쿠키 = 요청.겟쿠키스();
     Cookie[] cookies = request.getCookies(); // 여러개의 쿠키 가져오기

     // 만약 쿠키가 한개도 없다면(빈 값 null) 수행 안한다.
     // 쿠키가 1개라도 있다면 수행한다. (쿠키값이 널이 아니면)
     // Cookie newCookie = new Cookie("키(key)", "값(value)");
     // Cookie newCookie = new Cookie("sungmin_cookie1", "첫번째쿠키값입니다");
     // getName()=> 키 "키(key)" => "sungmin_cookie1"
     // getValue()=> 값 "값(value)" => "첫번째쿠키값입니다"
     if(cookies != null ){
        for(Cookie item : cookies){
            String cookieName = item.getName();  // 쿠키 키(KEY)이름 => 쿠키이름
            // 쿠키 이름(키 KEY) 검색 : "sungmin_cookie1"
            if( cookieName.equals("sungmin_cookie1") ){
                out.println("찾았다: " + "sungmin_cookie1 ==" + cookieName);
                out.println("쿠키 값 => " + "cookieValue");
            }
        }
     }
  
      out.write("\r\n");
      out.write("  ");

  // 쿠키 배열 처리
  // Cookie[] 쿠키 = 요청.겟쿠키스();
  

  // 만약 쿠키가 한개도 없다면(빈 값 null) 수행 안한다.
  // 쿠키가 1개라도 있다면 수행한다. (쿠키값이 널이 아니면)
  // Cookie newCookie = new Cookie("키(key)", "값(value)");
  // Cookie newCookie = new Cookie("sungmin_cookie1", "첫번째쿠키값입니다");
  // getName()=> 키 "키(key)" => "sungmin_cookie1"
  // getValue()=> 값 "값(value)" => "첫번째쿠키값입니다"
  if(cookies != null ){
     for(Cookie item : cookies){
         String cookieName = item.getName();  // 쿠키 키(KEY)이름 => 쿠키이름
         // 쿠키 이름(키 KEY) 검색 : "sungmin_cookie7"
         if( cookieName.equals("sungmin_cookie7") ){
             out.println("찾았다: " + "sungmin_cookie7 ==" + cookieName);
             out.println("쿠키 값 => " + "cookieValue");
         }
     }
  }

      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
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
