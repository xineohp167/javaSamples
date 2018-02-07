package fast_lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Lotto {
	
	
	public static void main(String[] args) {
		Random gen = new Random();
		ArrayList<ArrayList<Boolean>> listlottos = new ArrayList<ArrayList<Boolean>>();
		for(int i = 0; i < 1000; i++){
			ArrayList<Boolean> loto =new ArrayList<Boolean>(Arrays.asList(new Boolean[1000]));
			Collections.fill(loto, Boolean.FALSE);
			int index = gen.nextInt(1000);
			loto.set(index, Boolean.TRUE);
			listlottos.add(loto);
		}
		int trials = 1000;
		int winCases = 0;
		for(int i = 0; i < trials; i++){
			int prizes = 0;
			for (ArrayList<Boolean> lot : listlottos) {
				if(lot.get(gen.nextInt(1000))){
					prizes++;
				}
			}
			if(prizes >= 3){
				winCases++;
			}
		}
		System.out.println("number of winningCases: " + winCases);
		double perc = 100. * winCases / trials;
		System.out.println("Probability in percentage " + perc);
		
//		//Simulating single lotto
//		List<Boolean> tickets =new ArrayList<Boolean>(Arrays.asList(new Boolean[1000]));
//		Collections.fill(tickets, Boolean.FALSE);
//		int index = gen.nextInt(1000);
//		tickets.set(index, Boolean.TRUE);
//		int prizes = 0;
//		int pos = 0;
//		for(int i = 0; i < tickets.size(); i++){
//			if(tickets.get(i)){
//				prizes++;
//				pos = i;
//			}
//		}
//		System.out.println("num of prizes: " + prizes);
//		System.out.println("num of pos: " + pos);

		
	}

}
