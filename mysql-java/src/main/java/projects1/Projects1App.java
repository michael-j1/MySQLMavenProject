package projects1;

import java.sql.Connection;

import projects1.dao.DbConnection;

public class Projects1App {

	public static void main(String[] args) {
Connection conn = DbConnection.getConnection();
	}

}
