import java.util.Scanner;

public class ExamPoint2 {
	public static void main(String[] args) {

		
		int total = 0, menu = 0;
		double avg = 0;
		int[] kors = new int[3];
		int[] socs = new int[3];
		int[] engs = new int[3];

		Scanner scan = new Scanner(System.in);

		IMOUT: while (true) {
			System.out.println("����������������������������������������������������������");
			System.out.println("��         �Ͱ� �޴�                                ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("\t1.���� �Է�  ");
			System.out.println("\t2.���� ���  ");
			System.out.println("\t3.��   ��    ");
			System.out.print("\t �� ��> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1: {
				
				int kor = 0, eng = 0, soc = 0;
				
				System.out.println("����������������������������������������������������������");
				System.out.println("��         �Ͱ� �����Է�                          ��");
				System.out.println("����������������������������������������������������������");

				for (int i = 0; i < 3; i++) {
					
					do {
						if (kor < 0 || kor > 100)
							System.out.println("0���� 100������ ������ �Է����ּ���-_-");
						System.out.print(" ���  ����   : ");
						kor = scan.nextInt();
					} while (kor < 0 || kor > 100);
					
					do {
						if (soc < 0 || soc > 100)
							System.out.println("0���� 100������ ������ �Է����ּ���-_-");
						System.out.print(" ����  ����   : ");
						soc = scan.nextInt();
					} while (soc < 0 || soc > 100);
					
					do {
						if (eng < 0 || eng > 100)
							System.out.println("0���� 100������ ������ �Է����ּ���-_-");
						System.out.print(" �ܱ���  ����   : ");
						eng = scan.nextInt();
						System.out.println("--------------------");
					} while (eng < 0 || eng > 100);

					kors[i] = kor;
					socs[i] = soc;
					engs[i] = eng;

				}
			}
				break;

			case 2: {
				
				int kor = 0, eng = 0, soc = 0;

				System.out.println("����������������������������������������������������������");
				System.out.println("��         �Ͱ� ������                          ��");
				System.out.println("����������������������������������������������������������");

				for (int i = 0; i < 3; i++) {
					kor = kors[i];
					soc = socs[i];
					eng = engs[i];
					total = kor + eng + soc;
					avg = total / 3.0;
					System.out.println(" ���   ����     : " + kor);
					System.out.println(" ����   ����     : " + soc);
					System.out.println(" �ܱ���   ����     : " + eng);
					System.out.println(" ���� : " + total);
					System.out.printf(" ��� : %.2f\n", avg);
					System.out.println("------------------");
				}
			}
				break;
			

			case 3:
				System.out.println("\t���α׷��� ����Ǿ����ϴ�.");
				break IMOUT;

			default:
				System.out.println("1, 2, 3 �� �ϳ��� ���� �Է��� �ּ���^^");
			}
		}
	}

}
