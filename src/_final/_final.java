package _final;

public class _final extends A{
	public _final(){
		 super(); //���캯�����ñ����ǹ��캯���еĵ�һ����䣬���� ,�˴���仰��ʿ����
		super.name="zzw1"; //ʹ��super.xx �Ϳ��Ե��ø����������
//		super.name1="zzw12";//zz��仰�ᱨ�����ܶ���̬�ֶ� A.name1 ��ֵ
		
    
	}


	public static void main(String[] args){
		
	}
	/**
	 * ��������������õ�final�Ǹ���������ʱ�����ʾ"���ܸ��� A �е���̬����";
	 */
	public void getName(){
		
	}
}
/**
 * 
 * ���������ֶε�ʱ�򣬻���ʾ�����಻���Լ̳�"��̬��"
 *
 */
/*final */class A{
	public static  String name="zzw";//�հ���̬�ֶ� name ������δ��ʼ��
	public static final String name1="zzw";
	
	
	
	
	
	/**
	      * ��Ϊprivate���Σ������в��ܼ̳е��˷�������ˣ������е�getName���������¶���ġ�
	      * �������౾��ķ�������������
	      */
	private final void getName(){
		
	}
	
	/*public final void getName(){
		
	}
	*/
	
}
