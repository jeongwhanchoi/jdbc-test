package jdbcTest;

import java.sql.*;
import java.util.Properties;
public class jdbcTest{
	
	public static void main(String[] args) {
			Connection con=null;
			String url = "jdbc:mysql://localhost:3306/demo?useLegacyDatetimeCode=false&serverTimezone=Asia/Seoul";
			
			Properties properties = new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "0000");
			properties.setProperty("useSSL", "false");
			properties.setProperty("autoReconnect", "false");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				System.out.println("after forName");
				con=DriverManager.getConnection(url, properties);
				System.out.println("DBms connection success");
				System.out.println("DB load success");
			} catch (Exception e) {
				System.out.println("DB load fail "+e.toString());
			}
	}
}
