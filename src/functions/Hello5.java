package functions;

public class Hello5 {
		
	
	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		int menu = 0;
		
		for(int i=0; i<3; i++)
			exams[i] = new Exam();
		

			EXIT: 
			while (true) {
				menu = inputMenu();
				
			switch (menu) {
			case 1:
				inputExam(exams);
				break;
			case 2:
				printExam(exams);
				break;
			case 3:
				break EXIT;

			}

		}

	}




	public static int inputMenu() {
		int menu;
		return  0;
	}

	public static void printExam(Exam[] exams) {
		// TODO Auto-generated method stub
		
	}

	public static void inputExam(Exam[] exams) {
		// TODO Auto-generated method stub
		
	}

}
