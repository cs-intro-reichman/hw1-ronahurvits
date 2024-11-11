// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		int testMin = Math.min(a, b);
		int minVal = Math.min(testMin, c);
		int testMax = Math.max(a, b);
		int maxVal = Math.max(testMax, c);
		int midVal = (a + b + c) - minVal - maxVal;
		System.out.println(a+" "+b+" "+c);
		System.out.println(minVal+" "+midVal+" "+maxVal);
	}
}