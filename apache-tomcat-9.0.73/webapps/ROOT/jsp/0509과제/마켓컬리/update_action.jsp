<%@
    page language= "java"
    contentType = "text/html; charset=UTF-8"
    pageEncoding = "UTF-8"
%>

<%@ page import = "kurly.KurlyDAO"%>

<%
    request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="kurlyDTO" class="kurly.KurlyDTO" scope="page"/>
<jsp:setProperty name="kurlyDTO" property="user_id"/>
<jsp:setProperty name="kurlyDTO" property="user_pw"/>
<jsp:setProperty name="kurlyDTO" property="user_name"/>
<jsp:setProperty name="kurlyDTO" property="user_email"/>
<jsp:setProperty name="kurlyDTO" property="user_hp"/>
<jsp:setProperty name="kurlyDTO" property="user_address"/>
<jsp:setProperty name="kurlyDTO" property="user_gender"/>
<jsp:setProperty name="kurlyDTO" property="user_birth"/>
<jsp:setProperty name="kurlyDTO" property="user_add"/>
<jsp:setProperty name="kurlyDTO" property="user_chk"/>

<%
if(   kurlyDTO.getUser_id()==null
||  kurlyDTO.getUser_pw()==null
||  kurlyDTO.getUser_name()==null
||  kurlyDTO.getUser_email()==null
||  kurlyDTO.getUser_hp()==null
||  kurlyDTO.getUser_address()==null
||  kurlyDTO.getUser_gender()==null
||  kurlyDTO.getUser_birth()==null
||  kurlyDTO.getUser_add()==null
||  kurlyDTO.getUser_chk()==null
 ){
%>
    <script>
    alert("빈값이 있습니다\n다시 시도해 주세요.");
    history.back();
    </script>
<%
}
else{
    KurlyDAO kurlyDAO = new KurlyDAO();
    int result = kurlyDAO.update(kurlyDTO);
%>

<%
    if(result == -1){
%>        
        <script>
            alert("<%=result%>");
            alert('동일한 아이디 없습니다 다시 확인 ㄱㄱ');
        </script>
<%
    }
    else{
%>
    <script>
        alert('수정완료');
        location.href="./kurly_main.jsp"
    </script>


<%       
    }
    }

    
%>


