package Swing�������.txt;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

                                                            //�Ի����壨JDialog����

public class cc extends JDialog{
	
	public cc(JFrame frame) {   //����һ�����췽����
		
		/*
		 * super(frame,"�Ի������",true);���ͣ�
		 * ��һ�����������������
		 * �ڶ����������Ի������
		 * �������������Ƿ�����������
		 */
		super(frame,"�Ի������",true);
		
		Container k =getContentPane();    //��ȡһ��������
		k.add(new JLabel("����һ���Ի���"));   //����һ��JLabel��ǩ��
		setBounds(720, 450, 200, 200);  //���ô�������ʹ�С��
	}

	public static void main(String[] args) {
		JFrame k = new JFrame("������");   //����һ�������壡
		k.setBounds(550,350,550,350);    //���ô�������ʹ�С��
		Container t = k.getContentPane();  //��ȡһ��������
		JButton ko = new JButton("�����Ի���");
		t.setLayout(new FlowLayout());    //���ò��֣�ʹ�������֣�
		k.add(ko);      //��ko�еİ�ť���֣������Ի�����ӵ������У�
		k.setVisible(true);  //���ô���ɼ���
		k.setDefaultCloseOperation(EXIT_ON_CLOSE);   //���ô���رշ�ʽ��
		ko.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cc a = new cc(k);
				a.setVisible(true);   //���ô���ɼ���
				
			}
		});   //��Ӷ���������
	

	}

}
