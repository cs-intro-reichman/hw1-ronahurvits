// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int years = Integer.parseInt(args[2]);
		double rate = Double.parseDouble(args[1])/100;
		int currVal = Integer.parseInt(args[0]);
		double futureVal = (currVal*(Math.pow((1+rate),years)));
		System.out.println("After "+years+ " years, a $"+currVal+" saved at "+rate*100+"%25 will yield $"+((int) futureVal));
	} 
}