package 字符串.txt;

public class bb {
	
	                          //获取字符串信息

	public static void main(String[] args) {
		//（1）获取字符串长度（使用length方法！）
		String a = "1234567890";
		String b = "12    456";     //注意：空格也是一个字符！
		int size = a.length();
		int size1 = b.length();
		System.out.println("原数字为："+a+"\t\t长度为："+size);
		System.out.println("原数字为："+b+"\t\t长度为："+size1);
		System.out.println();
		
		
		
		
		
		//（2）字符串查找（使用indexOf方法！）
		String str1 = "8888";
		String str2 = "B888";
		if(str1.indexOf("B") == -1) {    //等于-1表示不包含！！！
			System.out.println(str1+"不包含B这个字母！");
		}
		if(str2.indexOf("B")>-1) {    //大于-1表示包含！！！
			System.out.println(str2+"包含B这个字母！");
		}
		System.out.println();
		
		
		
		
		
		
		//（3）获取指定索引位置的字符
		//1、获取第一次出现的索引位置！（使用indexOf方法！）
		String c = "we are the world!";
		System.out.println("原字符串为："+c);
		int index = c.indexOf("e");
		System.out.println("字母e第一次出现的索引位置为："+index);
		
		//2、获取第一次指定的位置开始查找
		String d = "we are the world!";
		int index1 = d.indexOf("e",3); //从索引位置3开始查找字母e！
		System.out.println("字母e从索引位置为3开始查找的位置为："+index1);
		
		//3、获取倒数第一次出现的索引位置！（使用lastIndexOf方法！最后一次出现的索引位置。）
		String e = "we are the world!";
		int index2 = e.lastIndexOf("e");
		System.out.println("字母e最后一次出现的索引位置为："+index2);

	}

}
