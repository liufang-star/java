package IO流.txt;

                          //数据输出输入流！！！

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ll {
	public static void main(String[] args) {
		
//数据输出流！！！
		
		File f = new File("word4.txt");
		FileOutputStream out = null;
		DataOutputStream dos = null;
		try {
			out = new FileOutputStream(f);
			dos = new DataOutputStream(out);  //将文件包装成数据流
			dos.writeUTF("这是写入字符串！");   //写入字符串数据
			dos.writeDouble(3.14);  //写入浮点型数据
			dos.writeBoolean(true);  //写入布尔类型数据
			dos.writeInt(123);  //写入整型数据
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
		
//数据输入流！！！
		
		DataInputStream di = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream(f);
			di = new DataInputStream(in);
			System.out.println("readUTF读取数据："+di.readUTF()); //读文件中的String类型数据
			System.out.println("readDouble读取数据："+di.readDouble());//读取文件中的Double类型数据
			System.out.println("readBoolean读取数据："+di.readBoolean()); //读取文件中的Boolean类型数据
			System.out.println("readInt读取数据："+di.readInt());  //读取文件中的int类型数据
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
