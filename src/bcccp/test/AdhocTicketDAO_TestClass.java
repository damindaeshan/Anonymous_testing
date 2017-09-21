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

//Create the AdhocTicketDAO object and Parse values to override constructor
        AdhocTicketDAO adhocTicketDAO = new AdhocTicketDAO(adhocTicketFactory);

//Assign Carpark ID
        String carparkId = "Level1_Car002";
}
