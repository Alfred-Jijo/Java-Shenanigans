package custom;

import java.lang.Math;

public class NumSys {
	public NumSys() {
		System.out.println("NumSys operational\nImported java.lang.Math");
	}
	
	public static int[] decToBinArray(int decimal, int bytes) {
		int[] binaryArray = new int[(bytes * 8)];
		int index = 0;
		
		while (decimal > 0) {
			binaryArray[index++] = decimal % 2;
			decimal /= 2;
		}
		
		return binaryArray;
	}
	

	public static int bin2Dec(int binary) {
		int decimal = 0;
		int n = 0; // casting to different types for testing
		while (binary != 0) {
			decimal =  (int) (decimal + Math.floor(Math.pow(2, n)) * binary % 10); // math.pow returns double being cast to int
			binary = binary / 10; //binary is an int --> might not be evaluating correctly
			n++; // solution -> Change decimal type to double to prevent casting --> Do a check for results with double type
		} // inaccuracies in 0010 and 0011 --> Failures as double because of no implicit type cast
		System.out.println(decimal);
		return decimal;
	}
	
	public int hex2Bin() {
		return 0;
	}
	
	public String bin2Hex() {
		return "";
	}
	
	public String dec2Hex() {
		return "";
	}
	
	public String hex2Dec() {
		return "";
	}

}
