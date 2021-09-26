package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

                            //文件字符输出输入流！（FileOutWriter；FileInputReader）

public class FileWriter_FileReader {

	public static void main(String[] args) {
		
		File f = new File("src\\kk.txt");     //创建文本文档
		
			FileWriter fw = null;       //文件字符输入流（写入数据）
			
			try {
				fw = new FileWriter(f,false);     //在文本文档内容后不追加内容
				String str = "自强不息，厚德载物。";      //向文本文档中添加内容
				fw.write(str);      //写入到文本中
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			finally {
				if(fw != null) {
					try {
						
						fw.close();      //关闭操作
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			FileReader fr = null;
			try {
				fr = new FileReader(f);
				char ch[] = new char[1024];    //缓冲区
				int count;     //已经读出的字符数
				try { 
					
					while((count = fr.read(ch)) != -1) {    //循环读取文件中的数据，直到所有字符都读完！
						
						//读取文本文档中的内容，从0到count！
						System.out.println("文本文档中的内容为："+new String(ch,0,count));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				if(fr != null) {
					try {
						
						fr.close();      //关闭操作
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		

	}

}
