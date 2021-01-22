package 接口继承多态.txt;

                                           //instanceof关键字！

/*
 * （1）注意：instanceof关键字只能判断存在继承关系的对象或接口。
 *                （解决方法：添加父类！！）
 *                
 *（2）instanceof方法用来判断某一个对象是否继承自某一个类：
 *            语法：boolean result = child instanceof parents（返回一个boolean类型值！）
 *            
 *（3）       子类对象  instanceof  父类名称！     例如：（lencopad instanceof Pad）！
 *            
 *  
 */

public class ff {      //父类（ff）：电脑！
public static void main(String[] args) {
		Pad ipd = new Pad();
		LenvoPad lenvopad = new LenvoPad();
		System.out.println("平板电脑（Pad）是否继承（子类）自电脑（ff）？："+(ipd instanceof ff));
		System.out.println("联想电脑（LenvoPad）是否继承自平板电脑（Pad）？："+(lenvopad instanceof Pad));
		System.out.println("联想电脑（LenvoPad）是否继承自电脑（ff）？："+(lenvopad instanceof ff));
		System.out.println("平板电脑（Pad）是否继承自联想电脑（LenvoPad）"+(ipd instanceof LenvoPad));
		System.out.println("自己继承自自己？："+(ipd instanceof Pad));
		

	}
		
}
	class Pad extends ff{   //子类（Pad）继承父类（ff）：平板电脑！
		
	}
	class LenvoPad extends Pad{    //子类（LenvoPad）继承父类（Pad）：联想平板电脑
		
	}


