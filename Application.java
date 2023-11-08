import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sam Kauffman
 * @Version 1.0
 *
 */
public class Application {

	public static void main(String[] args) {

		Hash hash = new Hash();
		try (FileReader fileReader = new FileReader("C:\\Users\\sam58\\Downloads\\DictionaryWordValuePairs.csv");
				BufferedReader reader = new BufferedReader(fileReader)) {

			String line;
			String[] twoWords;
			
			while ((line = reader.readLine()) != null) {
				twoWords = line.split(",", 2);
				hash.addWords(twoWords[0], twoWords[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Complete archaic dictionary: \n");
		System.out.println(hash.toString());
		System.out.println(hash.getWord("sacring"));
		System.out.println(hash.getWord("meat"));
		System.out.println(hash.getWord("corse"));
		System.out.println(hash.getWord("uncommon"));
		System.out.println(hash.getWord("sap"));
	}
}//end class
