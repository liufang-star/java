package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

                //���������������DataInputStream��DataOutputStream����

public class DataInputStream_DataOutputStream {

	public static void main(String[] args) {
		
			File f =new File("src\\liu.txt");    //д������ʱ��������룡
			
			FileOutputStream out = null;
			DataOutputStream dos = null;    //���������
			
			try {
				
				out = new FileOutputStream(f);
				dos = new DataOutputStream(out);    //���ļ�����װ����������
				
				
				/*
				 * ע�⣺˳���������ȷ���ᱨ��
				 * ��Ϊ���ֽ����ļ�
				 *            ������д����������ʱ��������Ҫд��һ�𣬷������ݽ����һ������
				 */
				    dos.writeUTF("����д���ַ�����");    //д���ַ�������
					dos.writeDouble(3.14);     //д�븡��������
					dos.writeBoolean(true);    //д�벼��������
					dos.writeInt(123);     //д����������
					
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
					e.printStackTrace();
				}finally {
				if(dos != null) {
					try {
						dos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(out != null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			
			DataInputStream di = null;     //������������
			FileInputStream in = null; 
			
			try {
				
				in = new FileInputStream(f);
				di = new DataInputStream(in);
				
				/*
				 * ע�⣺˳��������������������д������˳��Ҫ����һ��������ᱨ��
				 */
				System.out.println("readUTF()��ȡ���ݣ�"+di.readUTF());
				System.out.println("readDouble()��ȡ���ݣ�"+di.readDouble());
				System.out.println("readBoolean()��ȡ���ݣ�"+di.readBoolean());
				System.out.println("readInt()��ȡ���ݣ�"+di.readInt());
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				
			}finally {
				if(di != null) {
					try {
						di.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(in != null) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		

	}

}
