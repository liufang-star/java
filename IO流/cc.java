package IO��.txt;

import java.io.File;

public class cc {
	
	                 //����file�ؼ��֣�������ɾ���ļ���

	public static void main(String[] args) {
		
		//File dir = new File("dir");
		
		File dir = new File("dir/dir2/dir3/dir4");
		
		boolean flag = dir.mkdir();//�����ļ���
		
		boolean flag2 = dir.mkdirs();//�����ļ��м��丸�ļ��У������ܶ��ļ��У�
		
		System.out.println("�����ļ����Ƿ�ɹ���"+flag);
		
		System.out.println("��������ļ����Ƿ�ɹ���"+flag2);
		
		
		
		          /*ɾ���ļ�·�����һ���ļ���*/
		//boolean del = dir.delete(); //ɾ���ļ���
		//System.out.println("ɾ���ļ����Ƿ�ɹ���"+del);

	}

}
