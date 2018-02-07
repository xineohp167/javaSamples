import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Finds, for a given phone number, all
 * possible encodings by words, and prints them.
 * The mapping is:<br>
 * E | J N Q | R W X | D S Y | F T | A M | C I V | B K U | L O P | G H Z,<br>
 * e | j n q | r w x | d s y | f t | a m | c i v | b k u | l o p | g h z<br>
 * 0 |   1   |   2   |   3   |  4  |  5  |   6   |   7   |   8   |   9
 * @author Fabien
 *
 */
public class PhoneNumberToWords {
	/**
	 * 2d char array that implements the mapping.
	 */
	static char[][] letters = {
			"Ee".toCharArray(), // 0
			"JNQjnq".toCharArray(), // 1
			"RWXrwx".toCharArray(), // 2
			"DSYdsy".toCharArray(), // 3
			"FTft".toCharArray(), // 4
			"AMam".toCharArray(), // 5
			"CIVciv".toCharArray(), // 6
			"BKUbku".toCharArray(), // 7
			"LOPlop".toCharArray(), // 8
			"GHZghz".toCharArray() // 9
	};
	
	static Set<String> words = loadWordsFromFile();
	
	// main method
	public static void generateAndCheckAll(String number) {
	    int[] num = new int[number.length()];         // store number as digits
	    int[] ind = new int[number.length()];         // store letter indices
	    int i = 0;
	    for (char c : number.toCharArray()) {         // convert String to int array
	        num[i++] = c - '0';
	    }
	    do {
	        String word = generateWord(num, ind);
	        System.out.println(word + (words.contains(word) ? " is contained" : " is not contained"));
	    } while (next(num, ind));
	}


	private static Set<String> loadWordsFromFile() {
		Set<String> words = null;
		Path filePath = Paths.get("C:\\Users\\Fabien\\Documents\\workspace-eclipse4.6\\PhoneNumberToWords\\resource\\dict.txt");
		List<String> lines = null;
		try {
			lines = Files.readAllLines(filePath, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!lines.isEmpty()){
			words = new HashSet<String>(lines);
		}
		return words;
	}


	// generate word by number array and index array
	private static String generateWord(int[] num, int[] ind) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < ind.length; i++) 
	        sb.append(letters[num[i]][ind[i]]);
	    return sb.toString();
	}


	// switch index array to next
	private static boolean next(int[] num, int[] ind) {
		int i = ind.length - 1;
		while (i >= 0 && ind[i] == letters[num[i]].length - 1) // search for the index that can be incremented
			i--;
		if (i < 0)
			return false;
		ind[i]++;                                              // increment such index
		for (int j = i + 1; j < num.length; j++)               // change remaining indices to 0
			ind[j] = 0;
		return true;
	}
	
	
	public static void main(String[] args) {
		//First test words is loaded
		System.out.println(words.contains("break"));
		generateAndCheckAll("123");
		
	}

}
