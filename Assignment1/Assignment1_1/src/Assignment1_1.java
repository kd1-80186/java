import java.util.Scanner;

public class Assignment1_1 {

	public static void main(String[] args) 
	{	
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		System.out.println("Given number : "+num);
		System.out.println("Binary equivalent : "+Integer.toBinaryString(num));
		System.out.println("Octal equivalent : "+Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent : "+Integer.toHexString(num));
		

		
	}

}
