class Program8{
	static final public synchronized strictfp void main(String[] args){
		System.out.println("This is main method");
		printBig(230, 40);
		System.out.println("===================");
		Program1.main(null);
	}
	public static void printBig(int a, int b){
		if(a>b){
			System.out.println("The Bigger Value is: "+a);
		return;
		}
	System.out.println("The Bigger Value is: "+b);
	}
}