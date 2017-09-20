package functions;

import java.util.Scanner;

public class Omok {

	public static void main(String[] args) {

		int[] omok = new int[2];
		while (true) {
			omok = inputOmok(); // ÁÂÇ¥ ÀÔ·Â
			printOmok(omok); // ÁÂÇ¥ Ãâ·Â
		}

	}

	private static int[] inputOmok() { // ÁÂÇ¥ ÀÔ·Â
		Scanner sc = new Scanner(System.in);
		int[] omok = new int[2];
		System.out.print("ÁÂÇ¥ ÀÔ·Â  x : ");
		omok[0] = sc.nextInt();
		System.out.print("ÁÂÇ¥ ÀÔ·Â  y : ");
		omok[1] = sc.nextInt();
		return omok;
	}

	private static void printOmok(int[] omok) { // ÁÂÇ¥Ãâ·Â
		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 20; y++)
				if (omok[0] == x && omok[1] == y)
					System.out.print("¡Ü");
				else
					System.out.print("¦«");
			System.out.println();
		}
	}
}
