import java.util.Random;
class Program6{
	public static void main(String[] args){
		Random r1=new Random();
		int num1=r1.nextInt();
		int num2=r1.nextInt(100);
		System.out.println("random number1 is: "+num1);
		System.out.println("random number2 is: "+num2);
	}
}