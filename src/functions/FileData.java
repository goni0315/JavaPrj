package functions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileData {
	
	public static void main(String[] args) throws IOException {
	
		int[] nums = new int[] {23,24,5,23,23,23,23,4,34,54,3,25,3,5,3,5,3,544,44,64,34};
		
		FileInputStream ���� = new FileInputStream("res/data.txt");
		FileOutputStream ���� = new FileOutputStream("D:\\workspace\\data.txt");
		PrintStream ���� = new PrintStream(����);
		Scanner ��� = new Scanner(����) ;
		
		int num;
	
		
		while((num = ����.read()) !=-1)
			System.out.println(num = ����.read());
		
		
		
	
		���.close();
		����.close();
		
		/*for(int i =0; i<nums.length; i++) 
			����.write(nums[i]);
		for(int i =0; i<nums.length; i++)
			����.printf("%d ", nums[i]);
		
		
		����.close();
		����.close();
		*/
		System.out.println("���� �Ϸ�");
	}

}
