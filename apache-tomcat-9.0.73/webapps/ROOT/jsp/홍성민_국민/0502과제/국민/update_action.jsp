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
%>
    <script>
        alert('입력이 안 된 항목이 있습니다. \n 확인하고 다시 시도해주세요. ');
        history.go(-1);
    </script>
<%
        
    }
    
    else{
        MemberDAO memberDAO = new MemberDAO();
        int result = memberDAO.update(memberDTO);
        if(result== -1){
%>
                <script>
                    alert('잘못된 아이디이거나 중복된 아이디 입니다 \n확인하고 다시 시도해주세요.');    
                    history.go(-1);
                </script>
    <%                
            }
            else{
    %>
                
                <script>    
                    alert('수정이완료되었습니다.');
                  window.location.href='./main.jsp';
                </script>

    <%
            }
        }

        
    %>


