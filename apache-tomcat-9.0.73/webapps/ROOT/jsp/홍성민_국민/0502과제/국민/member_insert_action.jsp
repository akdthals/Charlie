<%@
    page
    language="java" 
    contentType ="text/html; charset=UTF-8"
    pageEncoding = "UTF-8"
%>

<%@ page import = "member.MemberDAO"%>
<%@ page import = "java.io.PrintWriter"%>
<% 
    request.setCharacterEncoding("UTF-8");
%>


<jsp:useBean id="memberDTO" class="member.MemberDTO" scope="page"/>
<jsp:setProperty name="memberDTO" property="menu1"/>
<jsp:setProperty name="memberDTO" property="menu2"/>
<jsp:setProperty name="memberDTO" property="menu3"/>
<jsp:setProperty name="memberDTO" property="menu4"/>
<jsp:setProperty name="memberDTO" property="menu5"/>
<jsp:setProperty name="memberDTO" property="menu6"/>
<jsp:setProperty name="memberDTO" property="menu7"/>
<jsp:setProperty name="memberDTO" property="menu8"/>
<jsp:setProperty name="memberDTO" property="menu9"/>
<jsp:setProperty name="memberDTO" property="menu10"/>
<jsp:setProperty name="memberDTO" property="menu11"/>
<jsp:setProperty name="memberDTO" property="menu12"/>


<%
if(memberDTO.getMenu1() == null 
|| memberDTO.getMenu2() == null 
|| memberDTO.getMenu3() == null 
|| memberDTO.getMenu4() == null 
|| memberDTO.getMenu5() == null 
|| memberDTO.getMenu6() == null 
|| memberDTO.getMenu7() == null 
|| memberDTO.getMenu8() == null 
|| memberDTO.getMenu9() == null 
|| memberDTO.getMenu10() == null 
|| memberDTO.getMenu11() == null 
|| memberDTO.getMenu12() == null 
){

    PrintWriter script = response.getWriter();
    script.println(" <script> ") ;
    script.println("alert('빈값이 있는 항목이 있습니다 .\\n확인하고 다시 시도해주세요.')");
    script.println("history.back()");
    script.println(" </script> ");
        
    }
    
    else{
        MemberDAO memberDAO = new MemberDAO();
        int result = memberDAO.signup(memberDTO);
        if(result==-1){
        
    %>
                <script>
                    alert('아이디와 비밀번호를 다시 확인해 주세요');    
                    history.go(-1);
                </script>
    <%                
            }
            else{
            session.setAttribute("menu1",memberDTO.getMenu1());
    %>
                
                <script>
                  alert('회원가입을 축하드립니다.');
                  window.location.href='./main.jsp';
                </script>

    <%
            }
        }

        
    %>


