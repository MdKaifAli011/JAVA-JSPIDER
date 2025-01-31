class Program1{
	public static void main(String[] args){
		int x=45, y=50, a=90, b=50;
		System.out.println("This is main method of Program1");
		int sum=add(20, 30);
		System.out.println("Sum from main is: :"+sum);
		System.out.println("main method Ends!!");
	}
	public static int add(int x, int y){
		System.out.println("This is add method");
		int sum=x+y;
		System.out.println("Sum from add method is: "+sum);
	return sum;
	}
}