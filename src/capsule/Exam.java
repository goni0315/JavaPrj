package capsule;

import java.util.Scanner;

public class Exam {
	int kor;
	int eng;
	int soc;

	public static void printExam(Exam[] exams) {
		double total, avg;
		System.out.println("┌───────────────────────────┐");
		System.out.println("│      맹건 시험결과 	    │");
		System.out.println("└───────────────────────────┘");

		for (int i = 0; i < 3; i++) {
			int kors, engs, socs;
			kors = exams[i].kor;
			engs = exams[i].eng;
			socs = exams[i].soc;
			total = kors + engs + socs;
			avg = total / 3.0;
			System.out.println("  언어   영역     : " + kors);
			System.out.println("  국사   영역     : " + socs);
			System.out.println("  외국어   영역   : " + engs);
			System.out.println("  총합 : " + total);
			System.out.printf("  평균 : %.2f\n", avg);
			System.out.println("---------------------------");
		}
	}

	public static void inputExam(Exam[] exams) {
		int kors = 0, engs = 0, socs = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│       맹건 성적입력       │");
		System.out.println("┝────┬──────┬──────┬────────┤");
		System.out.println("│    │ 언어 │ 국사 │ 외국어 │");
		System.out.println("└────┴──────┴──────┴────────┘");
		for (int i = 0; i < 3; i++) {
			do {
				if (kors < 0 || kors > 100 || socs < 0 || socs > 100 || engs < 0 || engs > 100)
					System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
				System.out.print(" 성적  입력   : ");
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
