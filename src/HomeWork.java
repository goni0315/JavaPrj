import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("res/data.txt");
		Scanner sc = new Scanner(input);
		
		double nums;
		double total =0, avg = 0;
		double count = 0;
		
			
			
			while(sc.hasNext()) { // ���͵� ���� Scanner �� hasNext �Լ��� nextDouble �Լ��� ������ϴ�
				nums = sc.nextDouble();
				System.out.println(nums);
				count++;
				total += nums;
				}
		
		avg = total / count;
		System.out.println();
		System.out.printf("���� : %.2f\n" ,total);
		System.out.printf("��� : %.2f" , avg);
		
		sc.close();
		input.close();
		
		
		
		}
		
	

}
