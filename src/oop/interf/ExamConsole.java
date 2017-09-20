package oop.interf;
import java.util.Scanner;
import oop.interf.Exam;

public abstract class ExamConsole {

	private Exam exam = newExam();// new NewlecExam ������
	
	public abstract Exam newExam(); // ������ ��Ű����
	
	
	public  int inputMenu() {
		int menu;
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������������������������");
		System.out.println("��         �Ͱ� �޴�         ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1.���� �Է�  ");
		System.out.println("\t2.���� ���  ");
		System.out.println("\t3.��   ��    ");
		System.out.print("\t �� ��> ");
		menu = scan.nextInt();
		return menu;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		int kor = 0, eng = 0, soc = 0;
		System.out.println("����������������������������������������������������������");
		System.out.println("��       �Ͱ� �����Է�       ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("��    �� ��� �� ���� �� �ܱ��� ��");
		System.out.println("����������������������������������������������������������");
		
		do {
			if (kor < 0 || kor > 100 || soc < 0 || soc > 100 || eng < 0 || eng > 100)
				System.out.println("0���� 100������ ������ �Է����ּ���-_-");
			System.out.print(" ����  �Է�   : ");
			kor = scan.nextInt();
			soc = scan.nextInt();
			eng = scan.nextInt();
			
			
		} while (kor < 0 || kor > 100 || soc < 0 || soc > 100 || eng < 0 || eng > 100);
		System.out.println("----------------------------");
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setSoc(soc);

	}



	public void print() {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int soc = exam.getSoc();
		double total, avg;
		total = exam.total();
		avg = exam.avg();// total / 3.0;

		System.out.println("����������������������������������������������������������");
		System.out.println("��      �Ͱ� ������ 	    ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("  ���   ����     : " + kor);
		System.out.println("  ����   ����     : " + soc);
		System.out.println("  �ܱ���   ����   : " + eng);
		
		onprint(exam);
		
		System.out.println("  ���� : " + total);
		System.out.printf("  ��� : %.2f\n", avg);
		System.out.println("---------------------------");
	}


	protected abstract void onprint(Exam exam);
		

}
