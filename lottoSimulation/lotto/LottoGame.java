package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoGame {
	
	/*
	 *  In this simulation we have 1000 lotteries with 1000 tickets.
	 *  In every lottery only one ticket is winning.
	 *  We want to know probability of winning at least 3 prizes.
	 */
	public static void main(String[] args) {
		List<Lottery> game = createLotto(1000);
		int trials = 1000000;
		int winningCases = 0; // winningCase if numPrizes >= 3
		Random generator = new Random();
		for(int i =0; i < trials; i++){
			// creating the single simulation
			int prizes = 0;
			for(Lottery lotto : game){
				List<Ticket> tickets = lotto.getTickets();
				int index = generator.nextInt(tickets.size());
				if(tickets.get(index).isWinning()){
					prizes++;
				}
				}
			if(prizes >=3){
				winningCases++;
			}
			}	
		
		System.out.println("number of winningCases: " + winningCases);
		double percent = 100. * winningCases / trials;
		System.out.println("Probability in percentage " + percent);
	}

	private static List<Lottery> createLotto(int num) {
		List<Lottery> lottos = new ArrayList<Lottery>();
		for(int i = 0; i < num; i++){
			lottos.add(new Lottery(1000, 1));
		}
		return lottos;
		
	}

	
}
