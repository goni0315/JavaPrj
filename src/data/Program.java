package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾고자 하는 값을  입력하라 : ");
		String str = scan.nextLine();

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%" + str + "%'";
		// 드라이버 로드
		Class.forName("oracle.jdbc.OracleDriver");
		// 연결 / 인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// 실행
		Statement st = con.createStatement();
		// 결과가져오기
		ResultSet rs = st.executeQuery(sql);
		if (rs.next() == false)
			System.out.println("일치하는 값이 없습니다");
		else
			while (rs.next())
				System.out.printf("ID : %s   TITLE : %s \n", rs.getString("ID"), rs.getString("title"));

		rs.close();
		st.close();
		con.close();
	}
}
