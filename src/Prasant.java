
public class Prasant {

	
	String s="ss";
	
	void meth()
	{
		String ne="";
		String mail="";

		
		
		for(int n=0;n<=5;n++)
		{
			if(n==0)
			{
				System.out.println(s);
			}
			else if(n==1)
			{
				ne=s.concat("l");
				System.out.println(ne);

			}
			else if(n==1)
			{
				ne=s.concat("k");
				System.out.println(ne);


			}
			else if(n==2)
			{
				ne=s.concat("n");
				System.out.println(ne);


			}
			else if(n==3)
			{
				ne=s.concat("m");
				System.out.println(ne);


			}
			else if(n==4)
			{
				ne=s.concat("o");
				System.out.println(ne);


			}
			else 
			{
				ne=s.concat("y");
				System.out.println(ne);


			}
			 mail=ne.concat("@gmail.com");
			 System.out.println(mail);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prasant obj=new Prasant();
		obj.meth();
		
		
	}

}
