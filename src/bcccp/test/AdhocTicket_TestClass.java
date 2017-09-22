package bcccp.test;

public class AdhocTicket_TestClass {

//Define state
    private static STATE state_;
    private static enum STATE {
        ISSUED, CURRENT, PAID, EXITED
    }
	
	public static void main(String[] args) {
        testAdhockTicketConstructor();
    }

    public static void testAdhockTicketConstructor() {
    	/*
    		
    	*/
        AdhocTicket adhocTicket = new AdhocTicket("Level_1_005", 34456, "LV1_002_34456_14:42_18Sept");
        System.out.println("AdhocTicket constructor is executed");


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
			
			Input 4: Level1_Car005
			Expected Result : CarparkID test is Failed
			Actual Result : CarparkID test is Failed
			
		*/
        if ("Level_1_005".equals(adhocTicket.getCarparkId())) {
            System.out.println("CarparkID test is Passed");
        } else {
            System.out.println("CarparkID test is Failed");
        }
        
        /*
			Test Ticket

			Input 1: 34456
			Expected Result : Ticket NO test is Passed
			Actual Result : Ticket NO test is Passed
			
			
			
		*/
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
//Set entry date Time
        long entryDateTime = System.currentTimeMillis();
        adhocTicket.enter(entryDateTime);

//Check entry date time
        if (entryDateTime == adhocTicket.getEntryDateTime()) {
            System.out.println("Entry Date Time is passed");
        } else {
            System.out.println("Entry Date Time is failed");
        }

//Set pay
        long payDateTime = System.currentTimeMillis();
        float charge = 50.25f;
        adhocTicket.pay(payDateTime, charge);

    }

//Check Paid Date time
        if (payDateTime == adhocTicket.getPaidDateTime()) {
            System.out.println("Paid Date Time is passed");
        } else {
            System.out.println("Paid Date Time is failed");
        }

//Check charge
        if (charge == adhocTicket.getCharge()) {
            System.out.println("Charge is passed");
        } else {
            System.out.println("Charge is failed");
        }

//Set exit Date time
        long exitDateTime = System.currentTimeMillis();
        adhocTicket.exit(exitDateTime);

//Check exit date time
        if (exitDateTime == adhocTicket.getExitDateTime()) {
            System.out.println("Exit Date Time is passed");
        } else {
            System.out.println("Exit Date Time is failed");
        }

//Set Date
        Date entryDate = new Date(entryDateTime);
        Date paidDate = new Date(payDateTime);
        Date exitDate = new Date(exitDateTime);

//Set State
        state_ = state_.EXITED;

//Check toString() method
        String check = "Carpark    : " + carparkId_ + "\n"
                + "Ticket No  : " + ticketNo_ + "\n"
                + "Entry Time : " + entryDate + "\n"
                + "Paid Time  : " + paidDate + "\n"
                + "Exit Time  : " + exitDate + "\n"
                + "State      : " + state_ + "\n"
                + "Barcode    : " + barcode;

 if(check.equals(adhocTicket.toString())){
            System.out.println("toString() method is passed");
        }else{
            System.out.println("toString() method is failed");
        }

//Check hasExit
        if(true==adhocTicket.hasExited()){
            System.out.println("hasExit() is passed");
        }else{
            System.out.println("hasExit() is failed");
        }

 //Check isPaid
        if(false==adhocTicket.isPaid()){
            System.out.println("isPaid() is passed");
        }else{
            System.out.println("isPaid() is failed");
        }

//Check exit
        adhocTicket.exit(exitDateTime);
}
