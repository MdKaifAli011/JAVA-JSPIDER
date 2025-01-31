class Program3{
	public static void main(String[] args){
		System.out.println("This is main method");
		System.out.println("Sum from main is: :"+add(20, 30));
		System.out.println("main method Ends!!");
	}
	public static int add(int x, int y){
		System.out.println("This is add method");
		int sum=x+y;
		System.out.println("Sum from add method is: "+sum);
	return sum;
	}
}