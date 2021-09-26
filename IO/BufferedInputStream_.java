package IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

                         //�����ֽ�����������BufferedInputStream����

public class BufferedInputStream_ {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\86187\\Desktop\\������Linux˽����-����ƪ�����İ�.pdf");
		
		BufferedInputStream bi = null;   //�������������Ч�ʣ�
		
		FileInputStream in = null;
		
		long start = System.currentTimeMillis();    //��ȡ����ʼʱ����ֵ
		
		try {
			
			in = new FileInputStream(f);
			
			bi = new BufferedInputStream(in);   //���ļ��ֽ�����װ�ɻ����ֽ���
			
			byte b[] = new byte[1024];    //�������ֽ����飨�����������Buffered��ͬ����
			while(bi.read(b) != -1) {    //ʹ�û�������ȡ����
				
			}
			
			long end = System.currentTimeMillis();    //��ȡ������ʱ����ֵ
			System.out.println("���о����ĺ�������"+(end - start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bi != null) {
				try {
					bi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
