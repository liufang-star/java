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

public class Receiver_收件人 extends JFrame implements Runnable,ActionListener{
	
	JButton ince = new JButton("开始接收");   //“开始接收”按钮
	JButton stop = new JButton("停止接收");  //"停止接收"按钮
	JTextArea inceAr = new JTextArea(10,10);   //显示接收广播的提示
	JTextArea inced = new JTextArea(10,10);   //显示接收的广播
	
	Thread thread;  //创建Thread(线程)对象，用来新开线程执行广播接收操作
	
	boolean getMassage = true;   //显示接收广播
	
	int port = 9898; //端口
	InetAddress group; //广播组地址
	MulticastSocket socket;  //多播数据包套接字
	
	public Receiver_收件人() {   //构造方法
		super("广播数据报");  //设置窗体标题
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //设置窗体关闭方式
		inceAr.setForeground(Color.blue);   //指定提示文本域中文字颜色
		JPanel north = new JPanel();   //创建JPanel对象
		north.add(ince);   //将按钮添加到面板north上
		north.add(stop);
		add(north,BorderLayout.NORTH);    //将north放置在窗体的上部
		JPanel center = new JPanel();   //创建面板对象center
		center.setLayout(new GridLayout(1 ,2));   //设置面板布局
		center.add(inceAr);   //将文本域添加到面板上
		final JScrollPane scrollPane = new JScrollPane();
		center.add(scrollPane);
		scrollPane.setViewportView(inced);
		add(center,BorderLayout.CENTER);    //设置面板布局
		
		thread = new Thread(this);
		ince.addActionListener(this);
		stop.addActionListener(this);
		
		validate();   //重新验证容器中的组件，即刷新组件
		setBounds(100,50,360,380);    //设置布局
		setVisible(true);    //将窗体设置为显示状态
		
		try {
			group = InetAddress.getByName("224.255.10.0");   //指定广播组地址
			socket = new MulticastSocket(port);   //实例化多播数据包套接字
			socket.joinGroup(group);   //加入广播组
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {    //主方法
		
		Receiver_收件人 rec = new Receiver_收件人();   //创建本类对象
		rec.setSize(460, 200);   //设置窗体大小

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
				
				socket.receive(packet);  //读取数据包
				String massage = new String(packet.getData(),0,packet.getLength());    //从数据包中读取数据
				inceAr.setText("正在接收的内容："+massage);
				inced.append(massage+"\n");
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
