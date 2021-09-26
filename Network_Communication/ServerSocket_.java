package Network_Communication;

                             //TCP程序设计基础！（ServerSocket类-->服务器套接字！）

/*
 * 客户端套接字
 * 语法：
 *             Socket client = new Socket("192.168.0.1",1100);
 *             196.168.0.1：服务器的IP地址，可以是字符串，也可以是InetAddress对象
 *             1100：服务器端口
 * 常用方法：
 *             getInputStream()：获取套接字输入流，返回InputStream对象
 *             getOutputStream()：获取套接字输出流，返回OutputStream对象
 *             isConnected()：查看套接字是否连接
 *             close()：关闭套接字
 *             
 *服务器套接字
 *语法：
 *           ServerSocket server = new ServerSocket(1100);
 *           1100：服务器开启的端口
 *常用方法：
 *           accept()：等待客户端的连接，返回成功连接的Socket对象
 *           getInetAddress()：返回此服务器套接字的本地地址
 *           isClosed()：查看服务器套接字是否关闭
 *           close()：关闭套接字
 *             
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.OutputStream;

public class ServerSocket_ {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//服务器端！
		try {
			ServerSocket server = new ServerSocket(1100);    //创建服务器套接字！
			System.out.println("服务器启动成功，等待用户接入......");
			Socket client = server.accept();//等待用户输入
			
			//获取客户端地址
			System.out.println("有客户端接入，客户端IP："+client.getInetAddress());
			
			InputStream in = client.getInputStream();
			byte[] bt = new byte[1024];
			int len = in.read(bt);
			String data = new String(bt,0,len);
			System.out.println("客户端发来消息："+data);
			
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
		
		//客户端！
		try {
			Socket client = new Socket("127.0.0.1",1100);   //创建套接字，指定服务器地址！
			System.out.println("连接成功！");
			
			//创建字节输出流
			OutputStream out =client.getOutputStream();
			String message = "服务器你好，我是客户端！";
			out.write(message.getBytes());
			
			client.close();//关闭套接字
			
		} catch (UnknownHostException e) {    //在主机不存在或网络连接错误时发生此异常！
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	

}
                          