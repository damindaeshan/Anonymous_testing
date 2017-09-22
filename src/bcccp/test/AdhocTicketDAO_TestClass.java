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
        String carparkId = "Level1_Car006";

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

Input 3: Level1_Car004
Expected Result : CarparkID test is Failed
Actual Result : CarparkID test is Failed

Input 4: Level1_Car006
Expected Result : CarparkID test is Passed
Actual Result : CarparkID test is Passed



*/
        if(iAdhocTicket.getCarparkId().equals("Level1_Car006")){
            System.out.println("CarparkID test is Passed");
        }else{
            System.out.println("CarparkID test is Failed");
        }

//Find ticket from the barcode ID
        iAdhocTicket = adhocTicketDAO.findTicketByBarcode(iAdhocTicket.getBarcode());

//Check barcode
/*
Test Barcode

Input 1: A1
Expected Result : Barcode test is Passed
Actual Result : Barcode test is Passed

Input 2: A2
Expected Result : Barcode test is Failed
Actual Result : Barcode test is Failed

Input 3: A3
Expected Result : Barcode test is Failed
Actual Result : Barcode test is Failed

Input 4: A3
Expected Result : Barcode test is Failed
Actual Result : Barcode test is Failed





*/
        if(iAdhocTicket.getBarcode().equals("A3")){
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
