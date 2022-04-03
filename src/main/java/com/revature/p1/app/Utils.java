package com.revature.p1.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
	public static Connection createConnection() {
    String url = System.getenv("MY_CONN");
    try {
        Connection conn = DriverManager.getConnection(url);
        return conn;
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
}

}
