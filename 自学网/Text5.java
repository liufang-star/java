package zixuewang;

import java.util.Scanner;

                           //超市收银系统... ...

public class Text5 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		String pName1 = "苹果";
		double pPrice1 = 9.9;
		String pNum1 = "1001";
		
		String pName2 = "香蕉";
		double pPrice2 = 3.9;
		String pNum2 = "1002";
		
		String pName3 = "梨子";
		double pPrice3= 7.9;
		String pNum3 = "1003";
		
		System.out.println("欢迎来到超市收银系统！");
		System.out.println("请输入商品编号：\n");
		String num = s.next();
		System.out.println("请输入商品数量：\n");
		int count = s.nextInt();
		
		String pName = ""; //保存商品名称
		double pPrice = 0; //保存商品价格
		
		if(num.equals(pNum1)) {
			pName = pName1;
			pPrice = pPrice1;
		}else if(num.equals(pNum2)) {
			pName = pName2;
			pPrice = pPrice2;
		}else if(num.equals(pNum3)) {
			pName = pName3;
			pPrice = pPrice3;
		}else {
			System.out.println("查无此商品！");
		}
		double total = count*pPrice;
		System.out.println("您购买的是："+pName+"\t\t单价："+pPrice+"\t数量：\t"+count+"\t总价："+total);
		
		System.out.println("请输入付款金额：\n");
		double money = s.nextDouble();
		
		if(money<total) {
			System.out.println("金额不足！\n");
		}else {
			System.out.println("收到"+money+"元，找零"+(money-total)+"元");
		}
		System.out.println("谢谢惠顾！");
	}
	 
}