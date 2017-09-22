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

//Assign ticket no
        int ticket_no = 1002234;

//Get assigned valued from make method and assign to IAdhocTicket instance
        IAdhocTicket iAdhocTicket = adhocTicketFactory.make(carparkId, ticket_no);

//Create ticket
        iAdhocTicket = adhocTicketDAO.createTicket(carparkId);

//Check carpark id
/*
Test Carpark ID

Input 1: Level1_Car002
Expected Result : CarparkID test is Passed
Actual Result : CarparkID test is Passed

Input 2: Level1_Car003
Expected Result : CarparkID test is Failed
Actual Result : CarparkID test is Failed



*/
        if(iAdhocTicket.getCarparkId().equals("Level1_Car003")){
            System.out.println("CarparkID test is Passed");
        }else{
            System.out.println("CarparkID test is Failed");
        }

//Find ticket from the barcode ID
        iAdhocTicket = adhocTicketDAO.findTicketByBarcode(iAdhocTicket.getBarcode());

//Check barcode
        if(iAdhocTicket.getBarcode().equals("A1")){
            System.out.println("Barcode test is Passed");
        }else{
            System.out.println("Barcode test is Failed");
        }

//Get all current tickets
        List<IAdhocTicket> list = adhocTicketDAO.getCurrentTickets();
        for (IAdhocTicket iAdhocTicket1 : list) {
            System.out.println(iAdhocTicket.getTicketNo());
        }
}
