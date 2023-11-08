import java.util.HashMap;

/**
 * @author sam Kauffman
 * @Version 1.0
 * This class is my ash builder class that adds keys and definitions, returns definitions, and returns the entire hash map
 *
 */
public class Hash {
		
	private HashMap<String, String> archaicWords;

	/**
	 * Constructor
	 */
	public Hash() {
		archaicWords = new HashMap<>();
	}
	
	/**
	 * @param hash key
	 * @param hash definition
	 */
	public void addWords(String key, String definition) {
		archaicWords.put(key, definition);
	}
	
	/**
	 * @param hash key
	 * @return hash definition
	 */
	public String getWord(String key) {
		return archaicWords.get(key);
	}
	
	/**
	 * returns the entire hash map
	 */
	public String toString() {
        StringBuilder allKeys = new StringBuilder();
        for (String key : archaicWords.keySet()) {
            String definition = archaicWords.get(key);
            allKeys.append(key).append(": ").append(definition).append("\n");
        }
        return allKeys.toString();
    }
		
}//end class

