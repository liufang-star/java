package Enum_;

import java.awt.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

                      //���͵ĸ߼��÷�����Advanced usage -->�߼��÷�����

/*
 * ���͵ĸ߼��÷��������Ʒ��Ϳ������ͺ�ʹ������ͨ�����...
 * 
 * 1�����Ʒ��Ϳ�������
 *         �﷨��class ������<T extends anyClass>
 *         ע�⣺
 *                   ʹ�÷�������֮�󣬷���������ͱ���ʵ�ֻ�̳�anyClass����ӿڻ��ࡣ
 *                   ����anyClass�ǽӿڻ����࣬�ڽ��з�������ʱ������ʹ��extends�ؼ��֣�
 *                   
 * 2��ʹ������ͨ���
 *         �﷨������������<? extends List> a = null;
 *         ���ã�
 *                 ����һ�����������ʱ������������������ʵ�ֻ�̳�ĳ���ӿڻ�������ࡣ
 *                 Ҫ��������һ���������ʹ�á�?��ͨ�������ʾ��
 *                 ͬʱʹ��extends�ؼ������Է��ͼ������ơ�
 *         ע�⣺
 *                  <? extends List>��ʾ����δ֪������Ҫʹ�÷��Ͷ���ʱ�����Ե���ʵ������
 *                  ʹ��ͨ�������������ʵ���������ܶ�������µ���Ϣ��ֻ�ܻ�ȡ��ɾ��
 *         ���䣺�����ʵ����û��ʵ��List�ӿڵķ��Ͷ��󣬱��������ᱨ����
 *                  A<? extends List> = null;
 *                  a = new A<ArrayList>();
 *                  a = new A<LinkedList>();
 *                  
 * 3���̳з�������ʵ�ַ��ͽӿ�
 *        ���壺
 *               ���͵���ͽӿ�Ҳ���Ա��̳���ʵ�֡�
 */

public class Advanced_usage<T extends List> {       //���Ʒ��͵�����

	public static void main(String[] args) {
		
		//����ʵ�����Ѿ�ʵ��List�ӿڵ���
//		Advanced_usage<ArrayList> l1 = new Advanced_usage<>();
//		
//		Advanced_usage<LinkedList> l2 = new Advanced_usage<LinkedList>();
		
		//����Ǵ���ģ���ΪHashMapû��ʵ��List()�ӿڣ�
		//Advanced_usage<HashMap> l3 = new Advanced_usage<HashMap>();
		
		
		
		
		
//		List<String> l1 = new ArrayList<>();
//		l1.add("��Ա1");
//		
//	   List<?> l2 = new ArrayList<Number>();    //ʹ�÷���ͨ�����
//	   List<?> l3 = l1;
//	   
//	   l2.add(123);      //ע�⣺��ʹ�÷���ͨ���ʱ�����������Ӻ��޸ĵĲ�����
//		 l1.set(0,"�޸Ĳ���");
//		 System.out.println("l1��"+l1.get(0));
		
		
		
		
		
/*
 * ע�⣺
 *         ʹ��extends�ؼ��ֺ�ʹ��super�ؼ��ֶ��巺��ͨ���ʱ��
 *         ���磺
 *              List<? extends List> l4 = new ArrayList<ArrayList>();
 *                                       ����                                 ����
 *                                       ����������ȸ���󣡣���
 *              List<? super List> l4 = new ArrayList<Object>();
 *                                  ����                                      ����
 *                                       ����������ȸ���󣡣���  
 */
		
//		List<? extends List> l4 = new ArrayList<List>();    //ָ�����Ͻ�
//		List<? super List> l5 = new ArrayList<Object>();   //ָ�����½�

	}

}
