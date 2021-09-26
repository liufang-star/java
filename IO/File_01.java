package IO;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

                                           //File类！创建文件的三种构造方法以及file类的常用方法！

public class File_01 {

	public static void main(String[] args) {
		
		/*
		 * 项目下的默认路径：kk.txt
		 * 包中的文件路径：src/包名/kk.txt
		 * 注意：
		 *         /   表示文件夹
		 *        \\   表示文件夹
		 *        \     表示转义字符
		 * 绝对路径；C:\\Intel\\kk.txt
		 */ 
		File f1 = new File("C:\\Intel\\kk.txt");    //第一种构造方法
		
		File f2 = new File("C:\\Intel\\", "kk.txt");    //第二种构造方法
		
		File dir = new File("C:\\Intel\\");      //文件夹
		File f3 = new File(dir,"kk.txt");      //第三种构造方法
		
		System.out.println("文件是否存在："+f1.exists());     //判断文件是否存在
		System.out.println();
		
		System.out.println("f1文件的绝对路径："+f1.getAbsolutePath());    //获取文件的绝对路径
		System.out.println("f2文件的绝对路径："+f2.getAbsolutePath());    //获取文件的绝对路径
		System.out.println("f3文件的绝对路径："+f3.getAbsolutePath());    //获取文件的绝对路径
		
		System.out.println();
		System.out.println("文件是否相等（==）："+(f1 == f2));   //判断文件是否相等
		System.out.println("文件是否相等（equals）："+(f1.equals(f2)));  //判断指向的是否是同一个文件
		
		System.out.println();
		System.out.println("文件名称："+f1.getName());    //输出文件名称
		System.out.println("文件的绝对路径："+f1.getAbsolutePath());    //输出文件的绝对路径
		System.out.println("文件是否为隐藏文件："+f1.isHidden());      //判断文件是否为隐藏文件
		System.out.println("文件的字节数："+f1.length());    //输出文件大小，单位：字节
		
        Date date = new Date(f1.lastModified());   //通过毫秒值创建日期类
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		System.out.println("文件最后修改的时间："+sdf.format(date));
		
		System.out.println();
//		boolean del = f1.delete();
//		System.out.println("删除文件是否成功："+del);
		
		try {
			//已存在的文件，不能重新创建（不能覆盖已有文件）
			boolean create = f1.createNewFile();     //创建空的文件夹
			System.out.println("创建文件是否成功："+create);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
