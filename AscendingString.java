//10 cities in single dimension array arrange in ascending order using bubble sort
public class AscendingString {
   public static void main(String []args) {
	String str[] = { "Delhi", "Steve", "Rick", "Becky", "Mohan"};
	String temp;
	System.out.println("Strings in sorted order:");
	for (int j = 0; j < str.length; j++) {
   	   for (int i = j + 1; i < str.length; i++) {
		// comparing adjacent strings
		if (str[i].compareTo(str[j]) < 0) {
			temp = str[j];
			str[j] = str[i];
			str[i] = temp;
		}
	   }
	   System.out.println(str[j]);
	}
   }
}
