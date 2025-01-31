class Program1{
	public static void main(String[] args){
		int x=45, y=50, a=90, b=50;
		System.out.println("This is main method");
		add(20, 30);
		System.out.println("===========");
		add(x,y);
		System.out.println("===========");
		add(a,b);
		System.out.println("main method Ends!!");
	}
	public static void add(int x, int y){
		System.out.println("This is add method");
		int sum=x+y;
		System.out.println("Sum is: "+sum);
	}
}