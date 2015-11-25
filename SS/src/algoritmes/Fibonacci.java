package algoritmes;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(fibonacciRecursie (i) + " ");
			
		}
	}		
	public static int fibonacciRecursie(int i) {
		if(i == 1 || i == 2) {
			return 1;
		}
		return fibonacciRecursie(i-1) + fibonacciRecursie(i-2);
		
	}
}
