// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		int testMin = Math.min(a, b);
		int minVal = Math.min(testMin, c);
		int testMax = Math.max(a, b);
		int maxVal = Math.max(testMax, c);
		int midVal = (a + b + c) - minVal - maxVal;


		System.out.println(""a);
		System.out.println(b);
		System.out.println(c);
	}
}
