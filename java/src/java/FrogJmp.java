package java;

public class FrogJmp {

	public int solution(int X, int Y, int D) {
		int a = Y - X;
		return new Double(Math.ceil(a / (double) D)).intValue();
	}

	public static void main(String[] args) {
		
	}

}
