package practice;

import java.util.Scanner;

public class StudentConsole {
	private Student stud = new Student();
	
	public void Input() {
		Scanner scan = new Scanner(System.in);
			
			System.out.print("�̸� : ");
			String name = scan.nextLine();
			
			System.out.print("���� : ");
			String nation = scan.nextLine();
			
			System.out.print("����(���ڸ�) : ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.print("�ڵ��� ��ȣ(-����) : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			stud.setName(name);
			stud.setNation(nation);
			stud.setAge(age);
			stud.setNum(num);
		}
		
	

	public void print() {
			System.out.println(stud.getName());
			System.out.println(stud.getNation());
			System.out.println(stud.getAge());
			System.out.println(stud.getNum());
		
			
	}
}
