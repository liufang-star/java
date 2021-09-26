package 数字处理类.txt;

                                 //随机数！（使用Math.random()方法！！！）

//定义获取任意字符之间的随机字符！

public class dd {
	//定义获取任意字符之间的随机字符！
	
	public static char GetRandomChar(char cha1,char cha2) {
		return (char)(cha1 + Math.random()*(cha2 - cha1 + 1));
	}

	public static void main(String[] args) {
		
		//获取a~z之间的随机字符！
		System.out.println("任意小写字符为："+GetRandomChar('a', 'z'));
		
		//获取A~Z之间的随机字符！
		System.out.println("任意大写字符为："+GetRandomChar('A', 'Z'));
		
		//获取0-9之间的随机数字！
		System.out.println("0~9之间的随机数字为："+GetRandomChar('0', '9'));
		

	}

}
