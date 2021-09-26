package 字符串.txt;

public class hh {  //新建类
	 
	                       //比较stringbuilder和string的运行效率！！！

	public static void main(String[] args) {   //主方法
		
				String str = "";    //创建空字符串
				
				//定义对字符串执行操作的起始时间
				
				long starTime = System.currentTimeMillis();
				for(int i =0;i < 10000;i++) {    //利用for循环执行10000次操作
					str += 1;    //循环追加字符串
				}
				long endTime = System.currentTimeMillis();   //定义对字符串操作后的时间
				long time = endTime - starTime;   //计算对字符串执行操作的时间
				System.out.println("String消耗的时间为："+time);   //将执行的时间输出
				
				StringBuilder builder = new StringBuilder("");  //创建字符串生成器
				starTime = System.currentTimeMillis();  //定义操作执行前的时间
				for(int j = 0;j < 10000;j++) {   //利用for循环执行操作10000次
					builder.append(j);   //循环追加字符串
				}
				endTime = System.currentTimeMillis();   //定义操作后的时间
				time = endTime - starTime;  //追加操作执行的时间
				System.out.println("stringbuilder消耗时间为："+time);
				
			
	}

}
