package 数字处理类.txt;

                           //数学运算（引用Math类！！）

public class bb {

	public static void main(String[] args) {
		
		System.out.println("圆周率Π的值为："+Math.PI+"\n");

		
		//三角函数！
		System.out.println("90°的正弦值为："+Math.sin(Math.PI/2));
		System.out.println("0°的余弦值为："+Math.cos(0)+"\n");
		
		
		//指数运算！
		System.out.println("e的平方根为："+Math.exp(2));
		System.out.println("以e为底2的对数值为："+Math.log(2));
		System.out.println("以10为底2的对数值为："+Math.log10(2));
		System.out.println("4的平方根为："+Math.sqrt(4));
		System.out.println("125的立方根为："+Math.cbrt(125));
		System.out.println("2的二次方为："+Math.pow(2, 2));
		System.out.println("2的五次方为："+Math.pow(2, 5)+"\n");
		
		//比较运算！
		System.out.println("46和32比较（最大值为）："+Math.max(46, 32));
		System.out.println("13和79比较（最小值为）："+Math.min(13, 79));
		System.out.println("-7的绝对值为："+Math.abs(-7)+"\n");
		
		
		//四舍五入！
		System.out.println("使用floor()方法的效果："+Math.floor(2.6));
		System.out.println("使用round()方法的效果："+Math.round(2.6));
		
		
		//Math.round(x) = (int)Math.floor(x+0.5f);
		System.out.println("----------------------------------------");
		System.out.println("使用Math.round方法四舍五入15.5的值为："+Math.round(15.5));
		System.out.println("使用Math.round方法四舍五入-15.5的值为："+Math.round(-15.5));
		System.out.println("使用Math.round方法四舍五入-15.51的值为："+Math.round(-15.51));
		System.out.println("使用Math.floor(-15.5 + 0.5f)值为："+Math.floor(-15.5 + 0.5f));
		System.out.println("使用Math.floor(-15.51 + 0.5f)值为："+Math.floor(-15.51 + 0.5f));
		
		
		
		

	}

}
