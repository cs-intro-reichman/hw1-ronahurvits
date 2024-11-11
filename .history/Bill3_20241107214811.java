// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		String totalBill = args[3];
		Integer payEach = Integer.valueOf(totalBill);
		System.out.println("Dear " + name1 +" ,"+name2+" and "+name3+": pay"+payEach/3+"Shekels each");
	}
}
