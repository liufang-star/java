package IO��.txt;

import java.io.File;

                    //file�÷������췽����

public class aa {

	public static void main(String[] args) {
		/*��Ŀ�µ�·����Ĭ��·������word.txt
		 * ���е��ļ�·����src/zixuewang/word.txt
		 * ע�⣺/ ��ʾ�ļ���
		 *     \\ ��ʾ�ļ��� ��ת���ַ���
		 *     ����·����C:\\Intel\\word.txt
		 */
		File f1 = new File("C:\\Intel\\word.txt");//��һ�ֹ��췽��
		
		File f2 = new File("C:\\Intel\\","word.txt");//��һ�ֹ��췽��
		
		File dir = new File("C:\\Intel\\");//�ļ���
		File f3 = new File(dir,"word.txt");//�����ֹ��췽��
		
        System.out.println(f1.getAbsolutePath());//����ļ��ľ���·��
        System.out.println(f2.getAbsolutePath());//����ļ��ľ���·��
        System.out.println(f3.getAbsolutePath());//����ļ��ľ���·��
        
        System.out.println(f1 == f2); //�ж��ļ��Ƿ����
        System.out.println(f1.equals(f2));//�ж�ָ����Ƿ���ͬһ���ļ�
        
	}

}
