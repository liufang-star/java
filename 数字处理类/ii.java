package 数字处理类.txt;

import java.math.BigDecimal;

                                                                 //大数字运算！

public class ii {
	
//运用BigDecimal方法！（任意精度的小数！！）

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("30");
		BigDecimal b = BigDecimal.valueOf(7);
		
		//会报错！30/7  除不尽！所以不能用divide方法！
		//System.out.println(a.divide(b));   
		
		//含义：a除以b保留22位小数：（a.divide(b,22,”处理模式“)！）！
		System.out.println("30除以7的结果为：");
		
		//BigDecimal.ROUND_UP方法（商的最后一位如果大于0，则向前进位，正负数都如此！
		System.out.println("保留22位小数（结果为）："+a.divide(b,22,BigDecimal.ROUND_UP));
		
		//BigDecimal.ROUND_UP方法（对商进行四舍五入操作！）
		System.out.println("最后一位进位（结果为）："+a.divide(b,20,BigDecimal.ROUND_UP));
		
		//BigDecimal.ROUND_DOWN方法（商的最后一位无论是什么数字，都省略！）
		System.out.println("忽略最后一位（结果为）："+a.divide(b,20,BigDecimal.ROUND_DOWN));
		
		//BigDecimal.ROUND_CEILING方法（商如果是正数，按照ROUND_UP模式处理！商如果是负数，按照ROUND_DOWN模式处理！）
		System.out.println("正值进位负值忽略（结果为）："+a.divide(b,20,BigDecimal.ROUND_CEILING));
		
		//与BigDecimal.ROUND_FLOOR方法与Bigdecimal.ROUND_CEILING方法用法相反！
		System.out.println("正值忽略负值进位（结果为）："+a.divide(b,20,BigDecimal.ROUND_FLOOR)+"\n");
		
		
		System.out.println("30除以60的结果为：");
		b = new BigDecimal(60);
		
		//BigDecimal.ROUND_HALF_DOWN方法（如果商最后一位小于等于5，做舍弃操作；如果大于5，做进位操作！）
		System.out.println("保留两位小数的结果："+a.divide(b,2,BigDecimal.ROUND_HALF_DOWN));
		System.out.println("忽略 <= 5的结果："+a.divide(b,0,BigDecimal.ROUND_HALF_DOWN));
		
		//BigDecimal.ROUND_HALF_UP方法（商最后一位小于5，舍弃；大于等于5，进位操作！）
		System.out.println("忽略 < 5的结果为："+a.divide(b,0,BigDecimal.ROUND_HALF_UP)+"\n");
		
		
		/*
		 * BigDecimal.ROUND_HALF_EVEN方法：
		 * 如果商的倒数第二位为奇数，则按照ROUND_HALF_UP处理；
		 * 如果为偶数，则按照ROUND_HALF_DOWN处理。
		 * 如：7.5≈8，8.5≈8。
		 */
		BigDecimal result = a.divide(b,2,BigDecimal.ROUND_HALF_UP);
		System.out.println(result+"的EVEN模式结果为："+a.divide(b,0,BigDecimal.ROUND_HALF_EVEN)+"\n");
		
		System.out.println("30除以20的结果为：");
		b = new BigDecimal(20);
		result = a.divide(b,2,BigDecimal.ROUND_HALF_UP);
		System.out.println(result+"的EVEN模式结果为："+a.divide(b,0,BigDecimal.ROUND_HALF_EVEN));
		

	}

}
