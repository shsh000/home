package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class UserDAO {
	// 데이터 연동
	public int join(String userID, String userPassword) {
		String sql = "INSERT INTO USER VALUES (?,?)";
		try {
			Connection conn = DatabaseUtil.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, userID);
			psmt.setString(2, userPassword);
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
