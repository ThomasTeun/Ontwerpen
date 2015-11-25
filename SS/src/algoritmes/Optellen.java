package algoritmes;

public class Optellen {
	
	public static void main(String [] args) {
		int n = 0;
		for(int i = 1; i <= 153; i++){
		n = n + i;
		}
	System.out.println(n);
	
	System.out.println(somModuloWhile(153));
	}
	public static int somModuloWhile(int max) {
		int total = 0; 
		int i = 0;
		while (i <= max){
			if(i % 3 == 0 || i % 5 == 0) {
				total = total + i; 
			}
			i = i + 1;
		}
		return total;
	}
}
