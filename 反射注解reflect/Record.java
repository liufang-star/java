package reflect_;

public class Record {
	
   @Field_Method_Parameter_Annotation(describe = "���",type = int.class)
	int id;
	String name;
	
	//����Ĭ��ֵע�͹��췽��
	public Record() {
		
	}
	@Constructor_Annotation("������ʼ�����췽��")
	
	public Record(@Field_Method_Parameter_Annotation(describe = "���", //ע�͹��췽��
			type = int.class) int id,
			@Field_Method_Parameter_Annotation(describe = "����",
			type = String.class)String name)
	{
		
		this.id = id;
		this.name = name;
	}
	
	@Field_Method_Parameter_Annotation(describe = "��ñ��",type = int.class)
	public int getId() {
		return id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "���ñ��")
	public void setId(@Field_Method_Parameter_Annotation(describe = "���",
	type = int.class) int id) {      //��Աtype����Ĭ��ֵע�ͷ���
		//ע�ͷ����Ĳ���
		this.id = id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "�������",type = String.class)
	public String getName() {
		return name;
	}
	
	@Field_Method_Parameter_Annotation(describe = "��������")
	public void setName(@Field_Method_Parameter_Annotation(describe = "����",
			type = String.class)String name) {
		this.name = name;
	}
	
		
	
}
