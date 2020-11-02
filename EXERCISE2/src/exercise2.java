import java.util.Scanner;
public class exercise2 {
	
	public static void main(String[] Strings) {
		
		printExercise6();
		printExercise7();
		printExercise11();
		printExercise15();
		printExercise17();
		printExercise19();
		printExercise20();
		printExercise21();
		printExercise22();
		printExercise23();

	}
	
public static void printExercise6() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = in.nextInt();
		
		System.out.print("Input second number: ");
		int num2 = in.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
		System.out.println();
		
	}
	
	public static void printExercise7() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int num1 = in.nextInt();
		
		for (int i=0; i< 10; i++){
			System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
			System.out.println();
			
		}
	}
	
	private static final double radius = 7.5;
	
	public static void printExercise11() {
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
		System.out.println();
		
	}
	
	
	public static void printExercise15() {
		
		int a, b, temp;
		a = 15;
		b = 27;
		
		System.out.println("Before swapping : a, b = "+a+", "+ + b);
		 
		temp = a;
		a = b;
		b = temp;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping : a, b = "+a+", "+ + b);
		System.out.println();
		
	}
	
	public static void printExercise17() {
		
		long binary1, binary2;
		
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first binary number: ");
		binary1 = in.nextLong();
		
		System.out.print("Input second binary number: ");
		binary2 = in.nextLong();
		
		while (binary1 != 0 || binary2 != 0) 
		
		{
			
		sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
			
		binary1 = binary1 /10;
		binary2 = binary2 /10;
			
		}
		
		if (remainder != 0) {
		sum [i++] = remainder;
			
		}
		
		--i;
		System.out.print("Sum of two binary numbers: ");
		
		while(i >= 0) {
			
		System.out.print(sum[i--]);
			
		}
		
		System.out.print("\n");
		System.out.println();
		
	}
	
	public static void printExercise19() {
		
		int dec_num, quot, i=1, j;
		int bin_num[] = new int[100];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a Decimal Number: ");
		dec_num = scan.nextInt();
		
		quot = dec_num;
		
		while(quot != 0)
		{
			
			bin_num[i++] = quot%2;
			quot = quot/2;
		}
		
		System.out.print("Binary number is: ");
		for(j=i-1; j>0; j--)
		{
			
		System.out.print(bin_num[j]);
		}
		
		System.out.print("\n");
		System.out.println();
	}
	
	public static void printExercise20() {
		
		int dec_num, rem;
		String hexdec_num="";
		
		/* hexadecimal number digits */
		
		char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a decimal number: ");
		dec_num = in.nextInt();
		
		while(dec_num>0)
		{
			rem = dec_num%16;
			hexdec_num = hex[rem] + hexdec_num;
			dec_num = dec_num/16;
		}
		
		System.out.print("Hexadecimal number is: "+hexdec_num+"\n");
		System.out.println();
		
	}
	
	public static void printExercise21() {
		
		int dec_num, rem, quot, i=1, j;
		int oct_num[] = new int[100];
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a Decimal Number: ");
		dec_num = in.nextInt();
		
		quot = dec_num;
		
		while(quot != 0)
		{
			oct_num[i++] = quot%8;
			quot = quot/8;
		}
		
		System.out.print("Octal number is: ");
		for(j=i-1; j>0; j--)
		{
			System.out.print(oct_num[j]);
		}
		System.out.print("\n");
		System.out.println();
		
	}
	
	public static void printExercise22() {
		
		Scanner in = new Scanner(System.in);
		long binaryNumber, decimalNumber = 0, j = 1, remainder;
		System.out.print("Input a binary number: ");
		binaryNumber = in.nextLong();
		
		while (binaryNumber != 0)
		{
		remainder = binaryNumber % 10;
		decimalNumber = decimalNumber + remainder * j;
		j = j * 2;
		binaryNumber = binaryNumber / 10;
		}
		System.out.println("Decimal Number: " + decimalNumber);
		System.out.println();
	}
	
	public static void printExercise23() {
		
		int[] hex = new int[1000];
		int i = 1, j = 0, rem, dec = 0, bin;
		Scanner in = new Scanner(System.in);
		System.out.print("Input a Binary Number: ");
		bin = in.nextInt();
		while (bin > 0) {
			rem = bin % 2;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		i = 0;
		while (dec != 0) {
		hex[i] = dec % 16;
		dec = dec / 16;
		i++;
		}
		System.out.print("HexaDecimal value: ");
		for (j = i - 1; j >= 0; j--)
		{
		if (hex[j] > 9)
		{
		System.out.print((char)(hex[j] + 55)+"\n");
		} else
		{
		System.out.print(hex[j]+"\n");
		System.out.println();
		}
		}
	}
		
		
}
