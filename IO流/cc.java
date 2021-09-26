package IO流.txt;

import java.io.File;

public class cc {
	
	                 //利用file关键字（创建和删除文件）

	public static void main(String[] args) {
		
		//File dir = new File("dir");
		
		File dir = new File("dir/dir2/dir3/dir4");
		
		boolean flag = dir.mkdir();//创建文件夹
		
		boolean flag2 = dir.mkdirs();//创建文件夹及其父文件夹（创建很多文件夹）
		
		System.out.println("创建文件夹是否成功："+flag);
		
		System.out.println("创建多层文件夹是否成功："+flag2);
		
		
		
		          /*删除文件路径最后一个文件夹*/
		//boolean del = dir.delete(); //删除文件夹
		//System.out.println("删除文件夹是否成功："+del);

	}

}
