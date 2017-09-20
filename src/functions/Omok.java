package functions;

import java.util.Scanner;

public class Omok {

	public static void main(String[] args) {

		int[] omok = new int[2];
		while (true) {
			omok = inputOmok(); // ��ǥ �Է�
			printOmok(omok); // ��ǥ ���
		}

	}

	private static int[] inputOmok() { // ��ǥ �Է�
		Scanner sc = new Scanner(System.in);
		int[] omok = new int[2];
		System.out.print("��ǥ �Է�  x : ");
		omok[0] = sc.nextInt();
		System.out.print("��ǥ �Է�  y : ");
		omok[1] = sc.nextInt();
		return omok;
	}

	private static void printOmok(int[] omok) { // ��ǥ���
		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 20; y++)
				if (omok[0] == x && omok[1] == y)
					System.out.print("��");
				else
					System.out.print("��");
			System.out.println();
		}
	}
}
