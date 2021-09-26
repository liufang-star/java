package reflect_;

public class CellPhone_Annotation_07 {
	
	@Phone_Annotation_07(remarks = "品牌型号")
	public String brdMdl;   //品牌型号
	
	@Phone_Annotation_07(remarks = "价格")
	public double price;   //价格
	
	@Deprecated   //过时注解，不启用属性
	@Phone_Annotation_07(remarks = "电池接口",enable = false)    //此属性不启用
	public String batteryInter;     //电池接口
	
	@Phone_Annotation_07(remarks = "手机厂商")
	public String produced;    //手机厂商

}
