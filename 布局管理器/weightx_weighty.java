package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                               //�����鲼�ֹ�������GridBagLayout����

                                                     //weightx��weighty���ԡ�

/*
 * ���
 *        �������������������������ÿһ�к�ÿһ�жԶ���ռ�ķֲ���ʽ��
 *        
 * ע�⣺
 *         �ڲ���������weigthx��weighty��������Ĭ�����ã�������£�������������㹻��ʱ��
 *         ���ȫ���ۼ��ڴ�������룬��������ܳ����˴�Ƭ�Ķ���ռ䡣
 *         Ϊ�˱�������������֣��Ϳ���ͨ��weightx��weighty���������Խ������á�
 */

public class weightx_weighty {
	
	JFrame f = new JFrame();   //�������塣
	Container c;   //��������
	
	
	void createFrame() {
		f.setTitle("weightx_weighty����");
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
	
	void init7() {
		GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
		g1.gridx = 2;   //ʹ��gridx���ԡ�
		g1.gridy = 2;    //ʹ��gridy���ԡ�
		g1.weightx = 10;    //ʹ��weightx���ԡ�
		g1.weighty = 10;     //ʹ��weighty���ԡ�
		
		c.add(new JButton("@@"),g1);    //����JButton��ť��ͬʱ�������
	}
	public static void main(String[] args) {
		weightx_weighty d = new weightx_weighty();
		d.createFrame();
		d.creatButton();
        d.init7();
		d.f.setVisible(true);


	}

}
