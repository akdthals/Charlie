<%@ 
    page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import = "kurly.KurlyDAO" %>

<% 
    request.setCharacterEncoding("UTF-8"); 
%>

<jsp:useBean id="kurlyDTO" class="kurly.KurlyDTO" scope="page"/>
<jsp:setProperty name="kurlyDTO" property="user_id" />
<jsp:setProperty name="kurlyDTO" property="user_pw" />

<%
    if(
           kurlyDTO.getUser_id()==null
        || kurlyDTO.getUser_pw()==null
    ){
%>
    <script>
        alert("빈값은 허용하지 않습니다. \n확인하고 다시시도해주세요");
        history.go(-1);
    </script>
<%
    }
    else{
        KurlyDAO kurlyDAO = new KurlyDAO();
        int result = kurlyDAO.signin( kurlyDTO.getUser_id(), kurlyDTO.getUser_pw() );
%>
        

        <% 
            if(result==1){ 
                session.setAttribute("user_id", kurlyDTO.getUser_id());
        %>
            <script>                
                alert("로그인 되었습니다.");
                location.href = "./kurly_main.jsp";
            </script>
        <% 
            }
            else if(result==0){ 
        %>
                <script>
                    alert(  <%= result %> );
                    alert("로그인 실패 되었습니다. \n비밀번호 확인하고 다시 시도하세요");
                    history.go(-1);
                </script>
        <%
            }      
            else if(result==-1){ 
        %>
                <script>
                    alert(<%= result %> );
                    alert("로그인 실패 되었습니다. \n아이디를 확인하고 다시 시도하세요");
                    history.go(-1);
                </script>
        <%
            }              
            else { 
        %>
                <script>
                    alert(<%= result %> );
                    alert("로그인 실패 되었습니다. \n 회원가입 후 다시 시도하세요");
                    window.location.href = "kurly_signup.jsp";
                </script>
        <%
            }
        %>


<%
    }
%>


