package custom;

import java.lang.Math;

public class NumSys {
	public NumSys() {
		System.out.println("NumSys operational\nImported java.lang.Math");
	}
	
	public static int[] decToBinArray(int decimal, int bits) {
		int[] binaryArray = new int[bits]; // Assuming 32-bit integers
		int index = 0;
		
		while (decimal > 0) {
			binaryArray[index++] = decimal % 2;
			decimal /= 2;
		}
		
		return binaryArray;
	}
	
	
	public static int bin2Dec(int binary) {
		int decimal = 0, n = 0;
		while (binary != 0) {
			decimal = (int) (decimal + Math.pow(2, n) * (binary % 10));
			binary = binary / 10;
			n++;
		}
		return decimal;
	}
	
/* TODO
	public String hex2Bin() {}
	public String bin2Hex() {}
	
	public String dec2Hex() {}
	public String hex2Dec() {}
*/
}
