package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                  //�����鲼�ֹ�������GridBagLayout����

                                                                //fill���ԣ�

/*
 * ���
 *          ����fill���������������䷽ʽ��
 *          
 * ע�⣺
 *          ����Ԫ����ʾ��������������������
 *          ����һ�����ռ�ö����Ԫ��ʱ����ʾ������ܲ���ռ��������ʾ����
 *          ����������¿���ͨ��fill���������������䷽ʽ��
 */

public class fill {
	JFrame f = new JFrame();   //�������塣
	Container c;   //��������
	
	
	void createFrame() {
		f.setTitle("fill����");
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
	
	
	void init3() {
		GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
		g1.gridx = 1;   //ʹ��gridx���ԡ�
		g1.gridy = 1;    //ʹ��gridy���ԡ�
		g1.gridwidth = 2;
		g1.gridheight = 2;
		g1.fill = GridBagConstraints.NONE;    //ʹ��  fill  ����Ĭ�Ͼ�����ʾ��
		c.add(new JButton("none"),g1);    //����JButton��ť��ͬʱ���������
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 3;      //����X�������ֵ��
		g2.gridy = 1;       //����Y�������ֵ��
		g2.gridwidth = 2;     //���������ռ����������
		g2.gridheight = 2;    //���������ռ����������
		
		g2.fill = GridBagConstraints.HORIZONTAL;    //ʹ�� fill ����ˮƽ��䡣
		c.add(new JButton("HORIZONTAL"),g2); 
		GridBagConstraints g3 = new GridBagConstraints();  
		g3.gridx = 5;
		g3.gridy = 1;
		g3.gridwidth = 2;
		g3.gridheight = 2;
		g3.fill = GridBagConstraints.VERTICAL;   //ʹ�� fill ���ô�ֱ��䡣
		c.add(new JButton("VERTICAL"),g3); 
		
		GridBagConstraints g4 = new GridBagConstraints();  
		g4.gridx = 7;
		g4.gridy = 1;
		g4.gridwidth = 2;
		g4.gridheight = 2;
		g4.fill = GridBagConstraints.BOTH;   //ʹ�� fill ���ô�ֱ��䡣
		c.add(new JButton("BOTH"),g4); 
	}

	public static void main(String[] args) {
		fill d = new fill();
		d.createFrame();
		d.creatButton();
        d.init3();
		d.f.setVisible(true);

	}

}
