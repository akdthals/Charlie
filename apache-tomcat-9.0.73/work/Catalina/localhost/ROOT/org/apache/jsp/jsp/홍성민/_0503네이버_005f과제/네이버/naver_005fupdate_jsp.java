/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-10 04:47:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.홍성민._0503네이버_005f과제.네이버;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import naver.NaverDTO;
import naver.NaverDAO;

public final class naver_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("naver.NaverDAO");
    _jspx_imports_classes.add("naver.NaverDTO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        ");

            String loginId = null;
            if(session.getAttribute("id") != null){
                loginId = (String) session.getAttribute("id");
            }
            NaverDAO naverDAO = new NaverDAO();
            NaverDTO naverDTO = naverDAO.getJoin(loginId);
        
      out.write("\r\n");
      out.write("        <div class=\"title\">\r\n");
      out.write("            <h1>회원정보수정</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"./naver_delete.jsp\">회원삭제</a>\r\n");
      out.write("        <form name=\"signup\" id=\"signup\" method=\"post\" action=\"naver_update_action.jsp\">\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"id\" class=\"hide\">\r\n");
      out.write("                아이디<br><input maxlength=\"16\" autofocus required type=\"text\" name=\"id\" id=\"userId\" placeholder=\"아이디를 입력 하세요\" required autofocus>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"pw\">\r\n");
      out.write("                비밀번호<br><input maxlength=\"30\" autofocus required type=\"text\" name=\"pw\" id=\"userPw\" placeholder=\"비밀번호를 입력 하세요\" required autofocus>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"name\">\r\n");
      out.write("                이름<br><input maxlength=\"30\" autofocus required type=\"text\" name=\"name\" id=\"userName\" placeholder=\"이름을 입력 하세요\" required autofocus>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"birth\">\r\n");
      out.write("                생일<br><input  maxlength=\"9\" autofocus required type=\"text\" name=\"birth\" id=\"userBirth\" placeholder=\"생일을 입력 하세요\" required autofocus>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"gender\">\r\n");
      out.write("                성별<br>\r\n");
      out.write("                <select autofocus required name=\"gender\" id=\"gender\" required autofocus>\r\n");
      out.write("                    <option value=\"\" selected=\"성별\">성별</option>\r\n");
      out.write("                    <option value=\"남자\">남자</option>\r\n");
      out.write("                    <option value=\"여자\">여자</option>\r\n");
      out.write("                    <option value=\"선택안함\">선택안함</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"email\">\r\n");
      out.write("                이메일<br><input type=\"text\" name=\"email\" id=\"userEmail\" placeholder=\"이메일을 입력하세요\"required autofocus> \r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"hp\">\r\n");
      out.write("                휴대폰<br><input type=\"text\" name=\"hp\" id=\"userHp\" placeholder=\"휴대폰번호를 입력하세요\" required autofocus>\r\n");
      out.write("            </label>\r\n");
      out.write("            <button type=\"submit\">수정하기</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
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
