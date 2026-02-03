import java.sql.*;
import javax.swing.*;
public class koneksi {
    Connection con;
    Statement stm;
    public void config(){
        try{
           // Class.forName("com.mysql.jdbc.Driver");
            con = config.configDB();
            stm = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal" + e.getMessage());
        }
    }
}
