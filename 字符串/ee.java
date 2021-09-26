package 字符串.txt;

import java.util.Scanner;

public class ee {
	
	                                                     //使用正则表达式判断是否为正确的邮箱！

	public static void main(String[] args) {
		int count = 0;
		Scanner koko = new Scanner(System.in);
		System.out.println("请输入您的邮箱：");
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		while(true) {
			String kk = koko.nextLine();
		if(kk.matches(regex)) {
			System.out.println("输入正确！");
		}else {
			count++;
			if(count>=3) {
				System.out.println("您已经三次输入错误，邮箱已被锁定！");
				break;
			}else {
				System.out.println("你已经"+count+"次输入错误，你还有"+(3-count)+"次机会！");
				continue;
			}
		}
	

	}

}
}