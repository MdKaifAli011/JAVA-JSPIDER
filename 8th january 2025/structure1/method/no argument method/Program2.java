class Program2
{
	public static void test()
	{
		System.out.println("This is test method");
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
		demo();
		test();
		demo();
		System.out.println("======main method Ends=====");

	}
	
	public static void demo()
	{
		System.out.println("This is demo method");
	}

}