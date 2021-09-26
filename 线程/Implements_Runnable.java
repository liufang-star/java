package thread_;

                                                //ʵ��Runnable�ӿڣ���

import java.awt.Container;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Implements_Runnable extends JFrame{
	
	/**
	 * @author ����
	 */
	private static final long serialVersionUID = 1L;
	private JLabel j1 = new JLabel();     //����JLabel���󣨱�ǩ����
	private static Thread t;
	private int count = 0;     //������������
	private Container c = getContentPane();    //��������
	
	public Implements_Runnable() {     //���췽�� 
		setTitle("�ƶ��ı���...");
		setBounds(500, 350, 300, 120);     //���Զ�λ�����С��λ��
		c.setLayout(null);     //ʹ���岻ʹ���κβ��ֹ�����
		
		try {
		//��ȡͼƬ��URL����ͼƬ�뱾����ͬһ����
		URL url = Implements_Runnable.class.getResource("[2Q{6F0$FLS12T9]H$JT[LD.jpg");
		Icon icon = new ImageIcon(url);    //ʵ����һ��Icon
		j1.setIcon(icon);     //��ͼ������ڱ�ǩ��
	}catch(NullPointerException ex) {
		System.out.println("ͼƬ�����ڣ��뽫ͼƬ��������ǰĿ¼�£�");
		return;
		}
		//����ͼƬ�ڱ�ǩ������
		j1.setHorizontalAlignment(SwingConstants.LEFT);
		j1.setBounds(count, 10, 300,150);   //���ñ�ǩ��λ�����С
		j1.setOpaque(true); 
		
		t = new Thread(new Runnable() {      //���������ڲ��࣬����ʵ��Runnable�ӿ�

			@Override
			public void run() {      //��дrun()����
				
				while(count <= 300) {    //����ѭ������
					j1.setBounds(count, 10, 300, 50);   //���ñ�ǩ��λ�����С
					try {
						Thread.sleep(500);    //����0.5��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					count += 4;    //ʹ������ÿ������4
					
					if(count == 300) {    //��ͼ�굽���ǩ�����ұ�ʱ��ʹ��ص���ǩ�����
						count = 10;
					}
				}
				
			}	
		});
		
		t.start();    //�����߳�
		c.add(j1);    //ʹ��ǩ��ӵ�������
		setVisible(true);     //ʹ����ɼ�
		
		//���ô���Ĺرշ�ʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new Implements_Runnable();    //ʵ����һ��Implements_Runnable����
	


	}

}
