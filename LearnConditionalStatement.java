package week1.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		int age = -1; //local variable
		
		if (age < 18) {
			System.out.println("Minor");
		}
		 
		else if (age >= 18 && age <=60) {
			System.out.println("Adult");
		}

		else {
			System.out.println("Senior");
		}
	}

}
