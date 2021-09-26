package IO流.txt;

import java.io.File;

public class dd {
	
	               //利用file关键字获取C盘文件和文件夹。

	public static void main(String[] args) {
		
		File f = new File("C:\\Windows\\");  //C盘windows文件夹
		
		File files[] = f.listFiles();  //返回文件夹下所有的子文件及子文件夹
		
		for(File tmp:files) {
			
			if(tmp.isFile()) {//判断是否为文件
				
				System.out.println("文件："+tmp.getName());
				
			}else if(tmp.isDirectory()) {
				
				System.out.println("文件夹："+tmp.getName());
				
			}
		}

	}

}
