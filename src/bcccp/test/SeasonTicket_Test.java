package bcccp.test;

import bcccp.tickets.season.SeasonTicket;

public class SeasonTicket_Test {
	
	public static void main(String[] args) {
		SeasonTicket ticket = new SeasonTicket("TIK001", "LEFD-001", 1220227200, 0220227200);
		System.out.println(ticket.getId());
        System.out.println(ticket.getCarparkId());
        System.out.println(ticket.getStartValidPeriod());
        System.out.println(ticket.getEndValidPeriod());

	}
	
}