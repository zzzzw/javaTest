package exception;

public class exception {
	public static void main(String args[])
	{
		
			/***
			 * ���ܶ����� exception �еķǾ�̬���� a��int�����о�̬����,��Ҫ���õ�ʱ���
			 * ��̬�������ǲ��ܹ��ھ�̬�ķ��������õģ���Ҫ���õĻ��������ö���������
			 */
			//a(1);
			//new exception().a(1);//δ������쳣���� Exception
			//new exception().a(1);//���Լ����׳������������ӾͲ���try catch��
		try {
			new exception().a(1);
		} catch (Exception e) {
			System.out.println("try\tcatch�������쳣");
		}
			
			
		
	}
	//����д���ᱨ��
/*	public void a(int i) {
		if(i==1){
			throw  new Exception();//δ������쳣���� Exception
		}
	}*/
	//����д��û�����ǰ��쳣�Լ������ˡ��൱��û����
/*	public void a(int i) {//�׳��쳣ͬʱ�Լ�����
		if(i==1){
			try {
				throw  new Exception();
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}//δ������쳣���� Exception
		}
	}*/
	public void a(int i) throws Exception {//�����׳��쳣
		if(i==1){
			throw  new Exception();//�׳��쳣
		}
	}

}
