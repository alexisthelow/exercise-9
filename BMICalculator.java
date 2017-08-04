import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double ft, in, lbs, m, kg, bmi;
		
		System.out.print("Your height (feet only): ");
		ft = keyboard.nextDouble();
		
		System.out.print("Your height (inches only): ");
		in = (keyboard.nextDouble() + (ft * 12));
		
		System.out.print("Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		
		m = (in * 0.0254);
		kg = (lbs * 0.4535);
		
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is " + bmi + ", and you are perfect.");		
	}
}