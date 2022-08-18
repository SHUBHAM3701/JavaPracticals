
import java.util.Scanner;

public class ArrExamples {

	public static void main(String[] args) {
		//defining the size of the Array
		int[] marks1 = new int[5]; 
		int[] marks2 = new int[5];
		int result1 = 0, result2 = 0;
		float avg1 = 0, avg2 = 0;
		Scanner sc = new Scanner(System.in);

		//user input for the marks of Student 1
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the marks of student1 :");
			marks1[i] = sc.nextInt();
		}
		//printing the marks of the Student 1
		for (int a : marks1) {

			System.out.println("the marks of Student 1 are :" + a);

		}
		
		//user input for the marks of the Student 2
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the marks of student2 :");
			marks2[i] = sc.nextInt();
		}
		//printing the marks of the Student 2
		for (int b : marks2) {

			System.out.println("the marks of Student 2 are :" + b);

		}
		//adding all marks and calculating the average of student 1
		for (int i = 0; i < 5; i++) {
			result1 = result1 + marks1[i];
			
			avg1 = (float) result1 / 5;

		}
		//printing the total marks and average of Student 1
		System.out.println("the total marks obtained by student 1 is:" + result1);
		System.out.println("the average marks of Student 1 is :" + avg1);
		
		//adding all marks and calculating the average of student 2
		for (int i = 0; i < 5; i++) {
			result2 = result2 + marks2[i];
			
			avg2 = (float) result2 / 5;

		}
		//printing the total marks and average of Student 2
		System.out.println("the total marks obtained by student 2 is :" + result2);
		System.out.println("the average marks of student 2 is :" + avg2);
        
		
		if (avg2 < avg1) {
			System.out.println("the Student 1 stood first in the examination");
		} else {
			System.out.println("Student 2 stood first in the examination");
		}
		sc.close();

	}

}