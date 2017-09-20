package capsule;

import java.util.Scanner;

public class Exam {
	int kor;
	int eng;
	int soc;

	public static void printExam(Exam[] exams) {
		double total, avg;
		System.out.println("����������������������������������������������������������");
		System.out.println("��      �Ͱ� ������ 	    ��");
		System.out.println("����������������������������������������������������������");

		for (int i = 0; i < 3; i++) {
			int kors, engs, socs;
			kors = exams[i].kor;
			engs = exams[i].eng;
			socs = exams[i].soc;
			total = kors + engs + socs;
			avg = total / 3.0;
			System.out.println("  ���   ����     : " + kors);
			System.out.println("  ����   ����     : " + socs);
			System.out.println("  �ܱ���   ����   : " + engs);
			System.out.println("  ���� : " + total);
			System.out.printf("  ��� : %.2f\n", avg);
			System.out.println("---------------------------");
		}
	}

	public static void inputExam(Exam[] exams) {
		int kors = 0, engs = 0, socs = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������������������������");
		System.out.println("��       �Ͱ� �����Է�       ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("��    �� ��� �� ���� �� �ܱ��� ��");
		System.out.println("����������������������������������������������������������");
		for (int i = 0; i < 3; i++) {
			do {
				if (kors < 0 || kors > 100 || socs < 0 || socs > 100 || engs < 0 || engs > 100)
					System.out.println("0���� 100������ ������ �Է����ּ���-_-");
				System.out.print(" ����  �Է�   : ");
				kors = scan.nextInt();
				socs = scan.nextInt();
				engs = scan.nextInt();
			} while (kors < 0 || kors > 100 || socs < 0 || socs > 100 || engs < 0 || engs > 100);

			exams[i].kor = kors;
			exams[i].eng = engs;
			exams[i].soc = socs;
		}
	}

}
