package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                       //�����鲼�ֹ�������GridBagLayout����

                                                           //gridwidth��gridheight���ԡ�

/*
 * ���
 *           ���������������������ռ���������������������
 *           
 * ע�⣺
 *         ����gridwidthΪ���ռ���������������Ҳ�������Ϊ�Ե�Ԫ��Ϊ��λ����Ŀ�ȡ�
 *         ����gridheightΪ���ռ���������������Ҳ�������Ϊ�Ե�Ԫ��Ϊ��λ����ĸ߶ȡ�
 */

public class gridwidth_height {
	JFrame f = new JFrame();   //�������塣
	Container c;   //��������
	
	
	void createFrame() {
		f.setTitle("gridwidth_gridheight����");
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
	
	void init2() {
		GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
		g1.gridx = 1;   //ʹ��gridx���ԡ�
		g1.gridy = 1;    //ʹ��gridy���ԡ�
		c.add(new JButton("���1"),g1);    //����JButton��ť��ͬʱ���������
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 2;      //����X�������ֵ��
		g2.gridy = 2;       //����Y�������ֵ��
		g2.gridwidth = 2;     //���������ռ����������
		g2.gridheight = 1;    //���������ռ����������
		c.add(new JButton("���2"),g2); 
		
		GridBagConstraints g3 = new GridBagConstraints();  
		g3.gridx = 4;
		g3.gridy = 4;
		g3.gridwidth = 2;
		g3.gridheight = 2;
		c.add(new JButton("���3"),g3); 
	}

	public static void main(String[] args) {
		gridwidth_height d = new gridwidth_height();
		d.createFrame();
		d.creatButton();
		d.init2();
		d.f.setVisible(true);

	}

}
