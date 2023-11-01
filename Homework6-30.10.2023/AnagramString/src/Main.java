import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1Old = scanner.nextLine();
		System.out.println("Enter second string: ");
		String str2Old = scanner.nextLine();
		
		String s1 = str1Old.trim();
		String s2 = str2Old.trim();
		
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		
		char[] str1Array = new char[str1.length()];
		char[] str2Array = new char[str2.length()];
		
		for(int i = 0; i < str1.length(); i++) {
			char c1 = str1.charAt(i);
			str1Array[i] = c1;
		}
		
		for(int i = 0; i < str2.length(); i++) {
			char c2 = str2.charAt(i);
			str2Array[i] = c2;
		}
		
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		if(Arrays.equals(str1Array, str2Array)) {
			System.out.println(str1Old + " and "+ str2Old + " are ANAGRAMS of each other");
		}else {
			System.out.println(str1Old + " and "+ str2Old + " are NOT ANAGRAMS of each other");
		}
		
		
	}

}
