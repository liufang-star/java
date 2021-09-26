package IO流.txt;

                       //缓冲字符输入流！！！

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class kk {

	public static void main(String[] args) {
		 File f = new File("word3.txt");
		 FileReader fr = null;
		 BufferedReader br =null;
		 try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);//将文件字符输入流包装成缓冲字符输入流
			String tmp = null;
			int i =1; //计数器
			while((tmp = br.readLine()) != null) {  //循环读取文件中的内容！
				System.out.println("第"+i+"行："+tmp);
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
