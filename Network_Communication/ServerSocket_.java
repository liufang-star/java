package Network_Communication;

                             //TCP������ƻ�������ServerSocket��-->�������׽��֣���

/*
 * �ͻ����׽���
 * �﷨��
 *             Socket client = new Socket("192.168.0.1",1100);
 *             196.168.0.1����������IP��ַ���������ַ�����Ҳ������InetAddress����
 *             1100���������˿�
 * ���÷�����
 *             getInputStream()����ȡ�׽���������������InputStream����
 *             getOutputStream()����ȡ�׽��������������OutputStream����
 *             isConnected()���鿴�׽����Ƿ�����
 *             close()���ر��׽���
 *             
 *�������׽���
 *�﷨��
 *           ServerSocket server = new ServerSocket(1100);
 *           1100�������������Ķ˿�
 *���÷�����
 *           accept()���ȴ��ͻ��˵����ӣ����سɹ����ӵ�Socket����
 *           getInetAddress()�����ش˷������׽��ֵı��ص�ַ
 *           isClosed()���鿴�������׽����Ƿ�ر�
 *           close()���ر��׽���
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
		
		//�������ˣ�
		try {
			ServerSocket server = new ServerSocket(1100);    //�����������׽��֣�
			System.out.println("�����������ɹ����ȴ��û�����......");
			Socket client = server.accept();//�ȴ��û�����
			
			//��ȡ�ͻ��˵�ַ
			System.out.println("�пͻ��˽��룬�ͻ���IP��"+client.getInetAddress());
			
			InputStream in = client.getInputStream();
			byte[] bt = new byte[1024];
			int len = in.read(bt);
			String data = new String(bt,0,len);
			System.out.println("�ͻ��˷�����Ϣ��"+data);
			
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
		
		//�ͻ��ˣ�
		try {
			Socket client = new Socket("127.0.0.1",1100);   //�����׽��֣�ָ����������ַ��
			System.out.println("���ӳɹ���");
			
			//�����ֽ������
			OutputStream out =client.getOutputStream();
			String message = "��������ã����ǿͻ��ˣ�";
			out.write(message.getBytes());
			
			client.close();//�ر��׽���
			
		} catch (UnknownHostException e) {    //�����������ڻ��������Ӵ���ʱ�������쳣��
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	

}
                          