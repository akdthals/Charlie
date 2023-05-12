<%@
    page
    language = "java"
    contentType = "text/html; charset=UTF-8"
    pageEncoding = "UTF-8"
%>

<%@ page import = "member.MemberDAO"%>

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="memberDTO" class="member.MemberDTO"/>
<jsp:setProperty name="memberDTO" property="menu1"/>
<jsp:setProperty name="memberDTO" property="menu5"/>
<%
    if(
        memberDTO.getMenu1()==null ||
        memberDTO.getMenu5()==null 
    ){
%>
        <script>
            alert("빈값은 허용하지 않습니다.")
            history.go(-1);
        </script>

<%        
    }
    else{
        MemberDAO memberDAO = new MemberDAO();
        int result = memberDAO.delete(memberDTO);
%>
    <% if(result>=1){ %>
    <script>
        alert("회원탈퇴가 완료 되었습니다.")
        window.location.href="./main.jsp";
    </script>
<%
        session.invalidate();
        }
        else if(result==0){
%>
            <script>
                alert("비밀번호를 다시 확인해주세요.");
                history.go(-1);
            </script>    
<%
        }
        else {
%>
            <script>
                alert("아이디를 다시 확인해주세요.");
                history.go(-1);
            </script>
<%        
    }
}
%>
