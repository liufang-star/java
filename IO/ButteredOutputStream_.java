package IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

                 //缓冲字节输出流！（BufferedOutputStream）！

public class ButteredOutputStream_ {

	public static void main(String[] args) {
		
		File f = new File("src\\lf.txt");
		
		FileOutputStream out = null;
		
		BufferedOutputStream bo = null;
		
		try {
			out = new FileOutputStream(f);
			bo = new BufferedOutputStream(out);   //包装文件输出流
			String str = "天生我才必有用，千金散尽还复来。";
			byte b[] = str.getBytes();
			
			bo.write(b);
			
			//使用缓冲字节输出流时，多使用刷新操作！
			bo.flush();   //刷新！强制将缓冲区数据写入文件中，即使缓冲区没有写满！
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
