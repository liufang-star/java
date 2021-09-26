package 数字处理类.txt;

                          //大数字类运算！（使用BigInteger方法！）

import java.math.BigInteger;

//运用BigInteger方法（科学计算！）！！（任意精度的整数！！）

public class hh {

	public static void main(String[] args) {
		BigInteger a = new BigInteger("99");    //实例化一个数字！
		BigInteger b = BigInteger.valueOf(99999L);
		
		System.out.println("加法操作："+a.add(new BigInteger("1")));
		System.out.println("减法操作："+a.subtract(new BigInteger("10")));
		System.out.println("乘法操作："+a.multiply(new BigInteger("78")));
		System.out.println("除法操作："+a.divide(new BigInteger("3")));
		System.out.println("取该大数字除以6的商："+a.divideAndRemainder(new BigInteger("3"))[0]);
		System.out.println("求余操作："+a.remainder(new BigInteger("5")));
		System.out.println();
		
		System.out.println("求幂操作："+a.pow(10));
		System.out.println("比较大小："+a.compareTo(new BigInteger("90")));
		System.out.println("比较相等："+a.equals(new BigInteger("99")));
		System.out.println("取最大值："+a.max(b));
		System.out.println("取最小值："+a.min(b));
		System.out.println();
		
		System.out.println("取大数字的相反数："+a.negate());
		System.out.println();
		
		//求最大公约数运算~！
		BigInteger c = new BigInteger("456789");
		BigInteger d = new BigInteger("123465");
		
		System.out.println(c+ "与"+d+"的最大公约数为："+c.gcd(d));

	}

}
