package oop.omok;

public class OmokProgram {
	public static void main(String[] args) {
		
		Board board = new Board();
		OmokInputForm form = new OmokInputForm();
		Omok omok = new Omok();
		
		board.create();
		board.print();
		form.print();
		omok.input();
		board.put(omok);
		board.print();
		// public abstract void ¹ÙµÏµ¹ ÇÏ³ª ³õ±â ¼÷Á¦(Omok omok);
	}
}
