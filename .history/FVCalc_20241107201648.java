// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int years = Integer.parseInt(args[2]);
		double rate = Double.parseDouble(args[1]);
		int currVal = Integer.parseInt(args[0]);
		double futureVal = Math.pow((1+rate),years);

		System.out.println("After "+years+ " years, $"++saved at 10.0% will yield $121);


		// interest

	}
}