package Network_Communication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Receiver_�ռ��� extends JFrame implements Runnable,ActionListener{
	
	JButton ince = new JButton("��ʼ����");   //����ʼ���ա���ť
	JButton stop = new JButton("ֹͣ����");  //"ֹͣ����"��ť
	JTextArea inceAr = new JTextArea(10,10);   //��ʾ���չ㲥����ʾ
	JTextArea inced = new JTextArea(10,10);   //��ʾ���յĹ㲥
	
	Thread thread;  //����Thread(�߳�)���������¿��߳�ִ�й㲥���ղ���
	
	boolean getMassage = true;   //��ʾ���չ㲥
	
	int port = 9898; //�˿�
	InetAddress group; //�㲥���ַ
	MulticastSocket socket;  //�ಥ���ݰ��׽���
	
	public Receiver_�ռ���() {   //���췽��
		super("�㲥���ݱ�");  //���ô������
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //���ô���رշ�ʽ
		inceAr.setForeground(Color.blue);   //ָ����ʾ�ı�����������ɫ
		JPanel north = new JPanel();   //����JPanel����
		north.add(ince);   //����ť��ӵ����north��
		north.add(stop);
		add(north,BorderLayout.NORTH);    //��north�����ڴ�����ϲ�
		JPanel center = new JPanel();   //����������center
		center.setLayout(new GridLayout(1 ,2));   //������岼��
		center.add(inceAr);   //���ı�����ӵ������
		final JScrollPane scrollPane = new JScrollPane();
		center.add(scrollPane);
		scrollPane.setViewportView(inced);
		add(center,BorderLayout.CENTER);    //������岼��
		
		thread = new Thread(this);
		ince.addActionListener(this);
		stop.addActionListener(this);
		
		validate();   //������֤�����е��������ˢ�����
		setBounds(100,50,360,380);    //���ò���
		setVisible(true);    //����������Ϊ��ʾ״̬
		
		try {
			group = InetAddress.getByName("224.255.10.0");   //ָ���㲥���ַ
			socket = new MulticastSocket(port);   //ʵ�����ಥ���ݰ��׽���
			socket.joinGroup(group);   //����㲥��
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {    //������
		
		Receiver_�ռ��� rec = new Receiver_�ռ���();   //�����������
		rec.setSize(460, 200);   //���ô����С

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ince) {
			ince.setBackground(Color.red);
			stop.setBackground(Color.yellow);
			if(!thread.isAlive()) {
				thread = new Thread(this);
				getMassage = true;
			}
			thread.start();
		}
		if(e.getSource() == stop) {
			ince.setBackground(Color.yellow);
			stop.setBackground(Color.red);
			getMassage = false;
		}
	}

	@Override
	public void run() {
		
		while(getMassage) {
			DatagramPacket packet;
			byte data[] = new byte[1024];
			packet = new DatagramPacket(data, data.length,group,port);
			
			try {
				
				socket.receive(packet);  //��ȡ���ݰ�
				String massage = new String(packet.getData(),0,packet.getLength());    //�����ݰ��ж�ȡ����
				inceAr.setText("���ڽ��յ����ݣ�"+massage);
				inced.append(massage+"\n");
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
