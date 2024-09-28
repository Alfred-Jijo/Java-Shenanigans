package custom;

import java.util.Scanner;

public class Tests {
	public Tests() {
		System.out.println("Running Tests");
		bin2Den_Test();
		logicGatesTest();
		numberSystemTest();
	}
	
	public static void bin2Den_Test() {
		int[] binTest = { 1010, 1011, 1100};
		int[] binAns = {10, 11, 12};
		
		for (int j = 0; j <= (binTest.length - 1); j++) {
			if (NumSys.bin2Dec(j) == binAns[j]) {
				System.out.printf("Bin2Den Test %d: Success\n", j);
			} else {
				System.out.printf("Bin2Den Test %d: Failed\n", j);
			}
		}
	}
	
	public static void logicGatesTest() {
		boolean[] P = { true, true, false, false };
		boolean[] Q = { true, false, true, false };
		System.out.println("For ¬(P^Q): ");
		
		System.out.println("| P | Q | P^Q | ¬(P^Q) |: ");
		System.out.println("------------------------");
		for (int i = 0; i < P.length; i++) {
			System.out.printf(
				"|%2d |%2d |%3d  |%5d   |\n",
				LogicGates.bool2Int(P[i]),
				LogicGates.bool2Int(Q[i]),
				LogicGates.bool2Int(LogicGates.AND(P[i], Q[i])),
				LogicGates.bool2Int(LogicGates.NOT(LogicGates.AND(P[i], Q[i])))
			);
		}
		System.out.println("------------------------");
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
}
