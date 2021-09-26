package IO流.txt;

                         //缓冲字节输出流！！！

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class hh {

	public static void main(String[] args) {
		File f = new File("word2.txt");
		FileOutputStream out = null;
		BufferedOutputStream bo = null;
		try {
			out = new FileOutputStream(f);
			bo = new BufferedOutputStream(out);  //包装文件输出流
			String str = "天生我材必有用，千金散尽还复来！";
			byte b[] = str.getBytes();
			bo.write(b);
			//使用缓冲字节输出流时，要多进行刷新操作！
			bo.flush();  //刷新。强制将缓冲区数据写入文件中，即使缓冲区没有写满。
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bo != null) {
				try {
					bo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
