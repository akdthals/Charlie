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
    
    String name = request.getParameter("name");
    String hp = request.getParameter("hp");
    String addr = request.getParameter("addr");

%>


<%

    Class.forName("com.mysql.jdbc.Driver");

  
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sungmin", "root", "1234");
    
    Statement st = conn.createStatement();

    String sql = "INSERT INTO address(name, hp, addr) VALUES(?,?,?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, name);
    ps.setString(2, hp);
    ps.setString(3, addr);

    ps.executeUpdate();

    ps.close();
    conn.close();

%>

<script>

    location.href="todo_view.jsp";

</script>