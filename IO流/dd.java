package IO��.txt;

import java.io.File;

public class dd {
	
	               //����file�ؼ��ֻ�ȡC���ļ����ļ��С�

	public static void main(String[] args) {
		
		File f = new File("C:\\Windows\\");  //C��windows�ļ���
		
		File files[] = f.listFiles();  //�����ļ��������е����ļ������ļ���
		
		for(File tmp:files) {
			
			if(tmp.isFile()) {//�ж��Ƿ�Ϊ�ļ�
				
				System.out.println("�ļ���"+tmp.getName());
				
			}else if(tmp.isDirectory()) {
				
				System.out.println("�ļ��У�"+tmp.getName());
				
			}
		}

	}

}
