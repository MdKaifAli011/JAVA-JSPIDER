class Test
{
	static int p;
	static double q;
	static String r;
	int x=99;
	public static void main(String[] args)
	{
		System.out.println("This is Test class");
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);

		Test t1=new Test();
		System.out.println(t1);
		System.out.println(t1.x);
		System.out.println("=================");
		Fruit f1=new Fruit();
		System.out.println(f1);
		System.out.println(f1.a);
		System.out.println(f1.x);
		System.out.println("==================");
		Laptop l1=new Laptop();
		System.out.println(l1);
		System.out.println(l1.x);
		System.out.println(l1.y);
	}
}