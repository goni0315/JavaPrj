package data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
		private static NoticeService service ;
		
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		service	= new NoticeService();
		out: 
		while (true) {

			switch (inputMenu()) {
			case 1: // �Խñ� �Է�
				inputNotice();
				break;
			case 2: // �Խñ� ��ȸ
				listNotice();
				break;
			case 3:
				System.out.println("\tSystem : ���α׷� ����");
				break out;
			}
		}

	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������������������������");
		System.out.println("��         �Ͱ� �޴�         ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1.�Խñ� �Է�  ");
		System.out.println("\t2.�Խñ� ��ȸ  ");
		System.out.println("\t3.  ��	��  ");
		System.out.print("\t>>_ ");
		int menu = scan.nextInt();
		return menu;
	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
		
		/*String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";
		// ����̹� �ε�
		Class.forName("oracle.jdbc.OracleDriver");
		// ���� / ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// ����
		Statement st = con.createStatement();
		// �����������
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
		con.close();*/
		
		List<Notice> list = service.getList();
		
		//------View-------------------------------------------------------------------
		
		for(Notice n : list)
			System.out.printf("ID : %s   TITLE : %s 	CONTENT : %s	DATE : %s	HIT : %d\n",
					n.getId(), n.getTitle(), n.getContent(), n.getRegDate(), n.getHit());
		

	}
		
	private static void inputNotice() throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String id = scan.nextLine();
		System.out.print("�� ��  �Է� : ");
		String title = scan.nextLine();
		System.out.print("�� ��  �Է� : ");
		String content = scan.nextLine();
		System.out.print("�ۼ��� �Է� : ");
		String writer = scan.nextLine();
		

		service.insert(id, title, content,writer);
		
		/*String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "INSERT INTO NOTICE(ID, TITLE, CONTENT, WRITER_ID, HIT)" + " VALUES('" + id + "','" + title + "','"
				+ content + "','" + writer + "'," + 0 + ")";

		// ����̹� �ε�
		Class.forName("oracle.jdbc.OracleDriver");
		// ���� / ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// ����
		Statement st = con.createStatement();

		st.executeUpdate(sql);
		st.close();
		con.close();
*/
	}

}
