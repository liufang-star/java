package IO��.txt;

                          //�������������������

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ll {
	public static void main(String[] args) {
		
//���������������
		
		File f = new File("word4.txt");
		FileOutputStream out = null;
		DataOutputStream dos = null;
		try {
			out = new FileOutputStream(f);
			dos = new DataOutputStream(out);  //���ļ���װ��������
			dos.writeUTF("����д���ַ�����");   //д���ַ�������
			dos.writeDouble(3.14);  //д�븡��������
			dos.writeBoolean(true);  //д�벼����������
			dos.writeInt(123);  //д����������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
		
//����������������
		
		DataInputStream di = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream(f);
			di = new DataInputStream(in);
			System.out.println("readUTF��ȡ���ݣ�"+di.readUTF()); //���ļ��е�String��������
			System.out.println("readDouble��ȡ���ݣ�"+di.readDouble());//��ȡ�ļ��е�Double��������
			System.out.println("readBoolean��ȡ���ݣ�"+di.readBoolean()); //��ȡ�ļ��е�Boolean��������
			System.out.println("readInt��ȡ���ݣ�"+di.readInt());  //��ȡ�ļ��е�int��������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(di != null) {
				try {
					di.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
			if(di != null) {
				try {
					di.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
}
}
