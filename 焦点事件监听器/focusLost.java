package FocusEvent_;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class focusLost extends JFrame{
	
	public focusLost() {
		
		setTitle("�����¼���������FocusEvent��");
		setBounds(550, 350, 500, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();    //����һ�����ɹ������
		setContentPane(contentPane);    //��������
		contentPane.setLayout(null);   //���þ��Բ���
		
		JTextField jt1 = new JTextField(20);    //�����ı���
		jt1.setBounds(30, 30, 200, 30);
		contentPane.add(jt1);
		
		JTextField jt2 = new JTextField(20);
		jt2.setBounds(30, 90, 200, 30);
		contentPane.add(jt2);
		
		JTextField jt3 = new JTextField(20);
		jt3.setBounds(30, 150, 200, 30);
		contentPane.add(jt3);
		
		JLabel jl1 = new JLabel("δ��ý���");   //���ñ�ǩ
		jl1.setBounds(260, 20, 100, 50);
		contentPane.add(jl1);
		
		JLabel jl2 = new JLabel("δ��ý���");
		jl2.setBounds(260, 80, 100, 50);
		contentPane.add(jl2);
		
		JLabel jl3 = new JLabel("δ��ý���");
		jl3.setBounds(260, 140, 100, 50);
		contentPane.add(jl3);
		

//��һ�ֻ�ȡ��ʧȥ����ķ�����
jt1.addFocusListener(new FocusListener() {   //��ӽ����¼�����
			
			@Override
			public void focusLost(FocusEvent e) {    //ʧȥ���������Ч��
				jl1.setText("ʧȥ����");
				jl1.setForeground(Color.BLUE);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {     //��ȡ���������Ч��
				jl1.setText("����ڽ��㡰1����");
				jl1.setForeground(Color.RED);
				
			}
		});
		
jt2.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				jl2.setText("ʧȥ����");
				jl2.setForeground(Color.BLUE);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				jl2.setText("����ڽ��㡰2����");
				jl2.setForeground(Color.RED);
				
			}
		});


jt3.addFocusListener(new FocusListener() {
	
	@Override
	public void focusLost(FocusEvent e) {
		jl3.setText("ʧȥ����");
		jl3.setForeground(Color.BLUE);
		
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		jl3.setText("����ڽ��㡰3����");
		jl3.setForeground(Color.RED);
		
	}
});


//�ڶ��ֻ�ȡ��ʧȥ����ķ�����
//jt1.addFocusListener(new MyFocusListenter());
//jt3.addFocusListener(new MyFocusListenter());
//jt2.addFocusListener(new MyFocusListenter());
//
//class MyFocusListenter implements FocusListener{     //�����Զ�����¼�����ʵ����
//
//
//	public void focusGained(FocusEvent e) {
//		JTextField tmp = (JTextField)e.getSource();    //��ȡ�����¼������
//		tmp.setBorder(BorderFactory.createLineBorder(Color.green));   //����ȡ������ı������ñ߿���ɫ
//		
//	}
//
//	
//	public void focusLost(FocusEvent e) {
//		JTextField tmp = (JTextField)e.getSource();    //��ȡ�����¼������
//		tmp.setBorder(BorderFactory.createLineBorder(Color.CYAN));   //��ʧȥ������ı������ñ߿���ɫ
//		
//		
//	}
//
//	}
		
		
	}

	public static void main(String[] args) {
		focusLost k = new focusLost();
		k.setVisible(true);

	}

}
