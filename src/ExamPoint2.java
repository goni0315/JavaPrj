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
			System.out.println("┌───────────────────────────┐");
			System.out.println("│         맹건 메뉴                                │");
			System.out.println("└───────────────────────────┘");
			System.out.println("\t1.성적 입력  ");
			System.out.println("\t2.성적 출력  ");
			System.out.println("\t3.종   료    ");
			System.out.print("\t 선 택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1: {
				
				int kor = 0, eng = 0, soc = 0;
				
				System.out.println("┌───────────────────────────┐");
				System.out.println("│         맹건 성적입력                          │");
				System.out.println("└───────────────────────────┘");

				for (int i = 0; i < 3; i++) {
					
					do {
						if (kor < 0 || kor > 100)
							System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
						System.out.print(" 언어  영역   : ");
						kor = scan.nextInt();
					} while (kor < 0 || kor > 100);
					
					do {
						if (soc < 0 || soc > 100)
							System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
						System.out.print(" 국사  영역   : ");
						soc = scan.nextInt();
					} while (soc < 0 || soc > 100);
					
					do {
						if (eng < 0 || eng > 100)
							System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
						System.out.print(" 외국어  영역   : ");
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

				System.out.println("┌───────────────────────────┐");
				System.out.println("│         맹건 시험결과                          │");
				System.out.println("└───────────────────────────┘");

				for (int i = 0; i < 3; i++) {
					kor = kors[i];
					soc = socs[i];
					eng = engs[i];
					total = kor + eng + soc;
					avg = total / 3.0;
					System.out.println(" 언어   영역     : " + kor);
					System.out.println(" 국사   영역     : " + soc);
					System.out.println(" 외국어   영역     : " + eng);
					System.out.println(" 총합 : " + total);
					System.out.printf(" 평균 : %.2f\n", avg);
					System.out.println("------------------");
				}
			}
				break;
			

			case 3:
				System.out.println("\t프로그램이 종료되었습니다.");
				break IMOUT;

			default:
				System.out.println("1, 2, 3 중 하나의 값을 입력해 주세요^^");
			}
		}
	}

}
