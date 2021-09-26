package IO流.txt;

                         //缓冲字符输出流！！！
         
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ii {

	public static void main(String[] args) {
		File f = new File("word3.txt");
		FileWriter fw = null; 
        BufferedWriter bw =null;
        try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw); //将文件字符输出流包装成缓冲字符流
			String str1 = "世界这么大！！";
			String str2 = "我想去看看！！！";
			bw.write(str1);  //第一行数据
			bw.newLine();  //创建一个新行
			bw.write(str2);  //第二行数据
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//要注意流的关闭顺序，先创建的后关闭。
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
