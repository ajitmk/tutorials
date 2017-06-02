import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "This is a test string";
		String str1 = "hello";
		String str2 ="hello";
		String str3 ="";
		String str4 ="   Spaces   all arround    ";
		String str6 ="hello";
		
		// calcs the length
		System.out.println(str.length());
		
		// Tells the char , to note it starts counting from 0
		System.out.println(str.charAt(2));
		
		// adds the string to the end 
		System.out.println(str.concat(" This is the appended string"));
		
		// looks for the specific strings
		
		
		System.out.println(str.contains("ddi"));
		
		// checks if the string starts with
		System.out.println(str.startsWith("h"));
		
		// checks if the string ends eith
		System.out.println(str.endsWith("string"));
		
		//Compares the strings
		System.out.println(str1.equals(str2));
		
		//boolean to compare string in the form of -1 and 1
		System.out.println(str.indexOf('h'));
		
		// checks if the string is empty
		System.out.println(str3.isEmpty());
		
		// trims the leading and trial spaces
		System.out.println(str4.trim());
		
		System.out.println("Replace example " +str6.replace('e', 'a'));
		
		System.out.println("Sub string xample1: "+str.substring(5));
		System.out.println("Sub string xample2: "+str.substring(5, 10));
		
		System.out.println();
		
		char[] charArray = str.toCharArray();
		for (int i=0; i<charArray.length; i++) {
			System.out.println("Index "+ i + " is: " + charArray[i]);
		
		}
		
		System.out.println("Lower case: "+ str.toLowerCase());
		System.out.println("Uppser case: "+ str.toUpperCase());
		System.out.println(str.substring(1,9));
	}
	

}
