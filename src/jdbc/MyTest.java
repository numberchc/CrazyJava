package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * ×Ô¼ºÁ·Ï°Ð´µÄ
 * @author chenhuichang
 *
 */
public class MyTest {
	
	static String driver;
	static String url;
	static String user;
	static String pass;
	
	public static void main(String[] args) throws Exception{
		initParam("oracle.ini");
		Class.forName(driver);
		try(
				Connection conn = DriverManager.getConnection(url, user, pass);
				Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("select * from jdbc_test");
				){
			while(rs.next()){
				System.out.println(rs.getString(1) +"\t"+ rs.getString(2) +"\t"+ rs.getString(3));
			}
		}
	}

	private static void initParam(String file) throws FileNotFoundException, IOException {
		Properties propertis = new Properties();
		propertis.load(new FileInputStream(file));
		driver = propertis.getProperty("driver");
		url = propertis.getProperty("url");
		user = propertis.getProperty("user");
		pass = propertis.getProperty("pass");
	}
}
