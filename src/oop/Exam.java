package oop;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int soc;

	public Exam() {
		this(1,2,3);
	}

	public Exam(int kor, int eng, int soc) {
		this.kor = kor;
		this.eng = eng;
		this.soc = soc;
	}

	public void print() {
		double total, avg;
		System.out.println("����������������������������������������������������������");
		System.out.println("��      �Ͱ� ������ 	    ��");
		System.out.println("����������������������������������������������������������");

		total = kor + eng + soc;
		avg = total / 3.0;
		System.out.println("  ���   ����     : " + kor);
		System.out.println("  ����   ����     : " + soc);
		System.out.println("  �ܱ���   ����   : " + eng);
		System.out.println("  ���� : " + total);
		System.out.printf("  ��� : %.2f\n", avg);
		System.out.println("---------------------------");
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
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
	}

}
