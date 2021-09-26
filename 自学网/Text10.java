package zixuewang;
import java.util.*;

                  //应用广泛！调用，集合，增删！

public class Text10 {

	public static void main(String[] args) {
	  ArrayList kk = new ArrayList();
	  System.out.println("大小为"+kk.size());
	  Xs n1 = new Xs("悟空",15,90);
	  Xs n2 = new Xs("八戒",13,70);
	  Xs n3 = new Xs("沙僧",14,75);
	  Xs n4 = new Xs("小白龙",20,80);
	  kk.add(n1);
	  kk.add(n2);
	  kk.add(n3);
	  kk.add(n4);
	  System.out.println("大小为"+kk.size());
	  System.out.println();
		  for(int i =0;i<kk.size();i++) {
			  Xs tt = (Xs)kk.get(i);
			  System.out.println("第"+(i+1)+"个学生姓名是："+tt.getXingming());
		  } 
		  System.out.println();
		  kk.remove(1);
		  for(int i =0;i<kk.size();i++) {
			  Xs tt = (Xs)kk.get(i);
			  System.out.println("第"+(i+1)+"个学生姓名是："+tt.getXingming());
		  } 
		  System.out.println();
		  kk.add(3,n2);
		  for(int i =0;i<kk.size();i++) {
			  Xs tt = (Xs)kk.get(i);
			  System.out.println("第"+(i+1)+"个学生姓名是："+tt.getXingming());
		  } 
      }
}
class Xs
{   private String xingming;
    private int xuehao;
    private int chengji;
    
    Xs(String xingming,int xuehao,int chengji)
    {
    	this.xingming = xingming;
    	this.xuehao = xuehao;
    	this.chengji = chengji;
    }
    public String getXingming() {
    	return xingming;
    }
    public int getXuehao() {
    	return xuehao;
    }	
    public int getChengji() {
    	return chengji;
    }
    }
