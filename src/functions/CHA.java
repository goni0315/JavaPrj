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
					System.out.println("0���� 100������ ������ �Է��ϼ���>");
				System.out.println("������ �Է��ϼ���>");
				point = sc.nextInt();
			} while (point < 0 || point > 100);
			total += point;
			count++;
			do {
				System.out.println("�߰� �Է� �Ͻðڽ��ϱ�? (1.��    2.�ƴϿ�)");
				menu = sc.nextInt();
				if (menu == 1)
					break;
				else if (menu == 2) {
					avg = total / count;
					System.out.println("�� �� : " + total);
					System.out.println("�� �� : " + avg);
					break imout;
				} else
					System.out.println("1�̳� 2�� �Է����ּ���");
			} while (true);

		}
	}
}
