
public class Main {

	public static void main(String[] args) {
		
		
		int total = 0;
		int number = 2;
		while (total < 10) {
			
			int sum = 0;
			for(int i = 1; i < number ; i++) {
				if(number % i == 0) {
					sum += i;
				}
			}
			if(sum == number) {
				total +=1 ;
				System.out.println(number + " is the perfect number");
			}
	
			number ++;
		}
		
		
	}
}
