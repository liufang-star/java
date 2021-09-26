package IO流.txt;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bb {
	
	                         //通过file关键字获取文本信息。

	public static void main(String[] args) {
		
		File f1 = new File("C:\\Intel\\word.txt"); //第一种构造方法
		
		System.out.println("文件是否存在："+f1.exists()); //判断文件是否存在
		
		System.out.println("文件名："+f1.getName()); //输出文件名
		
		System.out.println("文件的绝对路径："+f1.getAbsolutePath()); //输出文件的绝对路径
		
		System.out.println("是否为隐藏文件："+f1.isHidden()); //是否为隐藏文件
		
		System.out.println("文件的字节数："+f1.length()); //输出文件大小，单位：字节
		
		Date date = new Date(f1.lastModified()); //通过毫秒值创建日期类
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("文件最后的修改时间："+sdf.format(date)); //文件最后修改的时间
		
		//boolean del = f1.delete();//删除文件
		//System.out.println("删除文件是否成功："+del);
		
		try {
			//已存在的文件，不能重新创建（不能覆盖已有的文件）
			boolean create = f1.createNewFile(); //创建新的空文件
			System.out.println("创建文件是否成功："+create);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("捕捉到了异常！");
		}
		

	}

}
