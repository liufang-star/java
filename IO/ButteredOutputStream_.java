package IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

                 //�����ֽ����������BufferedOutputStream����

public class ButteredOutputStream_ {

	public static void main(String[] args) {
		
		File f = new File("src\\lf.txt");
		
		FileOutputStream out = null;
		
		BufferedOutputStream bo = null;
		
		try {
			out = new FileOutputStream(f);
			bo = new BufferedOutputStream(out);   //��װ�ļ������
			String str = "�����Ҳű����ã�ǧ��ɢ����������";
			byte b[] = str.getBytes();
			
			bo.write(b);
			
			//ʹ�û����ֽ������ʱ����ʹ��ˢ�²�����
			bo.flush();   //ˢ�£�ǿ�ƽ�����������д���ļ��У���ʹ������û��д����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
