// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		//rona
		// so start with converting o int and calc the amount to pay
		//then just print the names and args


		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		String totalBill = args[3];
		Integer payEach = Integer.valueOf(totalBill);
		System.out.println( name1 +","+name2+","+name3+"pay"+payEach/3);
	}
}


