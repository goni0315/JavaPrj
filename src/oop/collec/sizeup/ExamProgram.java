package oop.collec.sizeup;

import java.util.Random;
import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		int menu;
		/*Exam exam = new Exam(1,2,3);*/
		ExamConsole console = new ExamConsole();
		/*console.setExam(exam);//dependency injection
*/
		EXIT:
		while (true) {
			menu = console.inputMenu();

			switch (menu) {
			case 1:
				console.input();
				break;

			case 2:
				console.print();
				break;

			case 3:
				System.out.println("System : 프로그램이 종료되었습니다.");
				break EXIT;

			default:
				System.out.println("1, 2, 3 중 하나의 값을 입력해 주세요^^");

			}

		}

	}



}
