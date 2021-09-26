package Network_Communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sender_������ extends Thread{
	
	int port = 9898; //�˿�
	InetAddress group; //�㲥���ַ
	MulticastSocket socket;  //�ಥ���ݰ��׽���
	
	public Sender_������() {
		
		try {
			
			//�㲥���ַ��Χ��224.0.0.0 ~ 239.255.255.255
			group = InetAddress.getByName("224.255.10.0");   //ָ���㲥���ַ
			socket = new MulticastSocket(port);   //ʵ�����ಥ���ݰ��׽���
			socket.joinGroup(group);   //����㲥��
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
		String massage = "[" + sf.format(date)+ "]����Ԥ������ǰ�������硣";
		byte  data[] = massage.getBytes();
		packet = new DatagramPacket(data, data.length,group,port);   //�������ݰ�
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
		
		Sender_������ send = new Sender_������();
		send.start();

	}

}
