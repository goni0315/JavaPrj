package oop.omok;

import java.util.Scanner;

public class Omok {

	private int x;
	private int y;

	public Omok(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Omok() {
		this(0,0);
	}

	public void input() { //////// input
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
