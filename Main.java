import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		FixedArray bookArr = new FixedArray();

		System.out.println("Please enter your book title: ");
		
		String userTitle = kbd.nextLine();
		
		bookArr.addTitle(userTitle);
		
		bookArr.displayTitles();
		


	}

}
