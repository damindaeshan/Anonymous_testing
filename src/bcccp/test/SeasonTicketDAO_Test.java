package bcccp.test;

public class SeasonTicketDAO_Test {
        UsageRecordFactory factory = new UsageRecordFactory();
		
		SeasonTicketDAO SeaDAO = new SeasonTicketDAO(factory);
		SeasonTicket ticket = new SeasonTicket("TIK001", "CAR_001", 12343344, 1234565);
		SeaDAO.registerTicket(ticket);
		//Ticket Registered

}
