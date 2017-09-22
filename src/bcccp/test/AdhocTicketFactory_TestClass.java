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

//Get barcode
        String t_barcode = iAdhocTicket.getBarcode();

//Check carpark id
/*
Integration Test 1 : AdhocTicketFactory

Test Carpark ID

Input 1: Level1_Car002
Expected Result : CarparkID test is Passed
Actual Result : CarparkID test is Passed

Input 2: Level1_Car003
Expected Result : CarparkID test is Failed
Actual Result : CarparkID test is Failed
*/
        if(t_carpark.equals("Level1_Car003")){
            System.out.println("CarparkID test is Passed");
        }else{
            System.out.println("CarparkID test is Failed");
        }

//Check ticket no
        if(t_ticket_n==1002234){
            System.out.println("Ticket no test is Passed");
        }else{
            System.out.println("Ticket no test is Failed");
        }

 //Check barcode
        if(t_barcode.equals("Af4afa")){
            System.out.println("Barcode test is Passed");
        }else{
            System.out.println("Barcode test is Failed");
        }
}
}
