package custom;

import custom.Tests.LogicGatesTest;

public class LogicGates {
	public LogicGates() {
		System.out.println("Gates constructed");
	}
	
	public static boolean AND (boolean input_1, boolean input_2) {
		return input_1 && input_2;
	}
	
	public static boolean OR (boolean input_1, boolean input_2) {
		return input_1 || input_2;
	}
	
	public static boolean XOR (boolean input_1, boolean input_2) {
		return input_1 ^ input_2;
	}
	
	public static boolean NOT (boolean input_1) {
		return !input_1;
	}
	
	public static int bool2Int (boolean input_1) {
		if (input_1) return 1;
		return 0;
	}
	
	public static boolean int2Bool (int input_1) {
		return input_1 == 1;
	}
}
