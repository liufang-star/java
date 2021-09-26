package GridBagLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

                                                    //�����鲼�ֹ�������GridBagLayout����

                                                                //anchor���ԡ�

/*
 * ���
 *         ����anchor���������������������ʾ�������ʾλ�á�
 *         
 * ע�⣺
 *        ͨ���Ͻ���ʾ����ӷ����ϻ���Ϊ9����λ���ֱ�Ϊ��
 *        ������NORTH����������NORTHEAST����������EAST�������ϣ�SOUTHEAST��
 *        �Ϸ���SOUTH�������ϣ�SOUTHWEST����������WEST����������NORTHWEST��
 *        �����ģ�CENTER��
 */

public class anchor {
	
	JFrame f = new JFrame();   //�������塣
	Container c;   //��������
	
	
	void createFrame() {
		f.setTitle("anchor����");
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
	
	void init4() {
		GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
		g1.gridx = 1;   //ʹ��gridx���ԡ�
		g1.gridy = 1;    //ʹ��gridy���ԡ�
		g1.gridwidth = 2;
		g1.gridheight = 2;
		
		g1.anchor = GridBagConstraints.SOUTH;    //ʹ��anchor����������ʾ�������ʾλ�á�
		
		c.add(new JButton("@@"),g1);    //����JButton��ť��ͬʱ�������
		
		
		//��Ҫʹ��JPanel�࣡����壡��
		g1.fill = GridBagConstraints.BOTH;
		g1.anchor = GridBagConstraints.CENTER;
		JPanel p =new JPanel();
		p.setBackground(Color.green);
		c.add(p,g1);
		
	}
	
	public static void main(String[] args) {
		anchor d = new anchor();
		d.createFrame();
		d.creatButton();
        d.init4();
		d.f.setVisible(true);


	}

}
