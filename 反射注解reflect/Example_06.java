package reflect_;

public class Example_06 {
	
	static void staticMethod() {     //��̬�ĳ�Ա����
		
		System.out.println("ִ��staticMethod()������");
		
	}
	
	public int publicMethod(int i) {
		
		System.out.println("ִ��publicMethod()������");
		return i * 100;
		
	}
	
	protected int protectedMethod(String s,int i) throws NumberFormatException{
		
		System.out.println("ִ��protectedMethod()������");
		return Integer.valueOf(s)+i;
		
	}
	
	private String privateMethod(String...strings) {
		
		System.out.println("ִ��privateMethod()������");
		StringBuffer stringbuffer = new StringBuffer();
		for(int i = 0;i < strings.length;i++) {
			stringbuffer.append(strings[i]);
		}
		return stringbuffer.toString();
		
	}

}
