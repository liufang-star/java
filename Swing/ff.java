package Swing�������.txt;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

                                                           //ͼ���ʹ�ã���setIcon�������ͼƬ����

public class ff extends JFrame{    //�̳�JFrame�࣡
	
	public ff() {   //���췽����
		
		setBounds(550, 350, 300, 300);   //���ô�������ʹ�С��
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô���رշ�ʽ��
		
		setTitle("ͼƬ����");    //������⡣
		
			Container b = getContentPane();   //����һ��������
			
			JLabel c = new JLabel("����һ��ͼƬ��");   //����һ��JLabel��ǩ��ʹ�ñ�ǩչʾͼƬ��
			c.setFont(new Font("����",Font.BOLD,20));   //���ñ�ǩ����ʹ�С��
			c.setForeground(Color.RED);   //����������ɫ��
		    b.add(c);    //��JLabel��ǩ�е�������ӵ������С�
		    
		  
//		    URL url = ff.class.getResource("WD898~E9F]}YC74_48)~CAF.jpg");   //��ȡͼƬURL·����
//		    Icon icon = new ImageIcon(url);    //��ȡ��ӦͼƬ·���µ�ͼƬ�ļ���
//		    c.setIcon(icon);    //���ͼƬ��
		    
			Icon icon = new ImageIcon("src/WD898~E9F]}YC74_48)~CAF.jpg");   //�ڶ��ֻ�ȡ��Ӧ·���µ�ͼƬ�ļ���
			c.setIcon(icon);   //���ͼƬ����setIcon��������
			
			setResizable(true);    //���ô�������졣
			System.out.println("x ��"+getX()+"   y ��"+getY());   //��������x��y���ꡣ
	}

	public static void main(String[] args) {
		
		ff k = new ff();   //ʵ�������󲢵��á�
		k.setVisible(true);    //���ô���ɼ���
		



	}

}
