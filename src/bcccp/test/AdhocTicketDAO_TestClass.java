package bcccp.test;


public class AdhocTicketDAO_TestClass  {
//Override the IAdhocTicketFactory
        IAdhocTicketFactory adhocTicketFactory = new IAdhocTicketFactory() {
            @Override
            public IAdhocTicket make(String carparkId, int ticketNo) {
                String barcode = "A" + Integer.toHexString(ticketNo);
		return new AdhocTicket(carparkId, ticketNo, barcode);
            }
        };
}
