package reuse;

import java.util.Scanner;

public class Omok {
	private int x;
	private int y;

	public Omok() {
		this(3, 3);
	}

	public Omok(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() { // �����ǿ� �Էµ� ��ǥ ���

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++)
				if (i == x && j == y)
					System.out.print("��");
				else
					System.out.print("��");
			System.out.println();
		}
	}

	public void input() { // ��ǥ �Է�

		Scanner scan = new Scanner(System.in);
		System.out.print("��ǥ �Է�  x : ");
		x = scan.nextInt();
		System.out.print("��ǥ �Է�  y : ");
		y = scan.nextInt();

	}



}
