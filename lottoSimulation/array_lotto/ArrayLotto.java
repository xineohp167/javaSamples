package array_lotto;

import java.util.Random;

public class ArrayLotto {
	
	public static void main(String[] args) {
		boolean[][] lotto = new boolean[1000][1000];
		Random gen = new Random();
		for(int i = 0; i < 1000; i++){
			lotto[i][gen.nextInt(1000)] = true;
		}
		
		int trials = 1000000;
		int winCases = 0;
		for(int k = 0; k < trials; k++){
			int prizes = 0;
			for(int i = 0; i < 1000; i++){
				if(lotto[i][gen.nextInt(1000)]){
					prizes++;
				}
			}
			if(prizes >= 3) winCases++;
		}
		System.out.println("number of winningCases: " + winCases);
		double perc = 100. * winCases / trials;
		System.out.println("Probability in percentage " + perc);
//		// count the winning tickets
//		int prizes = 0;
//		for(int i = 0; i < 1000; i++){
//			for(int j = 0; j < 1000; j++){
//				if(lotto[i][j]){
//					prizes++;
//				}
//			}
//		}
//		System.out.println("num of prizes: " + prizes);
	}

}
