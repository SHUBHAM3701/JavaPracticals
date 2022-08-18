import java.util.Scanner;

public class ScannerLaptopDemo {

	public static void main(String[] args) {
		double num1, num2, result;
		char number;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("MAIN MENU :");
			System.out.println("1.Addition :");
			System.out.println("2.Subtraction :");
			System.out.println("3.Multiplication :");
			System.out.println("4.EXIT");
			System.out.println("Enter Your number ranges from 1 to 4 :");
			number = sc.next().charAt(0);
			switch (number) {
			case '1':
				System.out.println("enter num1: ");
				num1 = sc.nextDouble();
				System.out.println("enter num2: ");
				num2 = sc.nextDouble();
				result = num1 + num2;
				System.out.println("The result is :" + result);
				break;

			case '2':
				System.out.println("enter num1: ");
				num1 = sc.nextDouble();
				System.out.println("enter num2: ");
				num2 = sc.nextDouble();
				result = num1 - num2;
				System.out.println("The result is :" + result);
				break;

			case '3':
				System.out.println("enter num1: ");
				num1 = sc.nextDouble();
				System.out.println("enter num2: ");
				num2 = sc.nextDouble();
				result = num1 * num2;
				System.out.println("The result is :" + result);
				break;

			case '4':
				System.out.println("enter num1: ");
				num1 = sc.nextDouble();
				System.out.println("enter num2: ");
				num2 = sc.nextDouble();
				System.out.println("QUIT");
				break;
			default:
				System.out.println("Oops..you have entered a wrong choice");
				return;
			}

		} while (number != 4);
		sc.close();
	}

}