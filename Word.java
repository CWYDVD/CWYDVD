package assign06;

public class Word {
	private char[] letters;
	
	public Word(String word) {
        // Check if the input word contains only letters (a-z or A-Z)
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!(c >= 65 && c <= 90) && !(c >= 97 && c <= 122)) {
                throw new IllegalArgumentException("Word contains invalid characters. Only letters are allowed.");
            }
        }
        // Set the elements of the letters array
        this.letters = word.toCharArray();
	}
	
	/**
	 * Generates and returns a String object to represent this Word object 
	 * (driver method).
	 * 
	 * @return a String object that represents this Word object
	 */
	public String toString() {
	  return toString(0);
	}
		
	/**
	 * Generates and returns a String object to represent the letters of 
	 * this Word object from a given index to the last index (recursive method).
	 * 
	 * @param startIndex - index at which to start
	 * @return the letters of this Word from startIndex to the last index, as a String
	 */
	private String toString(int startIndex) {
	  // base case
	  if(startIndex == letters.length)
	   return "";
	  // recursive case
	  return letters[startIndex] + toString(startIndex + 1);
	}
}
