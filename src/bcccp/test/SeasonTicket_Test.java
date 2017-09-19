package bcccp.test;

import bcccp.tickets.season.SeasonTicket;

public class SeasonTicket_Test {
	
	public static void main(String[] args) {
		SeasonTicket ticket = new SeasonTicket("TIK001", "LEFD-001", 1220227200, 0220227200);
		UsageRecord record = new UsageRecord("TIK001",  1220227200);
		ticket.recordUsage(record);
		
		UsageRecord record1 = new UsageRecord("TIK002",  1220227200);
		ticket.recordUsage(record1);
		
		UsageRecord record2 = new UsageRecord("TIK003",  1220227200);
		ticket.recordUsage(record2);
		
		System.out.println(ticket.getUsageRecords());
		//[Usage : startDateTime : 1220227200, endDateTime: 0, 
		//Usage : startDateTime : 1220227200, endDateTime: 0,
		//Usage : startDateTime : 1220227200, endDateTime: 0]

	}
	
}