// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// System.out.println("blababab");
		// Replace this comment with your code
		int years = Integer.parseInt(args[2]);
		double rate = Double.parseDouble(args[1]);
		int currVal = Integer.parseInt(args[0]);
		double test1 = (1+rate);
		double test2 = Math.pow(test1,years);
		double test3 = currVal*test2;
		double test4 = test3/100;
		double test5=Math.pow(2.0, )

		double futureVal = (currVal*(Math.pow((1+rate),years)));
		// double futureVal = (currVal*(Math.pow((1+rate),years))/100);
		System.out.println("After "+years+ " years, $"+currVal+" saved at "+rate+"% will yield $"+((int) futureVal));
	}
}