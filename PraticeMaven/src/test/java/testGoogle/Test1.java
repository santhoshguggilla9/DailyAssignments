package testGoogle;

import pages.GoogleSearchPage;

public class Test1 {

	public static void main(String[] args) {
		
		GoogleSearchPage s = new GoogleSearchPage();
		
		s.searchTest("testing");
	
		s.searchTest("software");
	
		s.searchTest("java");
		
		s.teardown();
	}

}
