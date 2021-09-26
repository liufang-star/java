package Enum_;

import java.util.HashMap;
import java.util.Map;

                                       //����������������Ԫ�أ�

/*
 * ʹ��K��V�����ַ����������еļ�ֵ�����ֵ���Ӧ�ľ���ֵ����key��values����
 */

public class MutiOverClass<K,V> {
	
/*
 * ע�⣺
 *      �ڴ��������෺��ʱ��HashMap���ϱ�����Map���ϵ�һ�����࣡
 */
	public Map<K,V> m = new HashMap<K, V>();
	
	//����put()����������Ӧ�ļ�ֵ��������뼯�϶�����
	public void put(K k,V v) {
		m.put(k, v);
	}
	
	public V get(K k) {      //���ݼ�����ȡ��ֵ
		return m.get(k);
	}

	public static void main(String[] args) {
		
		//ʵ�������������
		MutiOverClass<Integer, String> mu = new MutiOverClass<Integer, String>();
		for(int i = 0;i < 6;i++) {
			mu.put(i, "���Ǽ��ϳ�Ա"+i);    //���ݼ��ϵĳ���ѭ�������������ֵ���뵽������
		}
		for(int i = 1;i < mu.m.size();i++) {
			System.out.println(mu.get(i));     //����get()������ȡ�����е�ֵ
		}


	}

}
