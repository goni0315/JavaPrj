import java.util.Scanner;

public class ExamPoint {
	public static void main(String[] args) {

		int kor = 0, eng = 0, soc = 0, total = 0, menu = 0;
		double avg = 0;


		Scanner scan = new Scanner(System.in);

		IMOUT:
			while(true) {
				System.out.println("┌───────────────────────────┐");
				System.out.println("│         맹건 메뉴         │");
				System.out.println("└───────────────────────────┘");
				System.out.println("\t1.성적 입력  ");
				System.out.println("\t2.성적 출력  ");
				System.out.println("\t3.종   료    ");
				System.out.print("\t 선 택> ");
				menu = scan.nextInt();

				switch(menu) {
				case 1:  	
					System.out.println("┌───────────────────────────┐");
					System.out.println("│         맹건 성적입력     │");
					System.out.println("└───────────────────────────┘");
					do {
						if(kor<0||kor>100)
							System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
						System.out.print(" 언어  영역   : ");
						kor = scan.nextInt();

					}while(kor<0||kor>100);

					do {
						if(soc<0||soc>100)
							System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
						System.out.print(" 국사  영역   : ");
						soc = scan.nextInt();
					}while(soc<0||soc>100);

					do {
						if(eng<0||eng>100)
							System.out.println("0부터 100사이의 점수를 입력해주세요-_-");
						System.out.print(" 외국어  영역   : ");
						eng = scan.nextInt();

					}while(eng<0||eng>100);

					break;
				case 2: 
					total = kor + eng + soc;
					avg = total / 3.0;

					System.out.println("┌───────────────────────────┐");
					System.out.println("│         맹건 시험결과     │");
					System.out.println("└───────────────────────────┘");
					for(int i = 0; i<3; i++){
						System.out.print(" 언어   영역     : " + kor);
						if(kor>= 90)
							System.out.println("\tA+입니다");
						else if(kor<90&&kor>=85)
							System.out.println("\tB+입니다");
						else if(kor<85&&kor>=80)
							System.out.println("\tB 입니다");
						else if(kor<80&&kor>=75)
							System.out.println("\tC+입니다");
						else if(kor<75&&kor>=70)
							System.out.println("\tC 입니다");
						else if(kor<70&&kor>=65)
							System.out.println("\tD 입니다");
						else
							System.out.println("\tF 입니다, 재수강 하세요ㅋ");


						System.out.print(" 언어   영역     : " + soc);
						if(soc>= 90)
							System.out.println("\tA+입니다");
						else if(soc<90&&soc>=85)
							System.out.println("\tB+입니다");
						else if(soc<85&&soc>=80)
							System.out.println("\tB 입니다");
						else if(soc<80&&soc>=75)
							System.out.println("\tC+입니다");
						else if(soc<75&&soc>=70)
							System.out.println("\tC 입니다");
						else if(soc<70&&soc>=65)
							System.out.println("\tD 입니다");
						else
							System.out.println("\tF 입니다, 재수강 하세요ㅋ");	


						System.out.print(" 언어   영역     : " + eng);
						if(eng>= 90)
							System.out.println("\tA+입니다");
						else if(eng<90&&eng>=85)
							System.out.println("\tB+입니다");
						else if(eng<85&&eng>=80)
							System.out.println("\tB 입니다");
						else if(eng<80&&eng>=75)
							System.out.println("\tC+입니다");
						else if(eng<75&&eng>=70)
							System.out.println("\tC 입니다");
						else if(eng<70&&eng>=65)
							System.out.println("\tD 입니다");
						else
							System.out.println("\tF 입니다, 재수강 하세요ㅋ");	
						System.out.println(" 총합 : " + total);
						System.out.printf(" 평균 : %.2f\n", avg);
						if(avg>=90)
							System.out.println("\t전액 장학금 입니다.");
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
