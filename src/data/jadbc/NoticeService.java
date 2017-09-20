package data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.List;

public class NoticeService {

	public List<Notice> getList() throws ClassNotFoundException, SQLException{
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";
		// 드라이버 로드
		Class.forName("oracle.jdbc.OracleDriver");
		// 연결 / 인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// 실행
		Statement st = con.createStatement();
		// 결과가져오기
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Notice> list = new ArrayList<>();
		
		while(rs.next()) {
			Notice n = new Notice();
			n.setId(rs.getString("ID"));
			n.setTitle(rs.getString("TITLE"));
			n.setContent(rs.getString("CONTENT"));
			n.setRegDate(rs.getDate("REG_DATE"));
			n.setHit(rs.getInt("HIT"));
			list.add(n);
		}
		
		rs.close();
		st.close();
		con.close();
		return list;
	}

	public void insert(String id, String title, String content, String writer) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "INSERT INTO NOTICE(ID, TITLE, CONTENT, WRITER_ID, HIT)" + " VALUES('" + id + "','" + title + "','"
				+ content + "','" + writer + "'," + 0 + ")";

		// 드라이버 로드
		Class.forName("oracle.jdbc.OracleDriver");
		// 연결 / 인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// 실행
		Statement st = con.createStatement();

		st.executeUpdate(sql);
		st.close();
		con.close();
	}
	
}
