package lambda;


public class MyFunctionalInterface {

	public static void main(String args[])
	{
		MyFunctionalInterface i = new MyFunctionalInterface();
		i.print(str->System.out.println(str.length()));
	}
	public void print(Lambda l)
	{
		l.printLen("lambdaString");
	}
	@FunctionalInterface
	interface Lambda{
		void printLen(String str);
	}
}
