package Network_Communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sender_发送人 extends Thread{
	
	int port = 9898; //端口
	InetAddress group; //广播组地址
	MulticastSocket socket;  //多播数据包套接字
	
	public Sender_发送人() {
		
		try {
			
			//广播组地址范围：224.0.0.0 ~ 239.255.255.255
			group = InetAddress.getByName("224.255.10.0");   //指定广播组地址
			socket = new MulticastSocket(port);   //实例化多播数据包套接字
			socket.joinGroup(group);   //加入广播组
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}   
 catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while (true) {
		DatagramPacket packet;
		Date date  = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
		String massage = "[" + sf.format(date)+ "]天气预报，当前天气：晴。";
		byte  data[] = massage.getBytes();
		packet = new DatagramPacket(data, data.length,group,port);   //创建数据包
		System.out.println(massage);
		
		try {
			
			socket.send(packet);
			Thread.sleep(1000);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}

	public static void main(String[] args) {
		
		Sender_发送人 send = new Sender_发送人();
		send.start();

	}

}
