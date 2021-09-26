package Network_Communication;

import java.net.InetAddress;
import java.net.UnknownHostException;

                        //IP��ַ��װ�ࣨInetAddress��-->������˼��ȱ������

/*
 * IP��ַ��װ�ࣺ
 *          InetAddress host = InetAddress.getLocalHost();   ---->��ȡ���ص�ַ��
 *          
 *          InetAddress host = InetAddress.getByName("192.168.0.1");   ---->��ȡָ����ַ��
 *                                                                                             IP��ַ
 *                                                                                             
 *          InetAddress host = InetAddress.getByName("www.baidu.com");
 *                                                                                              ������ַ
 *                                                                                              
 *          InetAddress host = InetAddress.getByName("LAPTOP��FH7MMM10");
 *                                                                                               �������
 *           
 *                                                                    ��ȡָ�����������е�ַ��                          
 *          InetAddress[] host = InetAddress.getAllByName("www.baidu.com");
 *           
 * ���ã� 
 *         ʹ��InetAddress����Ի�ȡIP��ַ��������ַ����Ϣ��
 *         
 * ���÷�����
 *                      ����                                       ����ֵ                                   ˵��
 *            getByName(String host)           InetAddress        ��ȡ��Host���Ӧ��InetAddress����
 *            getHostAddress()                     String                   ��ȡInetAddress������������IP��ַ
 *            getHostName()                          String                   ��ȡ��IP��ַ��������
 *            getLocalHost()                           InetAddress        ���ر���������InetAddress����
 *            
 * IP��ַ��
 *             Internet Protocol  -->  ����֮��Ļ���Э�飡
 *             
 * IP��ַ�ĸ�ʽ��
 *           192.168.0.1��------>IPv4
 *           (0~255)   ---->   255.255.255.255
 */

public class Inetaddress_ {

	public static void main(String[] args) {
		
		try {
			
			//������������ļ��������IP��ַ��
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			
			System.out.println("���������"+local.getHostName());   //����������
			System.out.println("IP��ַ��"+local.getHostAddress());//��ȡIP��ַ
			
			
			System.out.println();
			//��ȡ�ٶȵ�ַ������
			InetAddress host = InetAddress.getByName("www.baidu.com");
			System.out.println(host);
			System.out.println("�ٶ�����"+host.getHostName()); //�������
			System.out.println("�ٶ�IP��"+host.getHostAddress());   //����IP��ַ
			
			
			System.out.println();
			//��ȡ���аٶȵ�ַ
			InetAddress baidu[] = InetAddress.getAllByName("www.baidu.com");
			for(InetAddress ad : baidu) {
				System.out.println("��ȡ���аٶ�IP��"+ad.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}
