package IO;

import java.io.File;

                                          //��ȡC���µ������ļ������ļ���

public class File_03 {

	public static void main(String[] args) {
		
		File f =new File("C:\\Windows\\");     //C��windows�ļ���
		File files[] = f.listFiles();      //�����ļ��������е����ļ������ļ���
		
		for(File tmp : files) {
			
			if(tmp.isFile()) {    //�ж��Ƿ��ļ�
				System.out.println("�ļ���"+tmp.getName());
			}
			
			else if(tmp.isDirectory()) {      //�ж��Ƿ�Ϊ�ļ���
				System.out.println("�ļ��У�"+tmp.getName());
			}
			
		}
		
		

	}

}
