package hw04_task2;
import java.util.Scanner;

/**1. the difference between == and equals():
 * -> == zwei Referenzen auf dasselbe Objekt im Speicher zeigen (Identität)
 *  equals() gleicher Inhalt (Wertgleichheit)
 * 2. true, weil beide Strings gleichen Inhalt haben
 * 3. new String -> erzeugt neues Objekt
 * == wäre false, da Referenz auf unterschiedliche Objekte
 *  equals() wäre true, da immer noch inhaltlich gleich
 */

public class AnagramChecker {

	 /**
	 * Returns true if the two strings are anagrams of each other.
	 */
	 public static boolean isAnagram(String a, String b) {
	 // TODO: implement using countLetters()
		int[] lengthA = countLetters(a);
		int[] lengthB = countLetters(b);
		
	    for(int i = 0; i < 26; i++) {
	    	if(lengthA[i] != lengthB[i]) {
			return false;
	    	}
	    }
	    return true;
	 }
	 
	 /**
	  * Helper method to count how many times each letter (a-z) appears.
	  */
	  public static int[] countLetters(String s) {
	  int[] counts = new int[26];
	  // 2. no whitespace and uppercase
	  s = s.toLowerCase();
	  //nimmt alle Lehrzeichen raus: von - zu
	  s = s.replaceAll(" ", "");
	  
	  for(int i = 0; i < s.length(); i++) {
		  
		  //chat at index..
		  char c = s.charAt(i);
		  //schauen on Buchstabe a-z
		  if(c >= 'a' && c <= 'z') {
			  //um auf korrekten index zu kommen -a
			  int index = c - 'a';
			  counts[index]++;
		  }
	  }
	 
	  return counts;
	  }
	  
	  /**
	   * Print only letters that appear in the string with their counts.
	   */
	   public static void printLetterCounts(String s) {
	   // TODO: implement nicely formatted output
		   int[] counts = countLetters(s);
		   for(int i = 0; i < s.length(); i++) {
			   if(counts[i] > 0) {
				   
				   //Typ-Cast -> cast as char, ('a' +  i) wandelt in richtigen BS, a-index +
				   char letter = (char) ('a' +  i);
				   System.out.println(letter + ":" + counts[i]);
				   
			   }
			  
		   }
	   }
	   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   // Get two strings from the user
	   System.out.print("Enter the first string: ");
	   String word1 = scanner.nextLine();
	   System.out.print("Enter the second string: ");
	   String word2 = scanner.nextLine();
	   // TODO: Process the strings here (ignore spaces, case)
	   System.out.println("Are they anagrams? " + isAnagram(word1, word2));
	   printLetterCounts(word1);
	   }
}
