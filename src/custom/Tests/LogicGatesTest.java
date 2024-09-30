package custom.Tests;

import custom.LogicGates;

public class LogicGatesTest {
	public static void Run() {
		boolean[] P = { true, true, false, false };
		boolean[] Q = { true, false, true, false };
		
		boolean[] andAns = { true, false, false, false };
		andTest(P, Q, andAns);
		
		boolean[] orAns = { true, true, true, false };
		orTest(P, Q, orAns);
		
		boolean[] xorAns = { false, true, true, false };
		xorTest(P, Q, xorAns);
		
		boolean[] notAns = { false, false, true, true };
		notTest(P, Q, notAns);
	}
	
	public static void andTest(boolean[] P, boolean[] Q, boolean[] andAns) {
		for (int i = 0; i < P.length; i++) {
			if (LogicGates.AND(P[i], Q[i]) == andAns[i]) {
				System.out.printf("LogicGate Test %d for AND: Success\n", i + 1);
			} else {
				System.out.printf("LogicGate Test %d for AND: Failure\n", i + 1);
			}
		}
	}
	
	public static void orTest(boolean[] P, boolean[] Q, boolean[] orAns) {
		for (int i = 0; i < P.length; i++) {
			if (LogicGates.OR(P[i], Q[i]) == orAns[i]) {
				System.out.printf("LogicGate Test %d for OR: Success\n", i + 1);
			} else {
				System.out.printf("LogicGate Test %d for OR: Failure\n", i + 1);
			}
		}
	}
	
	public static void xorTest(boolean[] P, boolean[] Q, boolean[] xorAns) {
		for (int i = 0; i < P.length; i++) {
			if (LogicGates.XOR(P[i], Q[i]) == xorAns[i]) {
				System.out.printf("LogicGate Test %d for XOR: Success\n", i + 1);
			} else {
				System.out.printf("LogicGate Test %d for XOR: Failure\n", i + 1);
			}
		}
	}
	
	public static void notTest(boolean[] P, boolean[] Q, boolean[] notAns) {
		for (int i = 0; i < P.length; i++) {
			if (LogicGates.NOT(P[i]) == notAns[i]) {
				System.out.printf("LogicGate Test %d for NOT: Success\n", i + 1);
			} else {
				System.out.printf("LogicGate Test %d for NOT: Failure\n", i + 1);
			}
		}
	}
	
}
