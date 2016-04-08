import java.util.Random;

import javax.swing.JOptionPane;

import com.spun.util.velocity.ParseCall;

public class LotteryNumbers {
	public static void main(String[] args) {
		int numbers = 3;
		int numCorrect = 0;
		String numb1 = JOptionPane.showInputDialog(null, "Give me a number 0-" + numbers);
		String numb2 = JOptionPane.showInputDialog(null, "Give me a number 0-" + numbers);
		String numb3 = JOptionPane.showInputDialog(null, "Give me a number 0-" + numbers);
		String numb4 = JOptionPane.showInputDialog(null, "Give me a number 0-" + numbers);
		String numb5 = JOptionPane.showInputDialog(null, "Give me a number 0-" + numbers);
		int n1 = Integer.parseInt(numb1);
		int n2 = Integer.parseInt(numb2);
		int n3 = Integer.parseInt(numb3);
		int n4 = Integer.parseInt(numb4);
		int n5 = Integer.parseInt(numb5);
		Random random = new Random();
		int a = random.nextInt(numbers);
		int b = random.nextInt(numbers);
		int c = random.nextInt(numbers);
		int d = random.nextInt(numbers);
		int e = random.nextInt(numbers);
		if (n1 == (a)) {
			System.out.println("You have a number correct!");
			numCorrect++;
		}
		if (n2 == (b)) {
			System.out.println("You have a number correct!");
			numCorrect++;
		}
		if (n3 == (c)) {
			System.out.println("You have a number correct!");
			numCorrect++;
		}
		if (n4 == (d)) {
			System.out.println("You have a number correct!");
			numCorrect++;
		}
		if (n5 == (e)) {
			System.out.println("You have a number correct!");
			numCorrect++;
		}
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
		System.out.println(numCorrect);
	}
}