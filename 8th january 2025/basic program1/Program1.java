class Program1
{
	public static void main(String[] args)
	{
		System.out.println("Java program");
		System.out.println("20+3*8");
		System.out.println(20+3*8);
		System.out.println(20+3*10);
		try{
			System.out.println(20+40/0);
		}
		catch(Exception e){
			System.out.println("Infinity");
		}
		System.out.println(20+3*18);
		System.out.println("Program Ends");
		
	}
}
