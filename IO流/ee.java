package IO流.txt;

                        //字节输出输入流！！！

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ee {

	public static void main(String[] args) {
		File f = new File("word.txt");//字节输出流！！！
		FileOutputStream out = null;
        try {
			out = new FileOutputStream(f,false);//文件输出流，true表示在文件的末尾追加内容！
			String str = "你见过洛杉矶，凌晨四点的样子吗？";
			byte b[] = str.getBytes();//字符串转换成字节数组
			try {
				out.write(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
        
        FileInputStream in = null; //字节输入流!!!
        try {
			in = new FileInputStream(f);//输入流读文件
			byte b2[] = new byte[100];//缓冲区,一个汉字两个字节！！
			
		try {
					in.read(b2);
					System.out.println("文件中的数据是："+new String(b2));
		} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
