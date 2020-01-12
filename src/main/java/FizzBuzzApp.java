import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FizzBuzz fizzbuzzObject = new FizzBuzz();

		System.out.println("Welcome, let's play FizzBuzz. Enter a number:");
		int num = input.nextInt();

		System.out.println(fizzbuzzObject.getResponse(num));

		input.close();
	}

}
