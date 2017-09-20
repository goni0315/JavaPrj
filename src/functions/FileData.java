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
		
		FileInputStream 형주 = new FileInputStream("res/data.txt");
		FileOutputStream 용주 = new FileOutputStream("D:\\workspace\\data.txt");
		PrintStream 은녕 = new PrintStream(용주);
		Scanner 명건 = new Scanner(형주) ;
		
		int num;
	
		
		while((num = 형주.read()) !=-1)
			System.out.println(num = 형주.read());
		
		
		
	
		명건.close();
		형주.close();
		
		/*for(int i =0; i<nums.length; i++) 
			용주.write(nums[i]);
		for(int i =0; i<nums.length; i++)
			은녕.printf("%d ", nums[i]);
		
		
		은녕.close();
		용주.close();
		*/
		System.out.println("실행 완료");
	}

}
