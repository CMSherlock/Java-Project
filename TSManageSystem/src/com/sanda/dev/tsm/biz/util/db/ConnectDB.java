/**
 * 
 */
package com.sanda.dev.tsm.biz.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author erwin.wang
 *
 * 2018年10月15日 下午1:37:56
 */
public class ConnectDB {

	private static String url = "jdbc:mysql://localhost:3306/test";
	private static String username= "root";
	private static String password = "root";
	private static String driver = "com.mysql.jdbc.Driver";
	
	/**
	 * 
	 */
	public static Connection getConnectDB() {
		Connection conn = null;
		if(conn ==null){
			try {
				Class.forName(driver).newInstance();
				conn = DriverManager.getConnection(url, username,password);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	
}
