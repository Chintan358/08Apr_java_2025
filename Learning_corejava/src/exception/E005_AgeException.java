package exception;

class AgeInvalidException extends Exception
{
	public AgeInvalidException(int age) {
		// TODO Auto-generated constructor stub
		super("You need more : "+age);
	}
}
class Validation
{
	public void checkage(int age) throws AgeInvalidException
	{
		if(age<18)
		{
			throw new AgeInvalidException(18-age);
		}
		else
		{
			System.out.println("Valid");
		}
	}
}

public class E005_AgeException {
	public static void main(String[] args) {
		
		Validation v = new Validation();
		
		try {
			v.checkage(10);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
