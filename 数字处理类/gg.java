package 数字处理类.txt;

                                                   //Random类！

import java.util.Random;


public class gg {

	public static void main(String[] args) {
		Random r = new Random();   //实例化一个random类！
		
		//随机产生一个整数！
		System.out.println("随机产生一个整数为："+r.nextInt());
		
		//随机产生一个大于等于0且小于10的整数！
		System.out.println("随机产生一个大于等于0小于10的整数为："+r.nextInt(10));
		
		//随机产生一个布尔类型的值！
		System.out.println("随机产生一个布尔类型的值为："+r.nextBoolean());
		
		//随机产生一个双精度型的值！
		System.out.println("随机产生一个双精度的值为："+r.nextDouble());
		
		//随机产生一个浮点型的值！
		System.out.println("随机产生一个浮点型的值为："+r.nextFloat());
		
		//随机产生一个概率密度为高斯分布的双精度值
		System.out.println("随机产生一个概率密度为高斯分布的双精度的值为："+r.nextGaussian());
		
	}

}
