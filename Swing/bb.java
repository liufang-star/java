package Swing�������.txt;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

                                                                //JFrame���������棡

public class bb extends JFrame{
	
	public bb() {   //����һ�����췽����
		
		setVisible(true);    //���ô���ɼ���
		
		setBounds(550, 350, 500, 400);     //��������ʹ�С��
		setTitle("��ӭ������������");   //���ô�����⣡
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //���ùرմ��ڷ�ʽ��
		
		JLabel k = new JLabel("��ϲ���㣡");     //����һ��JLabel��ǩ��
		k.setHorizontalAlignment(SwingConstants.CENTER);    //ʹ��ǩ�ϵ����־��У�
		add(k);    //����ǩ��ӵ������У�
		
		Container i = getContentPane();    //��ȡһ��������
		i.setBackground(Color.CYAN);   //���ô��屳����ɫ��
		
		setResizable(false);   //���ô����Ƿ��������
		
		i.invalidate();  //ˢ��ҳ��Ч��������֤�����е��������
		
		System.out.println(" x = "+getX()+"��y = "+getY());
	}

	public static void main(String[] args) {     //���������е���bb()���췽����
		new bb();
	
	}

}
