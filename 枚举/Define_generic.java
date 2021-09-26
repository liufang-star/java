package Enum_;

                                                   //定义泛型！

/*
 * 注意：
 *        设置泛型时，不能设置已经存在的值！
 */
public class Define_generic <T>{     //定义一个泛型类，T表示未知类型！
	
	public T getOver() {
		return over;
	}

	public void setOver(T over) {
		this.over = over;
	}

	T over;

	public static void main(String[] args) {
		
		Define_generic<Boolean> d1 = new Define_generic<Boolean>(); //实例化一个Boolean型的对象
		d1.setOver(true);    //不需要进行类型转换
		boolean b = d1.getOver();
		System.out.println(b);
		
		Define_generic<Integer> d2 = new Define_generic<Integer>();//实例化一个Integer型的对象
		d2.setOver(123456);
		Integer c = d2.getOver();     //不需要进行类型转换
		System.out.println(c);
		

	}

}
