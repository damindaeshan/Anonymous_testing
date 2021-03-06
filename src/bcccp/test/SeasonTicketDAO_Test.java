package bcccp.test;

import bcccp.tickets.season.SeasonTicket;
import bcccp.tickets.season.SeasonTicketDAO;
import bcccp.tickets.season.UsageRecordFactory;

public class SeasonTicketDAO_Test {
        UsageRecordFactory factory = new UsageRecordFactory();
		
		SeasonTicketDAO SeaDAO = new SeasonTicketDAO(factory);
		SeasonTicket ticket = new SeasonTicket("TIK001", "CAR_001", 12343344, 1234565);
		SeaDAO.registerTicket(ticket);
		//Ticket Registered

	public static void main(String[] args) {
		
		UsageRecordFactory factory = new UsageRecordFactory();
		
		SeasonTicketDAO SeaDAO = new SeasonTicketDAO(factory);
		SeasonTicket ticket = new SeasonTicket("TIK001", "CAR_001", 12343344, 1234565);
		SeaDAO.registerTicket(ticket);
		SeaDAO.recordTicketExit("TIK001");
		//Ticket Registered
		//Ticket exit recorded 
	}
}
