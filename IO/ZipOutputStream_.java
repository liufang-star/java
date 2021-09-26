package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

                               //ѹ���ļ���ZipOutputStream�������������

public class ZipOutputStream_ {
	
	static void compress() {      //����һ����̬��ѹ��������
		
		//����ʵ������
		File source = new File("");     //Դ�ļ���source��    //Դ�ļ�·��
		File target = new File("");     //ѹ������target��    //ѹ����֮���·��
		
		//�����������ѹ����
		try(FileOutputStream fis = new FileOutputStream(target);
				ZipOutputStream zos = new ZipOutputStream(fis)){
			
			if(source.isDirectory()) { 
				
				//��Ϊ���ļ��У�������Ҫ���������ļ�
				for(File f : source.listFiles()) {
					
					addEntry(zos, "", f);
					
				}
				
			}else {
				addEntry(zos, "", source);
			}
			
		}
		catch(Exception e){
           e.printStackTrace();			
		}
		
	}
	
	/**
	 * 
	 * @param zos--ѹ����
	 * @param base--�ļ���ѹ�����е�·��
	 * @param source--��ѹ�����ļ�
	 */
	//������Ŀ���ж��Ƿ�Ϊ�ļ��У�����ǣ����ݹ��������
	static void addEntry(ZipOutputStream zos,String base,File source) {
		
		if(source.isDirectory()) {
		
		for(File file : source.listFiles()) {
			addEntry(zos, base+source.getName() +File.separator, file);
		}
		
		}else {
			byte buf[] = new byte[1024];
			try(FileInputStream fis = new FileInputStream(source)) {
				
				int count = -1;
				
				//��ѹ���������������Ŀ
				zos.putNextEntry(new ZipEntry(base+source.getName()));
				
				while((count = fis.read(buf)) != -1) {
					
					zos.write(buf,0,count);      
					
					zos.flush();     //ˢ�£�
				}
				
				zos.closeEntry();     //�ر���Ŀ��
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		
		compress();

	}

}
