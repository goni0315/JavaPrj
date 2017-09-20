package reuse;

public class OmokProgram {

	public static void main(String[] args) {

		Omok omok = new Omok();

		printBoard();
		omok.input();
		omok.print();
	}

	public static void printBoard() { // 보드판 출력
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 20; j++)
				System.out.print("┼");
			System.out.println();
		}
	}

}