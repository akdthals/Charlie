package naver;
import java.sql.*;
import java.util.*;

public class NaverDAO {
    private Connection conn=null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public NaverDAO(){ 
        try{ 
            String dbURL = "jdbc:mysql://localhost:3306/user";
            String dbID = "root"; 
            String dbPW = "1234";

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC Driver loading Success");
            
            conn = DriverManager.getConnection(dbURL, dbID, dbPW);
            System.out.println("Database Connection Success");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public int insert(NaverDTO naverDTO){
        String SQL = "INSERT INTO member(id, pw, name, birth, gender, email, hp) VALUES(?,?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, naverDTO.getId());
            ps.setString(2, naverDTO.getPw());
            ps.setString(3, naverDTO.getName());
            ps.setString(4, naverDTO.getBirth());
            ps.setString(5, naverDTO.getGender());
            ps.setString(6, naverDTO.getEmail());
            ps.setString(7, naverDTO.getHp());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null ){rs.close();}
                if(ps != null ){ps.close();}
                if(conn != null ){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int signin(String id, String pw){
        String SQL = "SELECT pw FROM member where id=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1).equals(pw)){
                    return -1;
                }
                else{
                    return 0;
                }
            }
            else{
                return -1;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null ){rs.close();}
                if(ps != null ){ps.close();}
                if(conn != null ){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int update(NaverDTO naverDTO){
        String SQL = "UPDATE member SET pw=?, name=?, birth=?, gender=?, email=?, hp=? where id=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, naverDTO.getPw());
            ps.setString(2, naverDTO.getName());
            ps.setString(3, naverDTO.getBirth());
            ps.setString(4, naverDTO.getGender());
            ps.setString(5, naverDTO.getEmail());
            ps.setString(6, naverDTO.getHp());
            ps.setString(7, naverDTO.getId());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null ){rs.close();}
                if(ps != null ){ps.close();}
                if(conn != null ){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int delete(NaverDTO naverDTO){
        String SQL = "DELETE FROM member where id=? AND pw=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, naverDTO.getId());
            ps.setString(2, naverDTO.getPw());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null ){rs.close();}
                if(ps != null ){ps.close();}
                if(conn != null ){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public NaverDTO getJoin(String id){
        NaverDTO naverDTO = new NaverDTO();
        String SQL = "SELECT * FROM member where id=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, id);

            rs = ps.executeQuery();
            if(rs.next()){
                naverDTO.setId(id);
                naverDTO.setPw(rs.getString("pw"));
                naverDTO.setName(rs.getString("name"));
                naverDTO.setBirth(rs.getString("birth"));
                naverDTO.setGender(rs.getString("gender"));
                naverDTO.setEmail(rs.getString("email"));
                naverDTO.setHp(rs.getString("hp"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null ){rs.close();}
                if(ps != null ){ps.close();}
                if(conn != null ){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return naverDTO;
    }
    public List<NaverDTO> getJoinList(){
        NaverDTO naverDTO = null;
        List<NaverDTO> list = new ArrayList<>();

        String SQL = "SELECT * FROM member";
        try{
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                naverDTO = new NaverDTO();
                naverDTO.setId(rs.getString("id"));
                naverDTO.setPw(rs.getString("pw"));
                naverDTO.setName(rs.getString("name"));
                naverDTO.setBirth(rs.getString("birth"));
                naverDTO.setGender(rs.getString("gender"));
                naverDTO.setEmail(rs.getString("email"));
                naverDTO.setHp(rs.getString("hp"));

                list.add(naverDTO);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null ){rs.close();}
                if(ps != null ){ps.close();}
                if(conn != null ){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return list;
    }
   
}
