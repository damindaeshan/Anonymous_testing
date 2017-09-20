package bcccp.test;

import bcccp.carpark.Carpark;
import bcccp.carpark.entry.EntryController;
import bcccp.tickets.adhoc.AdhocTicket;
import bcccp.tickets.season.SeasonTicketDAO;
import bcccp.tickets.season.UsageRecordFactory;

public class EntryControllerTest {
	public static enum STATE { IDLE, WAITING, FULL, VALIDATED, ISSUED, TAKEN, ENTERING, ENTERED, BLOCKED } 

	public static void main(String[] args){
		
		EntryController entryController = new EntryController();
		entryController.carEventDetected("CAR1", true);
		//entryController.setState(null);
	}
	
	

}
