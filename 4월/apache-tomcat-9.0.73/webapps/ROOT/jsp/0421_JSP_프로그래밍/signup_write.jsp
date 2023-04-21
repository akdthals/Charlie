<%@ 
    page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>


<%@    
    page
    import="java.sql.*"
%>

<%
    request.setCharacterEncoding("UTF-8");
    
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String gender = request.getParameter("gender");
    String user_search = request.getParameter("user_search");
    String user_area = request.getParameter("user_area");
%>

<%

    Class.forName("com.mysql.jdbc.Driver");

  
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sm", "root", "1234");
    
    Statement st = conn.createStatement();

    String sql = "INSERT INTO sm( id, pw, gender, way, addr) VALUES(?,?,?,?,?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, id);
    ps.setString(2, pw);
    ps.setString(3, gender);
    ps.setString(4, user_search);
    ps.setString(5, user_area);

    ps.executeUpdate();

    ps.close();
    conn.close();

%>

<script>

    location.href="signup_view.jsp";

</script>



