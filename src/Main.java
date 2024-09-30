import custom.Tests.Tests;

public class Main {
	public static void main(String[] args) {
		for (String arg : args) {
			if ("--test".equals(arg)) {
				Tests.RunTests();
			}
		}
		System.out.println("Hello, World!");
	}
}