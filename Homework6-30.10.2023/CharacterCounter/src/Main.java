import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String word = scanner.nextLine();

        String wordNew = word.toLowerCase();
        Map<Character, Integer> charsAndValues = new HashMap<>();

        for(int i = 0; i < wordNew.length(); i++){
            char c = wordNew.charAt(i);
            if (charsAndValues.containsKey(c)){
                charsAndValues.put(c, charsAndValues.get(c)+1);
            }else{
                charsAndValues.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> character : charsAndValues.entrySet()) {
            System.out.println(character.getKey() + " --> " + character.getValue());
        }
		
	}

}
