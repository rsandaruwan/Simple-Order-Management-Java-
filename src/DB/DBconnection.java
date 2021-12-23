package DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class DBconnection {
        public static Connection connect(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1","root","");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return conn;
    }
    
}

