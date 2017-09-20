package functions;
import java.util.Scanner;

public class CHA {

	public static void main(String[] args) {
		int point = 0, total = 0, menu = 0;
		double avg = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		imout: 
		while (true) {
			do {
				if (point < 0 || point > 100)
					System.out.println("0부터 100까지의 점수를 입력하세요>");
				System.out.println("성적을 입력하세요>");
				point = sc.nextInt();
			} while (point < 0 || point > 100);
			total += point;
			count++;
			do {
				System.out.println("추가 입력 하시겠습니까? (1.예    2.아니오)");
				menu = sc.nextInt();
				if (menu == 1)
					break;
				else if (menu == 2) {
					avg = total / count;
					System.out.println("총 점 : " + total);
					System.out.println("평 균 : " + avg);
					break imout;
				} else
					System.out.println("1이나 2를 입력해주세요");
			} while (true);

		}
	}
}
