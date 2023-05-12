package naver;
import java.sql.*;
import java.util.*;


public class NaverDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs= null;

    public NaverDAO(){
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
    public int signup(NaverDTO naver DTO){
        String SQL = "INSERT INTO naver (user_id)";
        try{
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }
}
