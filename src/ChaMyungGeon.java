import java.util.Scanner;

public class ChaMyungGeon {

	public static void main(String[] args)   {
		int point = 0, total = 0;
		double avg = 0;
		int menu = 0;
		double i = 0;
		int cn = 0;

		Scanner sc = new Scanner(System.in);
		imout: 
			while (true) {
				System.out.println("����������������������������");
				System.out.println("��   ���� �Է�          ��");
				System.out.println("����������������������������");
				System.out.println("1.���� �Է� ");
				System.out.println("2.���� �� ��� Ȯ��");
				System.out.println("3.���α׷� ����");
				System.out.print("����> ");
				menu = sc.nextInt();

				switch (menu) {
				case 1:
					do {
						do {
							if (point < 0 || point > 100) 
								System.out.println("0���� 100������ ������ �Է��� �ּ���-_-");
							System.out.print("���� �Է� : ");
							point = sc.nextInt();
						} while (point < 0 || point > 100);
						total += point;
						i++;
						System.out.println("��� �Է��Ͻðڽ��ϱ�?  1.��     2.�ƴϿ�");
						cn = sc.nextInt();
					}while(cn == 1);
					break;
				case 2:
					avg = (double)total / i;
					System.out.println("�� ��:" + total);
					System.out.println("��� :" + avg);
					break;
				case 3:
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					break imout;
				default:
					System.out.println("1,2,3 �� �ϳ��� ����ּ���");

				}

			}
	}

}
