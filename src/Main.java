import custom.Tests.Tests;

import java.util.Scanner;

public class Main {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		for (String arg : args) {
			if ("--test".equals(arg)) {
				Tests.RunTests();
			}
		}
		System.out.println("Hello, World!");
		reader.close();
	}
}