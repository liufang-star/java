package Network_Communication;

import java.net.InetAddress;
import java.net.UnknownHostException;

                        //IP地址封装类（InetAddress类-->中文意思：缺乏）！

/*
 * IP地址封装类：
 *          InetAddress host = InetAddress.getLocalHost();   ---->获取本地地址！
 *          
 *          InetAddress host = InetAddress.getByName("192.168.0.1");   ---->获取指定地址！
 *                                                                                             IP地址
 *                                                                                             
 *          InetAddress host = InetAddress.getByName("www.baidu.com");
 *                                                                                              域名地址
 *                                                                                              
 *          InetAddress host = InetAddress.getByName("LAPTOP—FH7MMM10");
 *                                                                                               计算机名
 *           
 *                                                                    获取指定主机的所有地址！                          
 *          InetAddress[] host = InetAddress.getAllByName("www.baidu.com");
 *           
 * 作用： 
 *         使用InetAddress类可以获取IP地址、主机地址等信息。
 *         
 * 常用方法：
 *                      方法                                       返回值                                   说明
 *            getByName(String host)           InetAddress        获取与Host相对应的InetAddress对象
 *            getHostAddress()                     String                   获取InetAddress对象所包含的IP地址
 *            getHostName()                          String                   获取此IP地址的主机名
 *            getLocalHost()                           InetAddress        返回本地主机的InetAddress对象
 *            
 * IP地址：
 *             Internet Protocol  -->  网络之间的互联协议！
 *             
 * IP地址的格式：
 *           192.168.0.1：------>IPv4
 *           (0~255)   ---->   255.255.255.255
 */

public class Inetaddress_ {

	public static void main(String[] args) {
		
		try {
			
			//输出本地主机的计算机名和IP地址！
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			
			System.out.println("计算机名："+local.getHostName());   //输出计算机名
			System.out.println("IP地址："+local.getHostAddress());//获取IP地址
			
			
			System.out.println();
			//获取百度地址和名字
			InetAddress host = InetAddress.getByName("www.baidu.com");
			System.out.println(host);
			System.out.println("百度名："+host.getHostName()); //输出名字
			System.out.println("百度IP："+host.getHostAddress());   //数字IP地址
			
			
			System.out.println();
			//获取所有百度地址
			InetAddress baidu[] = InetAddress.getAllByName("www.baidu.com");
			for(InetAddress ad : baidu) {
				System.out.println("获取所有百度IP："+ad.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}
