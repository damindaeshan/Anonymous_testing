package bcccp.test;

public class AdhocTicket_TestClass {
	
	public static void main(String[] args) {
        testAdhockTicketConstructor();
    }

    public static void testAdhockTicketConstructor() {
        AdhocTicket adhocTicket = new AdhocTicket("Level_1_002", 34456, "LV1_002_34456_14:42_18Sept");
        System.out.println("AdhocTicket constructor is executed");

        if ("Level_1_002".equals(adhocTicket.getCarparkId())) {
            System.out.println("CarparkID test is Passed");
        } else {
            System.out.println("CarparkID test is Failed");
        }
        
        if (34456 == adhocTicket.getTicketNo()) {
            System.out.println("TicketNo test is Passed");
        } else {
            System.out.println("TicketNo test is Failed");
        }
        
        if ("LV1_002_34456_14:42_18Sept".equals(adhocTicket.getBarcode())) {
            System.out.println("Barcode test is Passed");
        } else {
            System.out.println("Barcode test is Failed");
        }
    }
}
