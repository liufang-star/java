package ������.txt;

import java.util.ArrayList;
import java.util.List;

                                                            //List����

/*
 * ArrayList��LinkedList������
 *         ArrayList��ʵ���˿ɱ����飬����������Ԫ�أ�����nullֵ��
 *         Linked List���������ṹ�������
 *         
 * ����
 *          ArrayList����Ը�������λ�öԼ��Ͻ��п��ٵ�������ʣ�ȱ�㣺
 *                                                             ��ָ��������λ�ò�������ɾ��������ٶȽ�����
 *          LinkedList������򼯺ϲ����ɾ�����󣬲�������������
 *          
 * �ص㣺��������ͬ�����ϵ�����Ҳ�Ǵ�0��ʼ��
 */

public class List_ {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("����ʱ����׷�");
		list.add("�¼ҹ������ϻ�");
		list.add("������Ů�δ���");
		list.add("��ͯңָ������");
		
		list.remove(1);      //remove()������ɾ���� 
		list.add(1, "�Ҳ�һ��...");         //add()����Ҳ���Բ��롣
		list.set(2,"����Ҹ��ˣ�");    //set()�������޸ġ�
		list.add(null);
		
		for(int i =0;i < list.size();i++) {
			System.out.println("����λ��Ϊ"+i+"��Ԫ��Ϊ��"+list.get(i));     //get()��������ȡ��
		}
		System.out.println("����Ϊ��"+list.size());

	}

}
