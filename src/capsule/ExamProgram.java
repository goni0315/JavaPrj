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
				System.out.println("System : ���α׷��� ����Ǿ����ϴ�.");
				break EXIT;
			default:
				System.out.println("1, 2, 3 �� �ϳ��� ���� �Է��� �ּ���^^");

			}

		}

	}




	public static int inputMenu() {
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


}
