import java.util.Scanner;

public class ExamPoint {
	public static void main(String[] args) {

		int kor = 0, eng = 0, soc = 0, total = 0, menu = 0;
		double avg = 0;


		Scanner scan = new Scanner(System.in);

		IMOUT:
			while(true) {
				System.out.println("����������������������������������������������������������");
				System.out.println("��         �Ͱ� �޴�         ��");
				System.out.println("����������������������������������������������������������");
				System.out.println("\t1.���� �Է�  ");
				System.out.println("\t2.���� ���  ");
				System.out.println("\t3.��   ��    ");
				System.out.print("\t �� ��> ");
				menu = scan.nextInt();

				switch(menu) {
				case 1:  	
					System.out.println("����������������������������������������������������������");
					System.out.println("��         �Ͱ� �����Է�     ��");
					System.out.println("����������������������������������������������������������");
					do {
						if(kor<0||kor>100)
							System.out.println("0���� 100������ ������ �Է����ּ���-_-");
						System.out.print(" ���  ����   : ");
						kor = scan.nextInt();

					}while(kor<0||kor>100);

					do {
						if(soc<0||soc>100)
							System.out.println("0���� 100������ ������ �Է����ּ���-_-");
						System.out.print(" ����  ����   : ");
						soc = scan.nextInt();
					}while(soc<0||soc>100);

					do {
						if(eng<0||eng>100)
							System.out.println("0���� 100������ ������ �Է����ּ���-_-");
						System.out.print(" �ܱ���  ����   : ");
						eng = scan.nextInt();

					}while(eng<0||eng>100);

					break;
				case 2: 
					total = kor + eng + soc;
					avg = total / 3.0;

					System.out.println("����������������������������������������������������������");
					System.out.println("��         �Ͱ� ������     ��");
					System.out.println("����������������������������������������������������������");
					for(int i = 0; i<3; i++){
						System.out.print(" ���   ����     : " + kor);
						if(kor>= 90)
							System.out.println("\tA+�Դϴ�");
						else if(kor<90&&kor>=85)
							System.out.println("\tB+�Դϴ�");
						else if(kor<85&&kor>=80)
							System.out.println("\tB �Դϴ�");
						else if(kor<80&&kor>=75)
							System.out.println("\tC+�Դϴ�");
						else if(kor<75&&kor>=70)
							System.out.println("\tC �Դϴ�");
						else if(kor<70&&kor>=65)
							System.out.println("\tD �Դϴ�");
						else
							System.out.println("\tF �Դϴ�, ����� �ϼ��䤻");


						System.out.print(" ���   ����     : " + soc);
						if(soc>= 90)
							System.out.println("\tA+�Դϴ�");
						else if(soc<90&&soc>=85)
							System.out.println("\tB+�Դϴ�");
						else if(soc<85&&soc>=80)
							System.out.println("\tB �Դϴ�");
						else if(soc<80&&soc>=75)
							System.out.println("\tC+�Դϴ�");
						else if(soc<75&&soc>=70)
							System.out.println("\tC �Դϴ�");
						else if(soc<70&&soc>=65)
							System.out.println("\tD �Դϴ�");
						else
							System.out.println("\tF �Դϴ�, ����� �ϼ��䤻");	


						System.out.print(" ���   ����     : " + eng);
						if(eng>= 90)
							System.out.println("\tA+�Դϴ�");
						else if(eng<90&&eng>=85)
							System.out.println("\tB+�Դϴ�");
						else if(eng<85&&eng>=80)
							System.out.println("\tB �Դϴ�");
						else if(eng<80&&eng>=75)
							System.out.println("\tC+�Դϴ�");
						else if(eng<75&&eng>=70)
							System.out.println("\tC �Դϴ�");
						else if(eng<70&&eng>=65)
							System.out.println("\tD �Դϴ�");
						else
							System.out.println("\tF �Դϴ�, ����� �ϼ��䤻");	
						System.out.println(" ���� : " + total);
						System.out.printf(" ��� : %.2f\n", avg);
						if(avg>=90)
							System.out.println("\t���� ���б� �Դϴ�.");
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
