class Program7
{
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		int x=34;
		System.out.println("x is: "+x);
		test();
		System.out.println("main method Ends");
	}  
	
	public static void test()
	{
		System.out.println("This is test method"); 
		System.out.println("x from test method is: "+x);
		System.out.println("test method Ends!!");
	}
}