package oop.omok;

public class Board {

	private int[][] board = new int[15][20];
	

	public void create() {

		for (int x = 0; x < 15; x++)
			for (int y = 0; y < 20; y++)
				board[x][y] = 0;
	}

	public void print() {

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 20; j++) {
				if (board[i][j] == 1)
					System.out.print("¡Ü");
				else
					System.out.print("¦«");
			}
			System.out.println();
		}

	}

	public void put(Omok omok) {
		int x =omok.getX();
		int y =omok.getY();
		board[x][y] = 1;
	}

}
