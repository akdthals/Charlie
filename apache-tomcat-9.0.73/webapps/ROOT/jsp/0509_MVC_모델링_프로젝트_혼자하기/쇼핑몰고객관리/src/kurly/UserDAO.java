package kurly;
import java.sql.*;
import java.util.*;

public class UserDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;


    public UserDAO(){

        try{
                // 변수설정
                String URL = "jdbc:mysql://localhost:3306/user";
                String ID = "root";
                String PW = "1234";
                // 1. 데이터베이스 드라이버(JDBC)
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("JDBC Driver loading Success"); 

                // 2. 데이터베이스 컨넥션 인증 & 인가(URL, ID, PW
                conn = DriverManager.getConnection(URL, ID, PW);
                System.out.println("Database Connection Success");
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }

    public int signup(UserDTO userDTO){
        String SQL = "INSERT INTO kurly_table(user_id, user_pw, user_name, user_email, user_hp, user_addr, user_gender, user_birth) VALUES(?,?,?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, userDTO.getUser_id());
            ps.setString(2, userDTO.getUser_pw());
            ps.setString(3, userDTO.getUser_name());
            ps.setString(4, userDTO.getUser_email());
            ps.setString(5, userDTO.getUser_hp());
            ps.setString(6, userDTO.getUser_addr());
            ps.setString(7, userDTO.getUser_gender());
            ps.setString(8, userDTO.getUser_birth());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){rs.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int signin(String user_id, String user_pw){
        String SQL = "SELECT user_pw FROM kurly_table WHERE user_id=? ";
        try{
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
        catch(Exception e ){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){rs.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -2; 
    }
    public int update(UserDTO userDTO){
        String SQL = "UPDATE kurly_table SET user_pw=?, user_name=?, user_email=?, user_hp=?, user_addr=?, user_gender=?, user_birth=? WHERE user_id=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, userDTO.getUser_pw());
            ps.setString(2, userDTO.getUser_name());
            ps.setString(3, userDTO.getUser_email());
            ps.setString(4, userDTO.getUser_hp());
            ps.setString(5, userDTO.getUser_addr());
            ps.setString(6, userDTO.getUser_gender());
            ps.setString(7, userDTO.getUser_birth());
            ps.setString(8, userDTO.getUser_id());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){rs.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public int delete(String user_id, String user_pw){
        String SQL = "DELETE FROM kurly_table WHERE user_id=? AND user_pw=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, user_id);
            ps.setString(2, user_pw);
            
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(rs != null){rs.close();}
                if(ps != null){ps.close();}
                if(conn != null){rs.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }
    public UserDTO getJoin(String user_id){
        UserDTO userDTO = new UserDTO();

        String SQL = "SELECT * FROM kurly_table WHERE user_id=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, user_id);

            rs = ps.executeQuery();
            if(rs.next()){
                userDTO.setUser_id(user_id);
                userDTO.setUser_pw(rs.getString("user_pw"));
                userDTO.setUser_name(rs.getString("user_name"));
                userDTO.setUser_email(rs.getString("user_email"));
                userDTO.setUser_hp(rs.getString("user_hp"));
                userDTO.setUser_addr(rs.getString("user_addr"));
                userDTO.setUser_gender(rs.getString("user_gender"));
                userDTO.setUser_birth(rs.getString("user_birth"));
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
        return userDTO;
    }
    public List<UserDTO> getJoinList(){
        UserDTO userDTO = null;
        List<UserDTO> list= new ArrayList<>();

        String SQL = "SELECT * from kurly_table";
        try{
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                userDTO = new UserDTO();
                userDTO.setUser_id(rs.getString("user_id"));
                userDTO.setUser_pw(rs.getString("user_pw"));
                userDTO.setUser_name(rs.getString("user_name"));
                userDTO.setUser_email(rs.getString("user_email"));
                userDTO.setUser_hp(rs.getString("user_hp"));
                userDTO.setUser_addr(rs.getString("user_addr"));
                userDTO.setUser_gender(rs.getString("user_gender"));
                userDTO.setUser_birth(rs.getString("user_birth"));
                userDTO.setGaib_date(rs.getString("gaib_date"));

                list.add(userDTO);
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
