package IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

                         //缓冲字节输入流！（BufferedInputStream）！

public class BufferedInputStream_ {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\86187\\Desktop\\《鸟哥的Linux私房菜-基础篇》第四版.pdf");
		
		BufferedInputStream bi = null;   //大大的提高了运行效率！
		
		FileInputStream in = null;
		
		long start = System.currentTimeMillis();    //获取流开始时毫秒值
		
		try {
			
			in = new FileInputStream(f);
			
			bi = new BufferedInputStream(in);   //将文件字节流包装成缓冲字节流
			
			byte b[] = new byte[1024];    //缓冲区字节数组（这个缓冲区与Buffered不同）！
			while(bi.read(b) != -1) {    //使用缓冲流读取数据
				
			}
			
			long end = System.currentTimeMillis();    //获取流结束时毫秒值
			System.out.println("运行经历的毫秒数："+(end - start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bi != null) {
				try {
					bi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
