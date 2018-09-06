package CustomException;

public class TestUserDefEx {

	static void validate(int age) throws InValidAgeException
	{
		if(age<18)
			throw new InValidAgeException("not valid");
		else
			System.out.println("Welcome to vote");
		}
	
	
	
	public static void main(String[] args) {
	
			// TODO Auto-generated method stub

		try {
			validate(19);
		} catch (InValidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("it will print");
		
		
	}

}
