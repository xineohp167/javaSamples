package product;
// https://stackoverflow.com/questions/9591561/java-cartesian-product-of-a-list-of-lists
public class ArrayProduct {
	
	public static void generate(int[][] sets) {
	    int solutions = 1;
	    for(int i = 0; i < sets.length; solutions *= sets[i].length, i++);
	    for(int i = 0; i < solutions; i++) {
	        int j = 1;
	        for(int[] set : sets) {
	            System.out.print(set[(i/j)%set.length] + " ");
	            j *= set.length;
	        }
	        System.out.println();
	    }
	}

	public static void main(String[] args) {
	    generate(new int[][]{{1,2,3}, {3,2}, {5,6,7}});
	}

}
