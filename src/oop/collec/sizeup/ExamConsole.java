package oop.collec.sizeup;

import java.util.Scanner;

import oop.collec.Exam;

public class ExamConsole {

	private Exam[] exams;
	private int index;

	private int capacity;

	public ExamConsole() {
		exams = new Exam[3];
		capacity = 3;

		for (int i = 0; i < 3; i++)
			exams[i] = new Exam();
	}

	public int inputMenu() {
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

		Exam exam = new Exam();

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setSoc(soc);

		if (index >= capacity) {
			Exam[] temp = new Exam[capacity + 2];
			for (int i = 0; i < exams.length; i++) {
				temp[i] = exams[i];
			}
			exams = temp;
		}

		exams[index++] = exam;

	}

	public void print() {
		Exam exam = new Exam();
		for (int i = 0; i < index; i++) {
			exam = exams[index];
			double total, avg;
			total = exam.total();
			avg = exam.avg();

			System.out.println("����������������������������������������������������������");
			System.out.println("��      �Ͱ� ������ 	    ��");
			System.out.println("����������������������������������������������������������");

			int kor = exam.getKor();
			int eng = exam.getEng();
			int soc = exam.getSoc();
			System.out.println("  ���   ����     : " + kor);
			System.out.println("  ����   ����     : " + soc);
			System.out.println("  �ܱ���   ����   : " + eng);
			System.out.println("  ���� : " + total);
			System.out.printf("  ��� : %.2f\n", avg);
			System.out.println("---------------------------");
		}
	}

}
