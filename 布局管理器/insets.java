package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

                                            //�����鲼�ֹ�������GridBagLayout����

                                                         //insets���ԡ�

/*
 * ���
 *          ����insets����������������뵥Ԫ���Ե֮�����С���롣
 *          
 * ע�⣺
 *         �����Ե�����ΪInsets��Insets����һ�����췽��Insets(int top,int left,int bottom,int right)��
 *         ����4����ڲ�������Ϊ����Ϸ�����ࡢ�·����Ҳ����С���룬��λΪ���ء�
 */

public class insets {
	
	JFrame f = new JFrame();   //�������塣
	Container c;   //��������
	
	
	void createFrame() {
		f.setTitle("insets����");
		c = f.getContentPane();    //����������
		c.setLayout(new GridBagLayout());     //���������鲼�֡�
		f.setSize(800, 600);   //���ô����͸ߡ�width��height��
		
		//һ��Ҫ��д���뷽ʽ��д�رմ��ڷ�ʽ����
		//f.setLocationRelativeTo(null);   //ʹ�þ��ж��루null��ʾĬ�Ͼ��У���
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //���ô���رշ�ʽ��
		f.setLocationRelativeTo(null);   //ʹ�þ��ж��루null��ʾĬ�Ͼ��У���
		
	}
	
	void creatButton() {
		for(int i = 0;i <9;i++) {
			
			GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
			g1.gridx = i;   //ʹ��gridx���ԡ�X������
			g1.gridy = 0;    //ʹ��gridy���ԡ�Y������
			c.add(new JButton("���"),g1);    //����JButton��ť��ͬʱ���������
			
			GridBagConstraints g2 = new GridBagConstraints(); 
			g2.gridx = 0;
			g2.gridy = i;
			c.add(new JButton("���"),g2); 
		}
	}
	
	void init5() {
		GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
		g1.gridx = 2;   //ʹ��gridx���ԡ�
		g1.gridy = 2;    //ʹ��gridy���ԡ�
		
		g1.insets = new Insets(10, 10, 10, 10);   //ʹ��insets��������������뵥Ԫ��֮�����С���롣
		
		c.add(new JButton("@@"),g1);    //����JButton��ť��ͬʱ�������
	}

	public static void main(String[] args) {
		insets d = new insets();
		d.createFrame();
		d.creatButton();
        d.init5();
		d.f.setVisible(true);


	}

}
