
public class Omok {
	public static void main(String[] args) {

		for (int j = 0; j < 15; j++) {
			
			for (int i = 0; i < 20; i++)  
				if(j<=i&&j<15-i)
					System.out.print("��");
				else if(j>i&&j>=15-i)
					System.out.print("��");
				else
					System.out.print("��");
			System.out.println();
		}
	}
}
