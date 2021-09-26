package zixuewang;

import java.util.Scanner;

                             //随机数问题！

public class Text3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入4为会员号：\n");
		
		int vip = input.nextInt();
		
		int bai = vip/100%10;
		
		//Math.random() ->> 0-1之间的随机小数
		
		int sui = (int)(Math.random()*10);//java中的强制类型转换，是没有四舍五入的，小数点后面的数字全部干掉。
		
		System.out.println("百位为："+bai+"\n随机为："+sui);
		
		if(bai == sui) {
			
			System.out.println("幸运奖！");
			
		}else {
			
			System.out.println("烧香去吧～");
			
		}
	}

}
