package zixuewang;

import java.util.Scanner;

                          //购物管理系统！！！

public class Text9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("============欢迎来到购物管理系统=============");
		System.out.println("==================1.登录====================");
		System.out.println("==================2.退出====================");
        System.out.println("请选择：");
        int choice1 = in.nextInt();
        if(choice1 == 1) {
        	int count = 0;
        	while(1==1) {
        		System.out.println("请输入用户名：");
        		String name = in.next();
        		System.out.println("请输入密码：");
        		String pwd = in.next();
        		if("aaa".equals(name) && "123".equals(pwd)) {
        			while(1==1){
        				System.out.println("===1.客户信息管理===");
            			System.out.println("===2.购物结算===");
            			System.out.println("===3.真情回馈===");
            			System.out.println("===4.注销===");
            			System.out.println("请选择：");
            			int choice2 = in.nextInt(); 
            			if(choice2==1) {
            				System.out.println("======客户信息管理======");
                			System.out.println("===1.添加用户===");
                			System.out.println("===2.年龄统计===");
                			System.out.println("===3.返回主菜单===");
                			System.out.println("请选择：");
                			int choice21 = in.nextInt(); 
                			if(choice21 == 1) {
                				String clist = "";
                				while(1==1) {
                					System.out.println("请输入姓名：");
                					String name1 = in.next();
                					System.out.println("请输入年龄：");
                					int age1 = in.nextInt();
                					clist = clist+name1+"-----"+age1+"\n";
                					System.out.println("添加成功！继续添加请输入1，输入其它停止。");
                					String choice3 = in.next();
                					if("1".equals(choice3)) {
                						continue;
                					}else {
                						System.out.println(clist);
                						break;
                					}
                				}
                			}else if(choice21 == 2) {
                				int up30 = 0;
                				int down30 = 0;
                				int i = 1;
                				while(i<=3) {
                					System.out.println("请输入姓名：");
                					String name2 = in.next();
                					System.out.println("请输入年龄：");
                					int age2 = in.nextInt();
                					if(age2>=30) {
                						up30++;
                					}else {
                						down30++;
                					}
                					i++;
                				}
                				System.out.println("30岁以上比例为："+up30/10.0*100+"%");
                				System.out.println("30岁以上比例为："+down30/10.0*100+"%");
                			}else{
                				continue;
                			}
            				
            			}else if(choice2==2) {
            				System.out.println("商品列表：01.苹果 5元\t02.梨子 6元\t03.香蕉 3元");
            				double total = 0;
            				while(1==1) {
            					System.out.println("请输入商品编号：");
            					String pid = in.next();
            					System.out.println("请输入商品数量：");
            					int pnum = in.nextInt();
            					String pName = "";
            					double pPrice = 0;
            					if("01".equals(pid)) {
            						pName = "苹果";
            						pPrice = 5;
            					}else if("02".equals(pid)) {
            						pName = "梨子";
            						pPrice = 6;
            					}else if("03".equals(pid)){
            						pName = "香蕉";
            						pPrice = 3;
            					}else {
            						System.out.println("");
            						System.out.println("查无此商品！");
            						System.out.println("");
            					}
            					double t = pPrice*pnum;
            					total = total+t;
            					System.out.println("当前添加的是："+pName+"\t数量："+pnum+"\t总价："+t);
            					System.out.println("");
            					System.out.println("结算请输入1，输入其他数字则继续添加。");
            					int choice = in.nextInt();
            					if(choice == 1) {
            						break;
            					}
            				}
            				System.out.println("合计应付款："+total);
            				System.out.println("请输入付款金额：");
            				double money = in.nextDouble();
            				if(money<=total) {
            					System.out.println("金额不足！");
            				}else {
            					System.out.println("收款"+money+"元，应付款"+total+"元，找零"+(money-total)+"元");
            					System.out.println("欢迎下次再来！");
            					System.out.println("");
            				}
            				
            			}else if(choice2==3) {
            				System.out.println("开始抽奖......正在生成幸运数字......");
            				double r =Math.random();
            				int n = (int)(r*100+1);
            				System.out.println("幸运数字是："+n);
            				if(n<5) {
            					System.out.println("恭喜获得一等奖：500元购物券！");
            				}else if(n<=15) {
            					System.out.println("恭喜获得二等奖：10元话费！");
            				}else {
            					System.out.println("谢谢惠顾！");
            				}
            			}else if(choice2==4) {
            				continue;
            			}else {
            				System.out.println("输入错误！");
            			}
        			}
        			
        		}else {
        			count++;
        			if(count>=3) {
        				System.out.println("已经三次输入错误，强制退出！");
        				break;
        			}else {
        				System.out.println("输入错误，请重新输入！");
        				continue;
        			}
        		}
        	}
        	
        }else if(choice1 == 2){
        	System.out.println("退出系统！");
        }else {
        	System.out.println("输入错误！");
        }
	}

}
