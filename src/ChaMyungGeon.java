import java.util.Scanner;

public class ChaMyungGeon {

	public static void main(String[] args)   {
		int point = 0, total = 0;
		double avg = 0;
		int menu = 0;
		double i = 0;
		int cn = 0;

		Scanner sc = new Scanner(System.in);
		imout: 
			while (true) {
				System.out.println("┌────────────┐");
				System.out.println("│   성적 입력          │");
				System.out.println("└────────────┘");
				System.out.println("1.성적 입력 ");
				System.out.println("2.총점 및 평균 확인");
				System.out.println("3.프로그램 종료");
				System.out.print("선택> ");
				menu = sc.nextInt();

				switch (menu) {
				case 1:
					do {
						do {
							if (point < 0 || point > 100) 
								System.out.println("0부터 100사이의 점수를 입력해 주세요-_-");
							System.out.print("성적 입력 : ");
							point = sc.nextInt();
						} while (point < 0 || point > 100);
						total += point;
						i++;
						System.out.println("계속 입력하시겠습니까?  1.예     2.아니오");
						cn = sc.nextInt();
					}while(cn == 1);
					break;
				case 2:
					avg = (double)total / i;
					System.out.println("총 점:" + total);
					System.out.println("평균 :" + avg);
					break;
				case 3:
					System.out.println("프로그램이 종료되었습니다.");
					break imout;
				default:
					System.out.println("1,2,3 중 하나를 골라주세요");

				}

			}
	}

}
