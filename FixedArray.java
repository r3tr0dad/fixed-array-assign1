
public class FixedArray {
	
	private String[] bookTitles = new String[5];
	private int count = 0;
	
	public void addTitle(String title) {
		
		if(count < bookTitles.length) {
			bookTitles[count] = title;
			count++;
		}
	}
	
	public void displayTitles() {
		for(int i = 0; i < bookTitles.length; i++) {
			System.out.println("Book " + (i + 1) + " title: " + bookTitles[i]);
		}
	}
	
	public void searchTitle(String title) {
		for(int i = 0; i < bookTitles.length; i++) {
			if(bookTitles[i].equalsIgnoreCase(title)) {
				System.out.println("Book found at: " + bookTitles[i]);
				return;
			}
		}
		
		
	}
	
	

}
