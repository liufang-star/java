package IO流.txt;

                       //缓冲输入字节流！！！

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class gg {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\86187\\Desktop\\linux笔记.docx");
		BufferedInputStream bi = null; //大大的提高了运行效率
		FileInputStream in = null;
		long start = System.currentTimeMillis(); //获取开始时的毫秒数
		try {
			in = new FileInputStream(f);
			bi = new BufferedInputStream(in); //将文件字节流包装成缓冲字节流
			byte b[] = new byte[1024]; //缓冲区字节数组（这个缓冲区与Buffered不同）
			while(bi.read(b) != -1) { //使用缓冲流读取数据
				
			}
			long end = System.currentTimeMillis(); //获取流结束时毫秒数
			System.out.println("运行经历的毫秒数："+(end - start));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bi != null) {
				try {
					bi.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
