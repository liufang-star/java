package 字符串.txt;

public class cc {
	
	                                                                      //字符串操作

	public static void main(String[] args) {
		
		//（1）获取子字符串（使用substring方法！）
		
		//1、截取字符串（第一种方法（截取开始位置到结束））
		String a = "123456200103211314";
		String index = a.substring(6);
		System.out.println("截取开始位置到结束的数字为："+index);
		
		
		//2、（第二种方法）截取开始位置到指定结束位置！！
		String b = "123456200103211314";
		String index1 = b.substring(6,14);
		System.out.println("截取开始位置到指定结束的位置为（出生日期！~）："+index1);
		System.out.println();
		
		
		
		
		
		//（2）去除空格（使用trim方法（去除首尾空白）、replaceAll方法（去除所有空白字符！））
		
		//1、去除首位空白内容（使用trim方法！）
		String c = "    abc     ";//没有加trim方法之前！
		System.out.println("原字符串："+"["+c+"]");
		String shortstr = c.trim(); //使用trim方法之后的结果（去除首尾空白内容！“首尾”）
		System.out.println("使用trim方法之后的字符串："+"["+shortstr+"]");
		System.out.println();
		
		
		//2、去除字符串中所有空白字符（包括字符串内部的字符）（使用replaceAll方法！）
		String d = "a b        c  d   e        f";
		System.out.println("原字符串："+"["+d+"]");
		String shortstr1 = d.replaceAll("\\s","");  //第一个\\s表示正则表达式，第二个表示将正则表达式的值转换成什么都没有！
		System.out.println("使用replaceAll方法之后的字符串："+"["+shortstr1+"]");
		System.out.println();
		
		
		

		
		//（3）字符串替换（使用replace方法！）
		
		String e = "馒头一文一个！";
		System.out.println("原文："+e);
		String replacestr = e.replace("一","壹");
		System.out.println("使用replace方法替换之后："+replacestr);
		System.out.println();
		
		
		
		
		
		//（4）判断字符串的开始与结尾（使用endswith方法（结尾）、startswith方法（开始）！）
		
		//1、第一种（使用endswith方法判断是否以java结尾）
		String f = "HelloWorld.java";
		boolean bool1 = f.endsWith("java");
		boolean bool2 = f.endsWith(".jpg");
		System.out.println("是否以java结尾（bool1）："+bool1);
		System.out.println("是否以java结尾（bool2）："+bool2);
		
		//2、第二种（使用stratswith方法判断是否以中华开头）
		String g = "中华人民共和国！";
		boolean bool3 = g.startsWith("中国");
		boolean bool4 = g.startsWith("中华");
		System.out.println("是否以中华开头（bool3）："+bool3);
		System.out.println("是否以中华开头（bool4）："+bool4);
		System.out.println();
		
		
		
		
		
		
		//（5）判断字符串是否相等（使用equals方法！）
		
		//1、特殊情况（一个是赋值，一个是创建对象！两者有区别！）
		/*比方：赋值（两个不同的男生喜欢同一个女生，喜欢的对象相同！）
		 *     创建对象（两个不同的男生喜欢两个不同的女生，但名字相同，喜欢的对象不同！）
		 */
		String h = "tom";
		String i = "tom";
		System.out.println("利用赋值判断："+(h == i));
		String h1 = new String("tom");
		String i1 = new String("tom");
		System.out.println( "利用创建对象判断："+(h1 == i1));
		
		//2、使用equals方法！
		String h2 = new String("tom");
		String i2 = new String("tom");
		System.out.println("利用equals方法判断："+(h2.equals(i2)));
		System.out.println();
		
		
		
		
		
		//（6）字母大小写转换（使用tolowercase方法（转换成小写）、touppercase方法（转换成大写！））
		String j = "abc DEF";
		String low = j.toLowerCase();
		String up = j.toUpperCase();
		System.out.println("原字符串："+j);
		System.out.println("转换成小写："+low);
		System.out.println("转换成大写："+up);
		System.out.println();
		
		
		
		
		
		//（7）字符串分割（使用split方法）
		String k = "192.168.1.1";
		String[] l = k.split("\\.");  //注意:分割字符需要中括号，而且进行分割需要用到\\（转义字符）!
		String[] m = k.split("\\.",2);
		System.out.println("原字符串："+k);
		for(String l1 : l) {
			System.out.println("使用split方法分割字符串："+"["+l1+"]");
		}
		for(String m1 : m) {
			System.out.println("使用split方法进行两次分割："+"["+m1+"]");
		}
		System.out.println("没有使用for遍历的结果："+l);
		
	}

}
