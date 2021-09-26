package IO;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

                                           //File�࣡�����ļ������ֹ��췽���Լ�file��ĳ��÷�����

public class File_01 {

	public static void main(String[] args) {
		
		/*
		 * ��Ŀ�µ�Ĭ��·����kk.txt
		 * ���е��ļ�·����src/����/kk.txt
		 * ע�⣺
		 *         /   ��ʾ�ļ���
		 *        \\   ��ʾ�ļ���
		 *        \     ��ʾת���ַ�
		 * ����·����C:\\Intel\\kk.txt
		 */ 
		File f1 = new File("C:\\Intel\\kk.txt");    //��һ�ֹ��췽��
		
		File f2 = new File("C:\\Intel\\", "kk.txt");    //�ڶ��ֹ��췽��
		
		File dir = new File("C:\\Intel\\");      //�ļ���
		File f3 = new File(dir,"kk.txt");      //�����ֹ��췽��
		
		System.out.println("�ļ��Ƿ���ڣ�"+f1.exists());     //�ж��ļ��Ƿ����
		System.out.println();
		
		System.out.println("f1�ļ��ľ���·����"+f1.getAbsolutePath());    //��ȡ�ļ��ľ���·��
		System.out.println("f2�ļ��ľ���·����"+f2.getAbsolutePath());    //��ȡ�ļ��ľ���·��
		System.out.println("f3�ļ��ľ���·����"+f3.getAbsolutePath());    //��ȡ�ļ��ľ���·��
		
		System.out.println();
		System.out.println("�ļ��Ƿ���ȣ�==����"+(f1 == f2));   //�ж��ļ��Ƿ����
		System.out.println("�ļ��Ƿ���ȣ�equals����"+(f1.equals(f2)));  //�ж�ָ����Ƿ���ͬһ���ļ�
		
		System.out.println();
		System.out.println("�ļ����ƣ�"+f1.getName());    //����ļ�����
		System.out.println("�ļ��ľ���·����"+f1.getAbsolutePath());    //����ļ��ľ���·��
		System.out.println("�ļ��Ƿ�Ϊ�����ļ���"+f1.isHidden());      //�ж��ļ��Ƿ�Ϊ�����ļ�
		System.out.println("�ļ����ֽ�����"+f1.length());    //����ļ���С����λ���ֽ�
		
        Date date = new Date(f1.lastModified());   //ͨ������ֵ����������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		System.out.println("�ļ�����޸ĵ�ʱ�䣺"+sdf.format(date));
		
		System.out.println();
//		boolean del = f1.delete();
//		System.out.println("ɾ���ļ��Ƿ�ɹ���"+del);
		
		try {
			//�Ѵ��ڵ��ļ����������´��������ܸ��������ļ���
			boolean create = f1.createNewFile();     //�����յ��ļ���
			System.out.println("�����ļ��Ƿ�ɹ���"+create);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
