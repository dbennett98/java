package project1;

public class Results {
	static int physics = 100;
	static int chemistry = 90;
	static int biology = 150;
	
	public static void main(String[] args) {
		results (physics, chemistry, biology);
		percentage (physics, chemistry, biology);
	}
	public static void results(int physics,int chemistry, int biology) {
		System.out.println(physics);
		System.out.println(chemistry);
		System.out.println(biology);
		int total = physics + chemistry + biology;
		System.out.println(total);
	}
	public static void percentage(int physics, int chemistry, int biology) {
		int percentage = ((physics + chemistry + biology)*100)/450;
		System.out.println(percentage);
}
}