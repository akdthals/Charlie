package kurly;
import java.sql.*;
import java.util.*;


public class KurlyDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public KurlyDAO(){
        try{
            String URL = "jdbc:mysql://localhost:3306/user";
            String ID = "root";
            String PW = "1234";
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, ID, PW);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public int signup(KurlyDTO kurlyDTO ){
        String SQL = "INSERT INTO kurly(user_id, user_pw, user_name, user_email, user_hp, user_address, user_gender, user_birth, user_add, user_chk) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, kurlyDTO.getUser_id());
            ps.setString(2, kurlyDTO.getUser_pw());
            ps.setString(3, kurlyDTO.getUser_name());
            ps.setString(4, kurlyDTO.getUser_email());
            ps.setString(5, kurlyDTO.getUser_hp());
            ps.setString(6, kurlyDTO.getUser_address());
            ps.setString(7, kurlyDTO.getUser_gender());
            ps.setString(8, kurlyDTO.getUser_birth());
            ps.setString(9, kurlyDTO.getUser_add());
            ps.setString(10, kurlyDTO.getUser_chk());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int update(KurlyDTO kurlyDTO){
        String SQL = "UPDATE kurly set user_pw =? , user_name=?, user_email=?, user_hp=?, user_address=?, user_gender=?, user_birth=?, user_add=?, user_chk=? where user_id=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, kurlyDTO.getUser_pw());
            ps.setString(2, kurlyDTO.getUser_name());
            ps.setString(3, kurlyDTO.getUser_email());
            ps.setString(4, kurlyDTO.getUser_hp());
            ps.setString(5, kurlyDTO.getUser_address());
            ps.setString(6, kurlyDTO.getUser_gender());
            ps.setString(7, kurlyDTO.getUser_birth());
            ps.setString(8, kurlyDTO.getUser_add());
            ps.setString(9, kurlyDTO.getUser_chk());
            ps.setString(10, kurlyDTO.getUser_id());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int delete(KurlyDTO kurlyDTO){
        String SQL = "DELETE FROM kurly where user_id=? AND user_pw=?";
        try{
            ps=conn.prepareStatement(SQL);
            ps.setString(1, kurlyDTO.getUser_id());
            ps.setString(2, kurlyDTO.getUser_pw());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int signin(String user_id, String user_pw){
       
        try{
            String SQL = "SELECT user_pw FROM kurly where user_id=?";
            ps = conn.prepareStatement(SQL);
            ps.setString(1, user_id);
            rs = ps.executeQuery();

            if(rs.next()){
                if(rs.getString(1).equals(user_pw)){
                    return 1;
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
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -2;
    }
    public List<KurlyDTO> getJoinList(){
        List<KurlyDTO> list = new ArrayList<>();
        String SQL = "SELECT * from kurly";
        try{
            ps =conn.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
                KurlyDTO kurlyDTO = new KurlyDTO();
                kurlyDTO.setUser_id(rs.getString("user_id"));
                kurlyDTO.setUser_id(rs.getString("user_pw"));
                kurlyDTO.setUser_id(rs.getString("user_name"));
                kurlyDTO.setUser_id(rs.getString("user_email"));
                kurlyDTO.setUser_id(rs.getString("user_hp"));
                kurlyDTO.setUser_id(rs.getString("user_address"));
                kurlyDTO.setUser_id(rs.getString("user_gender"));
                kurlyDTO.setUser_id(rs.getString("user_birth"));
                kurlyDTO.setUser_id(rs.getString("user_add"));
                kurlyDTO.setUser_id(rs.getString("user_chk"));
                list.add(kurlyDTO);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){conn.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return list;
    }
}
