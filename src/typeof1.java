/*
public class typeof1 {
	String a="1";
	public static void main(String args[])
	{
		typeof1 a=new typeof1();
		a.asd();		
	}
	public void asd()
	{
		try{
			if (a instanceof String) {
				 System.out.println("Y");
			}
			
		}catch(Exception e){
			if(e.getMessage().contains("123")){
				
			}
			else
			{
				e.printStackTrace();
			}
		}	
	}
}
*/

public class typeof1{
	private String a="zzw";
	public void instance(){
		if(a instanceof String)
		{
			System.out.println("hello world!");
		}
	}
	public static void main(String args[]){
		new typeof1().instance();
	}
}