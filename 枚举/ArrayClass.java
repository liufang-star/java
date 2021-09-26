package Enum_;

                             //定义泛型类时声明数组类型！

/*
 * 注意：
 *        不能使用泛型来建立数组的实例！
 *        这种方法就是错误的：
 *                                  public class ArrayClass<T>{
 *                                  private T[] array = new T[10];
 *                                  ...
 *                                  }
 */

public class ArrayClass<T> {    //定义一个泛型类！
	
	public T[] getArray() {       //获得成员数组
		return array;
	}

	public void setArray(T[] array) {        //设置setXXX()方法为成员数组赋值
		this.array = array;
	}

	private T[] array;       //定义泛型数组

	public static void main(String[] args) {
		
		ArrayClass<String> a = new ArrayClass<String>();
		String[] array = {"成员1","成员2","成员3","成员4","成员5"};
		
		a.setArray(array);     //调用setArray()方法！
		
		for(int i = 0;i < a.getArray().length;i++) {
			System.out.println(a.getArray()[i]);    //调用getArray()方法返回数组中的值
		}
		

	}

}
