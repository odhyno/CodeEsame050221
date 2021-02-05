package logic;

public class BillPayment {
	
	private static int tax= 1;
	private int res;
	
	public int payment(int card, int bill) {
		
			
		res = card-bill-tax;
		
		return res;		
		
	}
	
	

}
