package IO��.txt;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bb {
	
	                         //ͨ��file�ؼ��ֻ�ȡ�ı���Ϣ��

	public static void main(String[] args) {
		
		File f1 = new File("C:\\Intel\\word.txt"); //��һ�ֹ��췽��
		
		System.out.println("�ļ��Ƿ���ڣ�"+f1.exists()); //�ж��ļ��Ƿ����
		
		System.out.println("�ļ�����"+f1.getName()); //����ļ���
		
		System.out.println("�ļ��ľ���·����"+f1.getAbsolutePath()); //����ļ��ľ���·��
		
		System.out.println("�Ƿ�Ϊ�����ļ���"+f1.isHidden()); //�Ƿ�Ϊ�����ļ�
		
		System.out.println("�ļ����ֽ�����"+f1.length()); //����ļ���С����λ���ֽ�
		
		Date date = new Date(f1.lastModified()); //ͨ������ֵ����������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("�ļ������޸�ʱ�䣺"+sdf.format(date)); //�ļ�����޸ĵ�ʱ��
		
		//boolean del = f1.delete();//ɾ���ļ�
		//System.out.println("ɾ���ļ��Ƿ�ɹ���"+del);
		
		try {
			//�Ѵ��ڵ��ļ����������´��������ܸ������е��ļ���
			boolean create = f1.createNewFile(); //�����µĿ��ļ�
			System.out.println("�����ļ��Ƿ�ɹ���"+create);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("��׽�����쳣��");
		}
		

	}

}
