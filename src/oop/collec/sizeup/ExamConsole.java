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
		System.out.println("┌───────────────────────────┐");
		System.out.println("│         맹건 메뉴         │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1.성적 입력  ");
		System.out.println("\t2.성적 출력  ");
		System.out.println("\t3.종   료    ");
		System.out.print("\t 선 택> ");
		menu = scan.nextInt();
		return menu;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		int kor = 0, eng = 0, soc = 0;
		System.out.println("┌───────────────────────────┐");
		System.out.println("│       맹건 성적입력       │");
		System.out.println("┝────┬──────┬──────┬────────┤");
		System.out.println("│    │ 언어 │ 국사 │ 외국어 │");
		System.out.println("└────┴──────┴──────┴────────┘");

		do {
			if (kor < 0 || kor > 100 || soc < 0 || soc > 100 || eng < 0 || eng > 100)
				System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
			System.out.print(" 성적  입력   : ");
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

			System.out.println("┌───────────────────────────┐");
			System.out.println("│      맹건 시험결과 	    │");
			System.out.println("└───────────────────────────┘");

			int kor = exam.getKor();
			int eng = exam.getEng();
			int soc = exam.getSoc();
			System.out.println("  언어   영역     : " + kor);
			System.out.println("  국사   영역     : " + soc);
			System.out.println("  외국어   영역   : " + eng);
			System.out.println("  총합 : " + total);
			System.out.printf("  평균 : %.2f\n", avg);
			System.out.println("---------------------------");
		}
	}

}
