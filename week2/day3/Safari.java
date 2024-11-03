package week2.day3;

public class Safari extends Browser{
	
	//create  subclasses such as Safari under Browser
	//Define readerMode() and fullScreenMode() methods in Safari class  
	
	public void readerMode() {
		System.out.println("In reader Mode...Safari Class");
	}
	
	public void fullScreenMode() {
		System.out.println("FullScreen Mode...Safari Class");
	}
	
	public static void main(String[] args) {
		
		Safari s = new Safari();
		s.openURL("Safari", 60);
		s.readerMode();
		s.fullScreenMode();
		s.navigateBack("Safari");
		s.closeBrowser("Safari");
		
	}

}
