package structured.data;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		
		Omok[] omoks = new Omok[10];
		
		printBoard(); 
		input(omoks);
		printTheBoard(omoks);
		}

	private static void printTheBoard(Omok[] omoks) {
		int ox = omoks[0].x;
		int oy = omoks[0].y;
		
		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 20; y++)
				if (ox == x && oy == y)
					System.out.print("¡Ü");
				else
					System.out.print("¦«");
			System.out.println();
		}
	}

	private static void input(Omok[] omoks) { // ÁÂÇ¥ ÀÔ·Â
		
		Omok omok = new Omok();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ÁÂÇ¥ ÀÔ·Â  x : ");
		omok.x = sc.nextInt();
		System.out.print("ÁÂÇ¥ ÀÔ·Â  y : ");
		omok.y = sc.nextInt();
		
		omoks[0] = omok;
	}

	private static void printBoard() { // ÁÂÇ¥Ãâ·Â
		System.out.println("12345678910");
		for (int x = 0; x <15 ; x++) {
			for (int y = 0; y < 20; y++)
					System.out.print("¦«");
			System.out.println();
		}
	}
}
