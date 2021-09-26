package 数字处理类.txt;
import java.text.DecimalFormat;

                                        //数字格式化！（本人表示看不懂！！！）

/*十进制数字格式化类（DecimalFormat方法！）
 *DecimalFormat myformat = new DecimalFormat(pattern);（ pattern表示格式化模板！）
 */

public class aa {
	
	//使用实例化对象时设置格式化模式！
	static public void SimgleFormat(String pattern,double value) {  //定义含参的静态方法！
		DecimalFormat myformat = new DecimalFormat(pattern);  //格式化DecimalFormat对象！
		String output = myformat.format(value);  //将数字进行格式化！
		System.out.println("原值为："+value+ "\n模板： "+pattern+"\n格式化之后的值为："+output+"\n");
		
	}
	
	//使用applyPattern()方法对数字进行格式化！
	static public void UseApplyPatternMethodFormat(String pattern,double value) {   //定义两个含参的静态方法！
		DecimalFormat myformat = new DecimalFormat();  //实例化DecimalFormat对象！
		myformat.applyPattern(pattern);    //调用applyPattern()方法设置格式化模板！
		System.out.println("原值为："+value+"\n模板： "+pattern+"\n格式化之后的值为："+myformat.format(value)+"\n");
		
	}

	public static void main(String[] args) {
		SimgleFormat("###,###,###", 123456.789);  //调用静态SimgleFormat()方法！
		SimgleFormat("000000000.###kg", 123456.789);  //在数字后加上单位！
		//调用格式模板格式化数字，不存在的位以0显示！
		SimgleFormat("000000.000", 123.78);
		//调用静态UseApplyPatternMethodFormat()方法！
		UseApplyPatternMethodFormat("#.###%", 0.789);  //将数字转换位百分数形式！
		UseApplyPatternMethodFormat("###.##", 123456.789);  //将小数点后格式化为两位！
		UseApplyPatternMethodFormat("0.00\u2030", 0.789);  //将数字转化为千分数格式！
		
		
		
		
		DecimalFormat myformat = new DecimalFormat();   //实例化DecimalFormat类对象！
		myformat.setGroupingSize(2);     //设置将数字分组为2
		String output = myformat.format(123456.789);
		System.out.println("将数字以每个数字分组为："+output);
		myformat.setGroupingUsed(false);   //设置不允许数字进行分组！
		String output2 = myformat.format(123456.789);
		System.out.println("不允许数字分组："+output2);

		

	}

}
