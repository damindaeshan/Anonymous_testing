package bcccp.test;

import bcccp.carpark.CarSensor;
import bcccp.carpark.Carpark;
import bcccp.carpark.Gate;
import bcccp.carpark.entry.EntryController;
import bcccp.carpark.entry.EntryUI;
import bcccp.tickets.adhoc.AdhocTicketDAO;
import bcccp.tickets.adhoc.AdhocTicketFactory;
import bcccp.tickets.season.SeasonTicketDAO;
import bcccp.tickets.season.UsageRecordFactory;

public class EntryControllerTest {
	public static enum STATE { IDLE, WAITING, FULL, VALIDATED, ISSUED, TAKEN, ENTERING, ENTERED, BLOCKED } 

	public static void main(String[] args){
		AdhocTicketFactory adhocTicketFactory = new AdhocTicketFactory();
		AdhocTicketDAO adhocTicketDAO = new AdhocTicketDAO(adhocTicketFactory);
		UsageRecordFactory factory = new UsageRecordFactory();
		SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);

		Carpark carpark = new Carpark("Gulani_CAR", 15, adhocTicketDAO, seasonTicketDAO);
		Gate entryGate = new Gate(1, 2);
		CarSensor is = new CarSensor("CAR1", 1, 2);
		CarSensor os = new CarSensor("CAR1", 1, 2);
		EntryUI ui = new EntryUI(1, 2);
		EntryController controller = new EntryController(carpark, entryGate, os, is, ui);
		//controller.carEventDetected("CAR1", true);
		//controller.buttonPushed();
		//controller.ticketInserted("bar1");
		//controller.ticketTaken();
		controller.notifyCarparkEvent();
	}
	
	

}
