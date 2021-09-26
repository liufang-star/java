package 字符串.txt;

public class gg {
	 
	                       //字符串生成器
	/*string、stringbuffer、stringbuilder三者的区别：
	 * string占用内存高，线程不安全，效率低，不支持追加append，删除delect，插入insert等方法，
	 * stringbuffer线程安全（支持多线程），效率中等。支持append、delect、insert等方法。
	 * stringbuilder线程不安全（支持单线程，但不支持多线程），效率高，同样支持append、delect、insert等方法。
	 */

	public static void main(String[] args) {
		//1、将古诗春晓更改为春眠不觉晓，处处闻啼鸟。
		StringBuffer aa = new StringBuffer("古诗春晓");
		aa.delete(0, 2);
		System.out.println(aa.toString());
		aa.insert(1, "眠不觉");
		System.out.println(aa.toString());
		aa.append("，处处闻啼鸟。");
		System.out.println(aa.toString());
		System.out.println();
		
		
		
		StringBuilder bb = new StringBuilder("hello");
		bb.insert(5, "world");
		System.out.println(bb);
		System.out.println();
		
		

		StringBuilder cc = new StringBuilder("StringBuilder");
		cc.delete(5, 10);
		System.out.println(cc);
		
		
	}

}
