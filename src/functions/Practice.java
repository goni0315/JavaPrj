package functions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {

	public static void main(String[] args) throws IOException {
		FileInputStream buf = new FileInputStream("res/data.txt");
		FileOutputStream out =  new FileOutputStream("res/data2.txt");
		
		int i;
		byte[] data = new byte[1024];
		while((i = buf.read(data)) !=-1)
			out.write(data, 0 ,i);
		
		out.close();
		buf.close();
		
		
	}

}

