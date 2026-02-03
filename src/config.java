import java.sql.*;
public class config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/dbpegawai";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            System.err.println("Config eror" + e.getMessage());
        }
        return mysqlconfig;
    }
}