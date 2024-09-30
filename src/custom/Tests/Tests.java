package custom.Tests;

import custom.NumSys;

import java.util.Scanner;

public class Tests {
	public static void bin2Den_Test() {
		int[] binTest = { 1, 10, 11, 1010, 1011, 1100 };
		int[] binAns = { 1, 2, 3, 10, 11, 12 };
		
		for (int j = 0; j <= (binTest.length-1); j++) {
			if (NumSys.bin2Dec(binTest[j]) == binAns[j]) {
				System.out.printf("Bin2Den Test %d: Success\n", j);
			} else {
				System.out.printf("Bin2Den Test %d: Failed\n", j);
			}
		}
	}
	
	
	
	public static void numberSystemTest() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Binary: ");
		int binary = Integer.parseInt(reader.nextLine());
		int decimal = NumSys.bin2Dec(binary);
		
		System.out.println(decimal);
		String binaryS;
		StringBuilder builder = new StringBuilder();
		int[] bin = NumSys.decToBinArray(decimal, Integer.SIZE/Byte.SIZE);
		
		for (int i : bin) {
			builder.append(i);
		}
		
		binaryS = builder.toString();
		System.out.println(binaryS);
	}
	
	public static void RunTests() {
		LogicGatesTest.Run();
	}
}
