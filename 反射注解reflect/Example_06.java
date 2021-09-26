package reflect_;

public class Example_06 {
	
	static void staticMethod() {     //静态的成员方法
		
		System.out.println("执行staticMethod()方法！");
		
	}
	
	public int publicMethod(int i) {
		
		System.out.println("执行publicMethod()方法！");
		return i * 100;
		
	}
	
	protected int protectedMethod(String s,int i) throws NumberFormatException{
		
		System.out.println("执行protectedMethod()方法！");
		return Integer.valueOf(s)+i;
		
	}
	
	private String privateMethod(String...strings) {
		
		System.out.println("执行privateMethod()方法！");
		StringBuffer stringbuffer = new StringBuffer();
		for(int i = 0;i < strings.length;i++) {
			stringbuffer.append(strings[i]);
		}
		return stringbuffer.toString();
		
	}

}
