package IO;

import java.io.File;

                                                         //File�ࡣ�ļ��еĲ�����

public class File_02 {

	public static void main(String[] args) {
		
		File dir = new File("src/dir/dir2/dir3/dir4/");
		
		boolean flag = dir.mkdir();     //ֻ�ܴ���һ���ļ���
		boolean flag2 = dir.mkdirs();     //��������ļ���
		
		System.out.println("�ļ��д����Ƿ�ɹ���"+flag);
		System.out.println("����ļ��д����Ƿ�ɹ���"+flag2);
		
		//ɾ���ļ�·�����һ���ļ���
		boolean del = dir.delete();     //ɾ���ļ���
		System.out.println("ɾ���ļ����Ƿ�ɹ���"+del);
		
		

	}

}
