class Program3
{
	public static void test()
	{
		System.out.println("This is test method");
		System.out.println("test method Ends!!");
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
		Program3.demo();
		System.out.println("main method Ends");
	}
	
	public static void demo()
	{
		System.out.println("This is demo method");
		test();
		System.out.println("demo method Ends!!");
	}
}