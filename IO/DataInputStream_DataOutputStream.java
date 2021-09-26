package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

                //数据输入输出流（DataInputStream和DataOutputStream）！

public class DataInputStream_DataOutputStream {

	public static void main(String[] args) {
		
			File f =new File("src\\liu.txt");    //写入数据时会出现乱码！
			
			FileOutputStream out = null;
			DataOutputStream dos = null;    //数据输出流
			
			try {
				
				out = new FileOutputStream(f);
				dos = new DataOutputStream(out);    //将文件流包装成数据流！
				
				
				/*
				 * 注意：顺序如果不正确，会报错！
				 * 因为是字节码文件
				 *            （所以写入数据类型时，尽量不要写在一起，否则数据结果不一样！）
				 */
				    dos.writeUTF("这是写入字符串！");    //写入字符型数据
					dos.writeDouble(3.14);     //写入浮点型数据
					dos.writeBoolean(true);    //写入布尔型数据
					dos.writeInt(123);     //写入整型数据
					
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
			
			
			DataInputStream di = null;     //数据输入流。
			FileInputStream in = null; 
			
			try {
				
				in = new FileInputStream(f);
				di = new DataInputStream(in);
				
				/*
				 * 注意：顺序与上面的数据输出流的写入数据顺序要保持一样，否则会报错！
				 */
				System.out.println("readUTF()读取数据："+di.readUTF());
				System.out.println("readDouble()读取数据："+di.readDouble());
				System.out.println("readBoolean()读取数据："+di.readBoolean());
				System.out.println("readInt()读取数据："+di.readInt());
				
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
