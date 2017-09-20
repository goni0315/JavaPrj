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
		
			
			
			while(sc.hasNext()) { // 스터디를 통해 Scanner 의 hasNext 함수와 nextDouble 함수를 배웠습니다
				nums = sc.nextDouble();
				System.out.println(nums);
				count++;
				total += nums;
				}
		
		avg = total / count;
		System.out.println();
		System.out.printf("총합 : %.2f\n" ,total);
		System.out.printf("평균 : %.2f" , avg);
		
		sc.close();
		input.close();
		
		
		
		}
		
	

}
