package 字符串.txt;

import java.util.Date;

public class dd {
	
	                                 //格式化字符串（使用format方法进行格式化字符串！）

	public static void main(String[] args) {
		
		//（1）日期和时间字符串格式化（使用format方法进行格式化）
		
		Date date = new Date();
		String s = String.format("%tF",date);
		System.out.println("原字符串时间："+date);
		System.out.println("使用format格式化字符串之后的时间："+s);
		System.out.println();
		
		
		String year = String.format("%tY", date); //%tY表示获取当前年份。2020年
		String month = String.format("%tB", date); //%tB表示指定语言环境的月份全称。February（英文）、二月（中文）
		String tian = String.format("%te", date);  //%te表示一个月中的某一天。
		System.out.println("今年是："+year+"年"+"\t现在是："+month+"\t今天是："+tian+"号");
		System.out.println();
		
		
		String hour = String.format("%tH", date);  //%tH表示（2位数字的24小时制的小时（00-23））
		String minte = String.format("%tM", date);  //%tM表示（2位数字的分钟（00-59））
		String miao = String.format("%tS", date);  //%tS表示（2位数字的秒数（00-60））
		String wu = String.format("%tp", date);  //%tp表示上午或下午标记
		System.out.println("现在是："+hour+"时"+minte+"分"+miao+"秒\t"+wu);
		System.out.println();
		
		
		String str1 = String.format("%tF", date);   //“年- 月-日”格式（4位年份）
		System.out.println("%tF格式："+str1);
		String str2 = String.format("%tD", date);   //“月/日/年”格式（2位年份）
		System.out.println("%tD格式："+str2);
		String str3 = String.format("%tc", date);   //全部日期和时间信息
		System.out.println("%tc格式："+str3);
		String str4 = String.format("%tr", date);   //“时:分:秒 PM(AM)”格式（12时制）
		System.out.println("%tr格式："+str4);
		String str5 = String.format("%tA", date);   //星期---
		System.out.println("%tA格式："+str5);
		String str6 = String.format("%tT", date);   //“时:分:秒 ”格式（24时制）
		System.out.println("%tT格式："+str6);
		String str7 = String.format("%tR", date);   //“时:分”格式（24时制）
		System.out.println("%tR格式："+str7);
		System.out.println();
		
		
		
		
		
		
		
		//(2)常规类型格式化
		
		String kk = String.format("字母x的大写为：%c", 'X');
		System.out.println(kk);
		System.out.println(String.format("123456+456789的结果为：%d", 123456+456789));
		System.out.println(String.format("圆周率取两位小数为：%.2f", Math.PI));
		System.out.println(String.format("1200000000.1用科学计数法表示为：%e", 1200000000.1));
		System.out.println(String.format("2>3吗？ %b", 2>3));
		System.out.println(String.format("天才是由%d%%的灵感和%d%%的汗水！", 1,99));

	}

}
