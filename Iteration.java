package project1;

public class Iteration {
	public static void main(String[] args) {
		
	}
	public static void numbers(int number) {
		int total = 0;
		while(number>0) 
		{
			total = total + number%10;
			number = number/10;
		}
		System.out.println("Sum of digits:" + total);
	}

}
			
	


