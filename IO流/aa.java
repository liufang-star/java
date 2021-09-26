package IO流.txt;

import java.io.File;

                    //file用法！构造方法！

public class aa {

	public static void main(String[] args) {
		/*项目下的路径（默认路径）：word.txt
		 * 包中的文件路径：src/zixuewang/word.txt
		 * 注意：/ 表示文件夹
		 *     \\ 表示文件夹 （转义字符）
		 *     绝对路径：C:\\Intel\\word.txt
		 */
		File f1 = new File("C:\\Intel\\word.txt");//第一种构造方法
		
		File f2 = new File("C:\\Intel\\","word.txt");//第一种构造方法
		
		File dir = new File("C:\\Intel\\");//文件夹
		File f3 = new File(dir,"word.txt");//第三种构造方法
		
        System.out.println(f1.getAbsolutePath());//输出文件的绝对路径
        System.out.println(f2.getAbsolutePath());//输出文件的绝对路径
        System.out.println(f3.getAbsolutePath());//输出文件的绝对路径
        
        System.out.println(f1 == f2); //判断文件是否相等
        System.out.println(f1.equals(f2));//判断指向的是否是同一个文件
        
	}

}
