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
        AdhocTicket adhocTicket = new AdhocTicket("Level_1_005", 344567588, "LV1_003_34456_14:42_18Sept");
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
			Expected Result : CarparkID test is Passed
			Actual Result : CarparkID test is Passed
			
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
			
			Input 2: 344567
			Expected Result : Ticket NO test is Failed
			Actual Result : Ticket NO test is Failed
			
			Input 3: 3445675
			Expected Result : Ticket NO test is Failed
			Actual Result : Ticket NO test is Failed
			
			Input 4: 344567588
			Expected Result : Ticket NO test is Passed
			Actual Result : Ticket NO test is Passed
			
			
			
		*/
        if (344567588 == adhocTicket.getTicketNo()) {
            System.out.println("TicketNo test is Passed");
        } else {
            System.out.println("TicketNo test is Failed");
        }
        
        /*
			Test Barcode

			Input 1: LV1_002_34456_14:42_18Sept
			Expected Result : Barcode test is Passed
			Actual Result : Barcode test is Passed
			
			Input 2: LV1_003_34456_14:42_18Sept
			Expected Result : Barcode test is Passed
			Actual Result : Barcode test is Passed
			
			Input 3: LV1_004_34456_14:42_18Sept
			Expected Result : Barcode test is Failed
			Actual Result : Barcode test is Failed
			
			Input 4: LV1_005_34456_14:42_18Sept
			Expected Result : Barcode test is Failed
			Actual Result : Barcode test is Failed
			
		*/
        
        if ("LV1_005_34456_14:42_18Sept".equals(adhocTicket.getBarcode())) {
            System.out.println("Barcode test is Passed");
        } else {
            System.out.println("Barcode test is Failed");
        }
//Set entry date Time


        long entryDateTime = System.currentTimeMillis();
        adhocTicket.enter(entryDateTime);

//Check entry date time
		/*
			Test entryDateTime

			Input 1: entryDateTime
			Expected Result : entryDateTime test is Passed
			Actual Result : entryDateTime test is Passed
			
			
			
		*/

        if (entryDateTime == adhocTicket.getEntryDateTime()) {
            System.out.println("Entry Date Time is passed");
        } else {
            System.out.println("Entry Date Time is failed");
        }

//Set pay
        long payDateTime = System.currentTimeMillis();
        float charge = 43.5f;
        adhocTicket.pay(payDateTime, charge);

    }

//Check Paid Date time
/*
			Test payDateTime

			Input 1: payDateTime
			Expected Result : payDateTime test is Passed
			Actual Result : payDateTime test is Passed
			
			
			
		*/
        if (payDateTime == adhocTicket.getPaidDateTime()) {
            System.out.println("Paid Date Time is passed");
        } else {
            System.out.println("Paid Date Time is failed");
        }

//Check charge
/*
			Test charge

			Input 1: 50.25f
			Expected Result : charge test is Passed
			Actual Result : charge test is Passed
			
			Input 2: 50.25
			Expected Result : charge test is Failed
			Actual Result : charge test is Failed
			
			Input 3: 43.5f
			Expected Result : charge test is Passed
			Actual Result : charge test is Passed
			
			
			
		*/
        if (charge == adhocTicket.getCharge()) {
            System.out.println("Charge is passed");
        } else {
            System.out.println("Charge is failed");
        }

//Set exit Date time
        long exitDateTime = System.currentTimeMillis();
        adhocTicket.exit(exitDateTime);

//Check exit date time
/*
			Test exitDateTime

			Input 1: exitDateTime
			Expected Result : exitDateTime test is Passed
			Actual Result : exitDateTime test is Passed
			
			
			
		*/
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
/*
			Test toString

			Input 1: Carpark    : " + carparkId_ + "\n"
                + "Ticket No  : " + ticketNo_ + "\n"
                + "Entry Time : " + entryDate + "\n"
                + "Paid Time  : " + paidDate + "\n"
                + "Exit Time  : " + exitDate + "\n"
                + "State      : " + state_ + "\n"
                + "Barcode    : " + barcode
			Expected Result : toString test is Passed
			Actual Result : toString test is Passed
			
			
			
		*/
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
/*
			Test hasExit

			Input 1: true
			Expected Result : hasExit test is Passed
			Actual Result : hasExit test is Passed
			
			
			Input 2: false
			Expected Result : hasExit test is Failed
			Actual Result : hasExit test is Failed
		*/

        if(false==adhocTicket.hasExited()){
            System.out.println("hasExit() is passed");
        }else{
            System.out.println("hasExit() is failed");
        }

 //Check isPaid
 /*
			Test isPaid

			Input 1: false
			Expected Result : isPaid test is Passed
			Actual Result : isPaid test is Passed
			
			Input 2: true
			Expected Result : isPaid test is Failed
			Actual Result : isPaid test is Failed
			
			
		*/
        if(true==adhocTicket.isPaid()){
            System.out.println("isPaid() is passed");
        }else{
            System.out.println("isPaid() is failed");
        }

//Check exit
        adhocTicket.exit(exitDateTime);
}
