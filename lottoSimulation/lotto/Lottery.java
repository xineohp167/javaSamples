package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
	
	private int numberOfTickets;
	private int numberOfWinTickets;
	private List<Ticket> tickets;
	
	
	public Lottery(int numberOfTickets, int numberOfWinTickets) {
		this.numberOfTickets = numberOfTickets;
		this.numberOfWinTickets = numberOfWinTickets;
		createTickets(numberOfTickets, numberOfWinTickets);
	}


	private void createTickets(int numberOfTickets, int numberOfWinTickets) {
		tickets = new ArrayList<Ticket>();
		for(int i = 0; i < numberOfWinTickets; i++){
			tickets.add(new Ticket(true));
		}
		for(int i = 0; i < (numberOfTickets - numberOfWinTickets); i++){
			tickets.add(new Ticket(false));
		}
		Collections.shuffle(tickets);
		
	}


	public int getNumberOfTickets() {
		return numberOfTickets;
	}


	public int getNumberOfWinTickets() {
		return numberOfWinTickets;
	}


	public List<Ticket> getTickets() {
		return tickets;
	}
	
	
	
	
	
	

}
