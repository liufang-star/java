package reflect_;

public class CellPhone_Annotation_07 {
	
	@Phone_Annotation_07(remarks = "Ʒ���ͺ�")
	public String brdMdl;   //Ʒ���ͺ�
	
	@Phone_Annotation_07(remarks = "�۸�")
	public double price;   //�۸�
	
	@Deprecated   //��ʱע�⣬����������
	@Phone_Annotation_07(remarks = "��ؽӿ�",enable = false)    //�����Բ�����
	public String batteryInter;     //��ؽӿ�
	
	@Phone_Annotation_07(remarks = "�ֻ�����")
	public String produced;    //�ֻ�����

}
