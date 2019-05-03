package com.java_0503;

public class 구구단 {

	public String lv1() {
		String result = "Level: 1\n";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				result += i+" * "+j+" = "+i*j +"\t";
			}
			result += "\n";
		}
		result += "\n";
		return result;
	}
	
	public String lv2() {
		String result = "Level: 2\n";
		for (int i = 1; i <= 7; i+=3) { // 1 2 3; 4 5 6; 7 8 9
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k <= 2; k++) {
					int x = i + k;
					result += x+" * "+j+" = "+x*j+"\t";
				}
				result += "\n";
			}
			result += "\n";
		}
		return result;
	}
	
	public String lv3() {
		String result = "Level: 3\n";
		for (int i = 1; i <= 3; i++) { //1 4 7; 2 5 8; 3 6 9 //
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k <= 6; k+=3) {
					int x = i + k;
					result += x+" * "+j+" = "+x*j+"\t";
				}
				result += "\n";
			}
			result += "\n";
		}
		return result;
	}
	
}
