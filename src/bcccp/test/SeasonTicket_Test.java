package bcccp.test;

import bcccp.tickets.season.SeasonTicket;

public class SeasonTicket_Test {
	
	public static void main(String[] args) {
		SeasonTicket ticket = new SeasonTicket("TIK001", "LEFD-001", 1220227200, 0220227200);
		UsageRecord record = new UsageRecord("TIK001",  1220227200);
		ticket.recordUsage(record);
		
		System.out.println(ticket.getCurrentUsageRecord());
		//Usage : startDateTime : 1220227200, endDateTime: 0

	}
	
}