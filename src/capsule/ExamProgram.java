package capsule;

import java.util.Scanner;

public class ExamProgram {
		
	
	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		int menu;
		
		for(int i=0; i<3; i++)
			exams[i] = new Exam();
		
			EXIT: 
			while (true) {
				
				menu = inputMenu();
				
			switch (menu) {
			case 1:
				Exam.inputExam(exams);
				break;
				
			case 2:
				Exam.printExam(exams);
				break;
				
			case 3:
				System.out.println("System : 프로그램이 종료되었습니다.");
				break EXIT;
			default:
				System.out.println("1, 2, 3 중 하나의 값을 입력해 주세요^^");

			}

		}

	}




	public static int inputMenu() {
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


}
