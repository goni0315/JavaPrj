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
		System.out.print("ã���� �ϴ� ����  �Է��϶� : ");
		String str = scan.nextLine();

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%" + str + "%'";
		// ����̹� �ε�
		Class.forName("oracle.jdbc.OracleDriver");
		// ���� / ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// ����
		Statement st = con.createStatement();
		// �����������
		ResultSet rs = st.executeQuery(sql);
		if (rs.next() == false)
			System.out.println("��ġ�ϴ� ���� �����ϴ�");
		else
			while (rs.next())
				System.out.printf("ID : %s   TITLE : %s \n", rs.getString("ID"), rs.getString("title"));

		rs.close();
		st.close();
		con.close();
	}
}
