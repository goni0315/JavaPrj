package practice;

import java.util.Scanner;

public class Gugu {
	private int a;
	private int b;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("아라비안 숫자를 입력하요 >_");
		a = scan.nextInt();
		System.out.print("다음 숫자를 입력하세요 >_");
		b = scan.nextInt();
		
	}
	
	public void print() {
		for(int i=a ; i<b+1; i++)
			for(int j=1; j<10; j++)
			System.out.println(i + " * " + j + " = " + i * j);
	}
}
