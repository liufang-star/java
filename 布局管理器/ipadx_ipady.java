package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                //�����鲼�ֹ�������GridBagLayout����

                                                        //ipadx��ipady���ԡ�

/*
 * ���
 *         ���������������޸��������ѡ��С��
 *         
 * ע�⣺
 *         ����ipadx������������Ŀ�ȣ�����ipady������������ĸ߶ȣ�
 *         ���Ϊ������������ѡλ�õĻ��������ָ���Ŀ�Ⱥ͸߶ȣ�
 *         ���Ϊ������������ѡλ�õĻ����ϼ�Сָ���Ŀ�Ⱥ͸߶ȡ�
 */

public class ipadx_ipady {
	
	JFrame f = new JFrame();   //�������塣
	Container c;   //��������
	
	
	void createFrame() {
		f.setTitle("ipadx_ipady����");
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
	
	void init6() {
		GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
		g1.gridx = 2;   //ʹ��gridx���ԡ�
		g1.gridy = 2;    //ʹ��gridy���ԡ�
		g1.ipadx = 10;    //ʹ��ipadx�ؼ�������ѡλ�õĻ��������10��ȡ�
		g1.ipady = 10;    //ʹ��ipady�ؼ�������ѡλ�õĻ��������10�߶ȡ�
		c.add(new JButton("���"),g1);    //����JButton��ť��ͬʱ���������
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 4;      //����X�������ֵ��
		g2.gridy = 2;       //����Y�������ֵ��
		g2.ipadx = -10;     //ʹ��ipadx�ؼ�������ѡλ�õĻ����ϼ�С10��ȡ�
		g2.ipady = -10;     //ʹ��ipadx�ؼ�������ѡλ�õĻ����ϼ�С10�߶ȡ�
		c.add(new JButton("���"),g2);    //����JButton��ť��ͬʱ���������
	}

	public static void main(String[] args) {
		ipadx_ipady d = new ipadx_ipady();
		d.createFrame();
		d.creatButton();
        d.init6();
		d.f.setVisible(true);

	}

}
