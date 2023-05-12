<%@
    page language= "java"
    contentType = "text/html; charset=UTF-8"
    pageEncoding = "UTF-8"
%>

<%@ page import = "kurly.KurlyDAO"%>
<%@ page import = "kurly.KurlyDTO"%>

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
    if(
            kurlyDTO.getUser_id()==null
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
          alert("빈 항목을 모두 입력하세요!"); 
          history.back();
        </script>
        <%
            }
            else{
              KurlyDAO kurlyDAO = new KurlyDAO();
              int result = kurlyDAO.signup(kurlyDTO);
              if(result == -1){
        %>
        <script>
          alert("중복된 아이디입니다!");
          history.back();
        </script>
        <%
              }
              else{
        %>
        <script>
          alert("회원가입 축하드립니다!");
          location.href="./kurly_main.jsp";
        </script>
        <%
              }
            }
        %>