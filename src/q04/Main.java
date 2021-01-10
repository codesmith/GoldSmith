package q04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	// JavaDB ======================================================
	// private static final String URL = "jdbc:derby:db/sample";
	// private static final String USER = null;
	// private static final String PASS = null;
	// =============================================================

	// MySQL =======================================================
	// private static final String URL = "jdbc:mysql://localhost/sample";
	// private static final String USER = "root";
	// private static final String PASS = "mysql";
  // =============================================================

  // PostgreSQL ==================================================
	private static final String URL = "jdbc:postgresql://localhost:15432/";
	private static final String USER = "postgres";
	private static final String PASS = "postgres";
  // =============================================================
  public static void main(String[] args) {

    System.out.println("test");
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
			
			System.out.println(conn.getMetaData().getDatabaseProductName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
