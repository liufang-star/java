package 字符串.txt;

public class aa {
	
	                                  //String类

	public static void main(String[] args) {
		
		//（1）利用赋值创建字符串！！
		String a = "时间就是金钱，我的朋友！";
		System.out.println(a);
		
		String b = "锄禾日当午。", c = "小鸡炖蘑菇！";
		System.out.println(b);
		System.out.println(c);
		
		String str1,str2;
		str1 = "we are students !";
		str2 = "we are family !";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		
		
		
		//（2）利用构造方法直接实例化字符串！！
		String d = new String("我爱清汤小肥羊！");   //使用new创建实例化对象！
		System.out.println(d);
		
		String e = new String(d);
		System.out.println(e);
		System.out.println();
		
		
		
		
		//（3）利用字符数组实例化字符串
		//1、第一种
		char[] charArray = {'t','i','m','e'};
		String f = new String(charArray);
		System.out.println(f);
		
		//2、第二种
		char[] charArray1 = {'时','间','就','是','金','钱'};
		String g = new String(charArray1,4,2);   //从索引位置4开始取2个字符！
		System.out.println(g);
		System.out.println();
		
		
		
		
		
		//（4）利用字节数组实例化字符串
		byte[] byteArray = {-60,-6,-70,-61};  //这一串数字是“您好“的字符串编码序列！！
		String h = new String(byteArray);
		System.out.println(h);

	}

}
