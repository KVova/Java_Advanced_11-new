package utils;

<<<<<<< HEAD
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	private static String USER_NAME = "root";
	private static String USER_PASSWORD = "root";
	private  static String URL = "jdbc:mysql://localhost/internet_magazine?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
	
	public static Connection  openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		DOMConfigurator.configure("loggerConfig.xml");	
		Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
		return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
	}	
	
}
=======
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.xml.DOMConfigurator;

public class ConnectionUtils {
	static String URL = "jdbc:mysql://localhost/internet_magazine?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
	static String USER_NAME = "root";
	static String USER_PASSWORD = "root";
	
	
	public static Connection connect() throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		DOMConfigurator.configure("loggerConfig.xml");
		Class.forName ("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
		return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
	}
<<<<<<< HEAD
}
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
=======
}
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
