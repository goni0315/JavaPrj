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
			case 1: // 게시글 입력
				inputNotice();
				break;
			case 2: // 게시글 조회
				listNotice();
				break;
			case 3:
				System.out.println("\tSystem : 프로그램 종료");
				break out;
			}
		}

	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│         맹건 메뉴         │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1.게시글 입력  ");
		System.out.println("\t2.게시글 조회  ");
		System.out.println("\t3.  종	료  ");
		System.out.print("\t>>_ ");
		int menu = scan.nextInt();
		return menu;
	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
		
		/*String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
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
		con.close();*/
		
		List<Notice> list = service.getList();
		
		//------View-------------------------------------------------------------------
		
		for(Notice n : list)
			System.out.printf("ID : %s   TITLE : %s 	CONTENT : %s	DATE : %s	HIT : %d\n",
					n.getId(), n.getTitle(), n.getContent(), n.getRegDate(), n.getHit());
		

	}
		
	private static void inputNotice() throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = scan.nextLine();
		System.out.print("이 름  입력 : ");
		String title = scan.nextLine();
		System.out.print("내 용  입력 : ");
		String content = scan.nextLine();
		System.out.print("작성자 입력 : ");
		String writer = scan.nextLine();
		

		service.insert(id, title, content,writer);
		
		/*String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
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
*/
	}

}
