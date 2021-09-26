package Network_Communication;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class Clien_ extends JFrame{
	
	private PrintWriter writer;       //声明PrintWriter类对象
	Socket socket;    //声明Socket类对象
	private JTextArea ta = new JTextArea();     //创建JTextArea对象
	private JTextField tf = new JTextField();      //创建JTextField对象
	Container cc;    //声明Container对象
	
	public Clien_(String title) {     //构造方法
		super(title);    //调用父类的构造方法
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //关闭窗体方式
		cc = this.getContentPane();    //实例化对象
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf,"South");     //将文本框放在窗体的下部
		
		//绑定事件
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());   //将文本框中的信息写入流
				ta.append(tf.getText() + '\n');   //将文本框中的信息显示在文本域中
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");        //将文本框清空
			}
		});
		
	}
	
	
	private void connect() {     //连接套接字方法
		
		ta.append("尝试连接\n");     //文本域中提示信息
		
		try {    //捕捉异常
			
			socket = new Socket("127.0.0.1",8998);    //实例化Socket对象
			writer = new PrintWriter(socket.getOutputStream(),true);
			ta.append("完成连接\n");      //文本域中提示信息
			
			}catch(Exception e) {
				
				e.printStackTrace();    //输出异常信息
				
		}
	}

	public static void main(String[] args) {       //主方法
		
		Clien_ clien = new Clien_("向服务器送数据");    //创建本例对象
		clien.setSize(200,200);    //设置窗体大小
		clien.setVisible(true);    //设置窗体可见
		clien.connect();      //调用连接方法
		

	}

}
