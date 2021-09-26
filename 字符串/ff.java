package 字符串.txt;

import java.util.Scanner;

public class ff {
	
	                        //使用正则表达式

	public static void main(String[] args) {
		
		//（2）使用正则表达式判断是否为手机号码！
		
				Scanner kk = new Scanner(System.in);
				System.out.println("请输入您的电话号码：");
				String regex1 = "(13[0-9]|15[012356789]|18[056789])\\d{8}";
				while(true) {
					String kk1 = kk.nextLine();
					if(kk1.matches(regex1)) {
						System.out.println("输入正确！");
						break;
					}
					else {
						System.out.println("输入错误，请重新输入：");
					}
				}

	}

}
