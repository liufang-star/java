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
	
	private PrintWriter writer;       //����PrintWriter�����
	Socket socket;    //����Socket�����
	private JTextArea ta = new JTextArea();     //����JTextArea����
	private JTextField tf = new JTextField();      //����JTextField����
	Container cc;    //����Container����
	
	public Clien_(String title) {     //���췽��
		super(title);    //���ø���Ĺ��췽��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�رմ��巽ʽ
		cc = this.getContentPane();    //ʵ��������
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf,"South");     //���ı�����ڴ�����²�
		
		//���¼�
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());   //���ı����е���Ϣд����
				ta.append(tf.getText() + '\n');   //���ı����е���Ϣ��ʾ���ı�����
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");        //���ı������
			}
		});
		
	}
	
	
	private void connect() {     //�����׽��ַ���
		
		ta.append("��������\n");     //�ı�������ʾ��Ϣ
		
		try {    //��׽�쳣
			
			socket = new Socket("127.0.0.1",8998);    //ʵ����Socket����
			writer = new PrintWriter(socket.getOutputStream(),true);
			ta.append("�������\n");      //�ı�������ʾ��Ϣ
			
			}catch(Exception e) {
				
				e.printStackTrace();    //����쳣��Ϣ
				
		}
	}

	public static void main(String[] args) {       //������
		
		Clien_ clien = new Clien_("�������������");    //������������
		clien.setSize(200,200);    //���ô����С
		clien.setVisible(true);    //���ô���ɼ�
		clien.connect();      //�������ӷ���
		

	}

}
