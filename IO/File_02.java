package IO;

import java.io.File;

                                                         //File类。文件夹的操作！

public class File_02 {

	public static void main(String[] args) {
		
		File dir = new File("src/dir/dir2/dir3/dir4/");
		
		boolean flag = dir.mkdir();     //只能创建一层文件夹
		boolean flag2 = dir.mkdirs();     //创建多层文件夹
		
		System.out.println("文件夹创建是否成功："+flag);
		System.out.println("多层文件夹创建是否成功："+flag2);
		
		//删除文件路径最后一个文件夹
		boolean del = dir.delete();     //删除文件夹
		System.out.println("删除文件夹是否成功："+del);
		
		

	}

}
