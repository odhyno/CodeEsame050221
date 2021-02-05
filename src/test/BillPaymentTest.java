package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import logic.BillPayment;

public class BillPaymentTest {
	
	private int card= 198;
	private int bill =193;
	//private int bill = 198;
	private int tax = 1;
	
	
	@Test
	public void billPaymentTest() {
		
		BillPayment bp = new BillPayment() ;
		
		int output = bp.payment(card, bill);
		System.out.println(output);
		assertEquals(card-bill-tax,output);
	}

}
