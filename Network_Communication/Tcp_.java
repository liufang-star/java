package Network_Communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

                                          //Tcp�������˳���

public class Tcp_ {      //����Tcp_��
	
	private BufferedReader reader;      //����һ�������ַ����������BuffferedReader����
	private ServerSocket  server;     //����һ���������ˣ���ServerSocket����
	private Socket socket;       //����һ���ͻ��ˣ���Socket����
	
	void getserver() {    //��������
		try {
			server = new ServerSocket(8998);    //�����������׽���
			System.out.println("�������׽����Ѿ������ɹ�");     //�����Ϣ
			while(true) {     //����׽���������״̬.0
				System.out.println("�ȴ��ͻ���������. . .");    //�����Ϣ
				
				socket = server.accept();    //ʵ����socket����
				
				//ʵ����BufferedReader����
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				getClienMessage();     //����getClienMessage()����
			}
		} catch (IOException e) {
			e.printStackTrace();     //����쳣��Ϣ
		}
	}
	
	private void getClienMessage() {
		while(true) {      //����׽���������״̬
			try {
				System.out.println("�ͻ�����"+reader.readLine());    //��ÿͻ�����Ϣ
			} catch (IOException e) {
				e.printStackTrace();      //����쳣��Ϣ
			}
				try {
					if(reader != null) {
					reader.close();     //�ر���
				}
					if(socket != null) {
						socket.close();      //�ر��׽���
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
