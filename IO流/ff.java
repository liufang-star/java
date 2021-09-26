package IO流.txt;

                      //字符输出输入流！！！

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ff {

	public static void main(String[] args) {
		File f = new File("word.txt");  
		FileWriter fw = null;  //字符输出流！！！
		try {
			fw = new FileWriter(f,true);  //在原文件的基础上追加内容！
			
			String str = "天行健，自强不息；地势坤，厚德载物！";
			fw.write(str); //将字符串写入到文本文档！
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		FileReader fr = null;   //字符输入流！！！
		try {
			fr = new FileReader(f);
			char ch[] = new char[1024]; //缓冲区
			int count;  //已读出的字符数
			try {
				while((count = fr.read(ch)) != -1) {//循环读取文件中的数据，直到所有字符都读完！
					System.out.println("文本文档中的内容为："+new String(ch,0,count));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
