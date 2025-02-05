class Program5
{
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		demo();
		System.out.println("main method Ends");
	}
	
	public static void demo()
	{
		System.out.println("This is demo method");
		demo();
		System.out.println("demo method Ends!!");
	}
}