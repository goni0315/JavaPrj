package functions;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {

		int a = 0;

		for (char i = 'Z'; i >='A' ; i--)
			System.out.println(i);

		System.out.println("-----------------------------------");

		imout: while (true) {
			for (char i = 'A'; i <= 'Z'; i++) {
				System.out.print(i);
				a++;
				System.out.println("\t" + a + "¹øÂ°");
				if (a == 50)
					break imout;
			}
		}
		
		int alp = 'A';
		
		for(int i =0; i<50; i++) {
			System.out.printf("%c"+"\n", alp);
		if(alp=='Z')
			alp='A';
		else
			alp++;
		}
		
		
	}
}
