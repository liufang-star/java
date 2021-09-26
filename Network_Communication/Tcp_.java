package Network_Communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

                                          //Tcp服务器端程序

public class Tcp_ {      //创建Tcp_类
	
	private BufferedReader reader;      //创建一个缓冲字符输出流！（BuffferedReader对象）
	private ServerSocket  server;     //创建一个服务器端！（ServerSocket对象）
	private Socket socket;       //创建一个客户端！（Socket对象）
	
	void getserver() {    //创建方法
		try {
			server = new ServerSocket(8998);    //创建服务器套接字
			System.out.println("服务器套接字已经创建成功");     //输出信息
			while(true) {     //如果套接字是连接状态.0
				System.out.println("等待客户机的连接. . .");    //输出信息
				
				socket = server.accept();    //实例化socket对象
				
				//实例化BufferedReader对象
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				getClienMessage();     //调用getClienMessage()方法
			}
		} catch (IOException e) {
			e.printStackTrace();     //输出异常信息
		}
	}
	
	private void getClienMessage() {
		while(true) {      //如果套接字是连接状态
			try {
				System.out.println("客户机："+reader.readLine());    //获得客户端信息
			} catch (IOException e) {
				e.printStackTrace();      //输出异常信息
			}
				try {
					if(reader != null) {
					reader.close();     //关闭流
				}
					if(socket != null) {
						socket.close();      //关闭套接字
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	public static void main(String[] args) {
		
		Tcp_ tcp = new Tcp_();
		tcp.getserver();
		

	}

}
