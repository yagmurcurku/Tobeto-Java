import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		String number = scanner.nextLine();
		
		int numberLength = number.length();
		int sayi = Integer.parseInt(number);
		
		int kalan = 0;
		int sayi2 = sayi;
		int sonuc = 0;
		

        while (sayi2 != 0) {
            kalan = sayi2 % 10;
            sonuc += Math.pow(kalan, numberLength);
            sayi2 = sayi2 / 10;
        }

        if (sonuc == sayi)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
 
        
	}
}
