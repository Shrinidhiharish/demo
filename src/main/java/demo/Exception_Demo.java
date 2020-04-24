package demo;

public class Exception_Demo 
{
	public static void main(String[] args) {
		try {
			
		
		System.out.println("Hello World...!!!!");
		int i = 1/0;
		System.out.println("completed");
	}
catch(Exception exp)
{
	System.out.println("iam in try block");
	System.out.println("Message is :" +exp.getMessage());
System.out.println(exp.getCause());
exp.printStackTrace();

}
	
		finally {
			
			System.out.println("Iam in finally block");
		}
		}
}
