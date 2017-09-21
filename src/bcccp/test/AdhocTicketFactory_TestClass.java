package bcccp.test;

public class AdhocTicketFactory_TestClass {
public static void main(String[] args) {
	//Create AdhocTicketFactory object
        AdhocTicketFactory adhocTicketFactory = new AdhocTicketFactory();

//Assign Carpark ID
        String carparkId = "Level1_Car002";

//Assign ticket no
        int ticket_no = 1002234;

//Get assigned valued from make method and assign to IAdhocTicket instance
        IAdhocTicket iAdhocTicket = adhocTicketFactory.make(carparkId, ticket_no);

//Get carpark ID
        String t_carpark = iAdhocTicket.getCarparkId();

//Get ticket no
        int t_ticket_n = iAdhocTicket.getTicketNo();
}
}
