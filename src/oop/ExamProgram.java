package oop;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		int menu;
		Exam exam = new Exam();

		System.out.println("����������������������������������������������������������");
		System.out.println("��         �Ͱ� �޴�         ��");
		System.out.println("����������������������������������������������������������");

		EXIT:
		while (true) {
			menu = inputMenu();

			switch (menu) {
			case 1:
				exam.input();
				break;

			case 2:
				exam.print();
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
		System.out.println("\t1.���� �Է�  ");
		System.out.println("\t2.���� ���  ");
		System.out.println("\t3.��   ��    ");
		System.out.print("\t �� ��> ");
		menu = scan.nextInt();
		return menu;
	}

}
