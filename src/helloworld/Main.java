package helloworld;

public class Main {
	
	public static void printWord(String word) {
		System.out.println(word);
	}

	public static void printMultipleTimes(String word, int occurence) {
		int r = 1;
		while (r <= occurence) {
			r = r + 1;
			System.out.println(word);
		}
	}
	
	public static int multiply(int a, int b) {
	    return a * b;
	}
	
	public static void main(String[] args) {
		System.out.println(multiply(3, 3));
//		printMultipleTimes("Funko", 3);
//		printMultipleTimes("Badminton Racket", 100);
//		printWord("Funko");
//		printWord("Badminton Racket")
//		System.out.println("Hello World");
//		
//		for (int i = 1; i <= 10; i++) {	
//			if (i == 4) {
//				System.out.println("four");
//			}
//			
//			else if (i == 6) {
//				System.out.println("six");
//			}
//			
//			else {
//				System.out.println(i);
//			}
//			
//		}
//		
//		int h = 110;
//		
//		if (h == 100) {
//			System.out.println("Yehey");
//		} 
//		
//		else if (h == 110) {
//			System.out.println("Wazzup");
//		}
//		
//		else {
//			System.out.println("Oh no");
//			
//		}
//		
//		
//		int n = 0;
//		while (n < 10) {
//			n = n + 1;
//			System.out.println(n);
//		}
		
		Car ertiga = new Car();
		
		
	}
	
	
	
	

}
