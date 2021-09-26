package IO;

                        //文件字节输出输入流！（FileOutstream；FileInputStream）

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_FileOutputStream {

	public static void main(String[] args) {
		
		File f = new File("src\\liufang.txt");      //创建文本文档
		FileOutputStream out = null;      //文件字节输出流
		
		try {
			out = new FileOutputStream(f,false);     //文件输出流，true表示在文件的末尾追加内容
			String str = "你见过洛杉矶；凌晨四点的样子吗？";     //向文本中添加内容
			byte b[] = str.getBytes();     //字符串转换为字节数组
			try {
			out.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(out != null) {      //判断out是否为空
				try {
					out.close();     //关闭操作
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		FileInputStream in = null;       //文件字节输入流
		try {
			in = new FileInputStream(f);      //输入流读文件
			byte b2[] = new byte[1024];    //缓冲区
			int len = in.read(b2);
			System.out.println("文件中的数据是："+new String(b2,0,len));     //0，len表示从0开始读到最后一个字符！
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			if(in != null) {     //判断in是否为空
				try {
					in.close();      //关闭操作
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	

	}

}
