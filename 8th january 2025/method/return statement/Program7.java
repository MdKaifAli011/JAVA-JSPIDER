class Program7{
	public static void main(String[] args){
		System.out.println("This is main method");
		test();
	}
	public static void test(){
		int x=55;
		if(x>100){
			System.out.println("Inside if block statement");
		return;
		}
	System.out.println("Outside if block statement");
	}
}