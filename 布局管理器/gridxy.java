package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                  //�����鲼�ֹ�������GridBagLayout����

                                                          //gridx��gridy���ԡ�

/*
 * ���
 *         �����������������������ʼ�����ڵ�Ԫ�������ֵ��
 *         
 * ע�⣺
 *          ����gridx���õ���X�ᣨ������ˮƽ���򣩵�����ֵ����������ʾ���������ʼ�������е�������
 *          ����gridy���õ���Y�ᣨ������ֱ���򣩵�����ֵ����������ʾ���������ʼ�������е�������
 */


public class gridxy {
	JFrame f = new JFrame();   //�������塣
	Container c;   //��������
	
	
	void createFrame() {
		f.setTitle("gridx_y����");
		c = f.getContentPane();    //����������
		c.setLayout(new GridBagLayout());     //���������鲼�֡�
		f.setSize(800, 600);   //���ô����͸ߡ�width��height��
		
		//һ��Ҫ��д���뷽ʽ��д�رմ��ڷ�ʽ����
		//f.setLocationRelativeTo(null);   //ʹ�þ��ж��루null��ʾĬ�Ͼ��У���
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //���ô���رշ�ʽ��
		f.setLocationRelativeTo(null);   //ʹ�þ��ж��루null��ʾĬ�Ͼ��У���
		
	}
	
	void init() {
		
		GridBagConstraints g1 = new GridBagConstraints();         //����Լ��������
		g1.gridx = 0;   //ʹ��gridx���ԡ�
		g1.gridy = 0;    //ʹ��gridy���ԡ�
		c.add(new JButton("���1"),g1);    //����JButton��ť��ͬʱ���������
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 1;
		g2.gridy = 1;
		c.add(new JButton("���2"),g2); 
		
		GridBagConstraints g3 = new GridBagConstraints();  
		g3.gridx = 2;
		g3.gridy = 2;
		c.add(new JButton("���3"),g3); 
	}
	
	

	public static void main(String[] args) {
		gridxy d = new gridxy();   //��������
		d.createFrame();   //����createFrame()������
		d.init();   //����init()������
		d.f.setVisible(true);   //���ô���ɼ���

	}

}
