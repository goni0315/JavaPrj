package functions;

public class Hello4 {
		
	
	public static void main(String[] args) {

		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int menu = 0;

		char[][] names = new char[3][10];
		
			EXIT: 
			while (true) {
				menu = inputMenu(menu);
				
			switch (menu) {
			case 1:
				inputExam(kors, engs, maths);
				break;
			case 2:
				printExam(kors, engs, maths);
				break;
			case 3:
				break EXIT;

			}

		}

	}




	private static int inputMenu(int menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void printExam(int[] kors, int[] engs, int[] maths) {
		// TODO Auto-generated method stub
		
	}

	private static void inputExam(int[] kors, int[] engs, int[] maths) {
		// TODO Auto-generated method stub
		
	}

}
