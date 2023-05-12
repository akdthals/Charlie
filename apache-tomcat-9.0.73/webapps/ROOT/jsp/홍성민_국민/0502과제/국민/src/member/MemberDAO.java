package member;
import java.sql.*;
import java.util.*;

/**
 * MemberDAO
 */
public class MemberDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;  
    public MemberDAO(){
        try{
            String URL= "jdbc:mysql://localhost:3306/user";
            String ID = "root";
            String PW = "1234";

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(URL, ID, PW);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public int signup(MemberDTO memberDTO){
        String SQL = "INSERT INTO bo(menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8, menu9, menu10, menu11, menu12) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, memberDTO.getMenu1());
            ps.setString(2, memberDTO.getMenu2());
            ps.setString(3, memberDTO.getMenu3());
            ps.setString(4, memberDTO.getMenu4());
            ps.setString(5, memberDTO.getMenu5());
            ps.setString(6, memberDTO.getMenu6());
            ps.setString(7, memberDTO.getMenu7());
            ps.setString(8, memberDTO.getMenu8());
            ps.setString(9, memberDTO.getMenu9());
            ps.setString(10, memberDTO.getMenu10());
            ps.setString(11, memberDTO.getMenu11());
            ps.setString(12, memberDTO.getMenu12());
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
    public int update(MemberDTO memberDTO){
        String SQL = "UPDATE bo SET menu2=?, menu3=?,menu4=? menu5=?, menu6=?, menu7=?, menu8=?, menu9=?, menu10=?, menu11=?, menu12=? where menu1=?";
        try{
            ps= conn.prepareStatement(SQL);
            
            ps.setString(1, memberDTO.getMenu2());
            ps.setString(2, memberDTO.getMenu3());
            ps.setString(3, memberDTO.getMenu4());
            ps.setString(4, memberDTO.getMenu5());
            ps.setString(5, memberDTO.getMenu6());
            ps.setString(6, memberDTO.getMenu7());
            ps.setString(7, memberDTO.getMenu8());
            ps.setString(8, memberDTO.getMenu9());
            ps.setString(9, memberDTO.getMenu10());
            ps.setString(10, memberDTO.getMenu11());
            ps.setString(11, memberDTO.getMenu12());
            ps.setString(12, memberDTO.getMenu1());
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
    public int delete(MemberDTO memberDTO){
        String SQL = "DELETE FROM bo where menu1=? AND menu5=?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, memberDTO.getMenu1());
            ps.setString(2, memberDTO.getMenu5());
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
    public MemberDTO getJoin(String menu1){
        MemberDTO memberDTO = new MemberDTO();

        String SQL = "SELECT * FROM bo where menu1=?";
        try{
            ps= conn.prepareStatement(SQL);

            ps.setString(1, menu1);
            rs = ps.executeQuery();

            if(rs.next()){
                memberDTO.setMenu1(menu1);
                memberDTO.setMenu2(rs.getString("menu2"));
                memberDTO.setMenu3(rs.getString("menu3"));
                memberDTO.setMenu4(rs.getString("menu4"));
                memberDTO.setMenu5(rs.getString("menu5"));
                memberDTO.setMenu6(rs.getString("menu6"));
                memberDTO.setMenu7(rs.getString("menu7"));
                memberDTO.setMenu8(rs.getString("menu8"));
                memberDTO.setMenu9(rs.getString("menu9"));
                memberDTO.setMenu10(rs.getString("menu10"));
                memberDTO.setMenu11(rs.getString("menu11"));
                memberDTO.setMenu12(rs.getString("menu12"));
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
        return memberDTO;
    }
    public List<MemberDTO> getJoinList(){
        MemberDTO memberDTO;
        List<MemberDTO> list = new ArrayList<>();

        String SQL = "SELECT * FROM bo";

        try{
            ps = conn.prepareStatement(SQL);
            rs= ps.executeQuery();
            while(rs.next()){
                memberDTO = new MemberDTO();
                memberDTO.setMenu1(rs.getString("menu1"));
                memberDTO.setMenu2(rs.getString("menu2"));
                memberDTO.setMenu3(rs.getString("menu3"));
                memberDTO.setMenu4(rs.getString("menu4"));
                memberDTO.setMenu5(rs.getString("menu5"));
                memberDTO.setMenu6(rs.getString("menu6"));
                memberDTO.setMenu7(rs.getString("menu7"));
                memberDTO.setMenu8(rs.getString("menu8"));
                memberDTO.setMenu9(rs.getString("menu9"));
                memberDTO.setMenu10(rs.getString("menu10"));
                memberDTO.setMenu11(rs.getString("menu11"));
                memberDTO.setMenu12(rs.getString("menu12"));

                list.add(memberDTO);
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