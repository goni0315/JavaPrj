import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitmapProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream bf = new FileInputStream("res/foto.bmp");
		FileOutputStream cp = new FileOutputStream("res/foto_copy.bmp");
		
	/*	byte[] fileHeader = new byte[14];
		bf.read(fileHeader);
		
		//	 무한루프 해결, 그리고 bmp 파일 복사.
		int filesize = ((int)fileHeader[2])&0x000000ff<<0|
				(((int)(fileHeader[3])&0x000000ff)<<8)|
				(((int)(fileHeader[4])&0x000000ff)<<16)|
				(((int)(fileHeader[5])&0x000000ff)<<24);
		*/
		
		
		int length;
		
		byte[] file = new byte[1024];
		
		while((length = bf.read(file))!=-1)
				cp.write(file, 0, length);
		
	
		
		 bf.close();
		 cp.close();
		 
				 
				 
	}

}