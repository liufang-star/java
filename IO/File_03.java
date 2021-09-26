package IO;

import java.io.File;

                                          //获取C盘下的所有文件及其文件夹

public class File_03 {

	public static void main(String[] args) {
		
		File f =new File("C:\\Windows\\");     //C盘windows文件夹
		File files[] = f.listFiles();      //返回文件夹下所有的子文件及子文件夹
		
		for(File tmp : files) {
			
			if(tmp.isFile()) {    //判断是否文件
				System.out.println("文件："+tmp.getName());
			}
			
			else if(tmp.isDirectory()) {      //判断是否为文件夹
				System.out.println("文件夹："+tmp.getName());
			}
			
		}
		
		

	}

}
