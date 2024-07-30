import java.util.Scanner;

public class ReverseANumberAndRemoveZeroFromFront {

	public static int reverseAndRemoveFrontZeroes(int num)
	{
//		String numStr = Integer.toString(number);
//		
//		String revStr = new StringBuilder(numStr).reverse().toString();
//		
//		int revNum = Integer.parseInt(revStr);
//		
//		return revNum;
		
		int rev = 0;
		
		while(num!= 0)
		{
			int digit = num % 10;
			
			rev = rev * 10 + digit;
			num = num/10;
		}
		
		return rev;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:- ");
		int num1 = sc.nextInt();
		
		int reveNum = reverseAndRemoveFrontZeroes(num1);
		
		System.out.println("Number Reversed and With Front Zeroes are removed are:- " + reveNum);
	}
	
	
}
