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
		System.out.println("┌───────────────────────────┐");
		System.out.println("│      맹건 시험결과 	    │");
		System.out.println("└───────────────────────────┘");

		total = kor + eng + soc;
		avg = total / 3.0;
		System.out.println("  언어   영역     : " + kor);
		System.out.println("  국사   영역     : " + soc);
		System.out.println("  외국어   영역   : " + eng);
		System.out.println("  총합 : " + total);
		System.out.printf("  평균 : %.2f\n", avg);
		System.out.println("---------------------------");
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
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
	}

}
