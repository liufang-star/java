package 数字处理类.txt;

                                                //随机数！（使用Math.random()方法！！！）

//获取2~32之间的偶数！！！

public class cc {
	/*
	 * 定义产生偶数的方法
	 * param num1 起始范围参数
	 * param num2 终止范围参数
	 * return 随机的范围内偶数
	 */
	
	public static int GetEvenNum(double num1,double num2) {
		//产生 num1~num2之间的随机数！
		int s = (int)num1 + (int)(Math.random()*(num2 - num1));
		if(s % 2 == 0) {     //判断随机数是否为偶数！
			return s;    //返回！
		}else     //如果是奇数！
			return s + 1;    //将结果加1返回！
		
	}

	public static void main(String[] args) {
		//调用产生随机数方法！
		System.out.println("任意一个2~32之间的偶数："+GetEvenNum(2, 32));

	}

}
