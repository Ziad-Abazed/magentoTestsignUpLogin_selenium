package magentoTestsignUpLogin;

public class ParametersClass {
	
	
	static String URL = "https://magento.softwaretestingboard.com/";
	
	static String[] firstNames = {"mohammad", "ali", "waleed", "ziad","khaled","karam"};
	
	static String[] lastNames = {"ALassaf", "abazeed", "alsaqa", "alnajar"};
	static int firstIndex = (int)(Math.random() * firstNames.length); 
	static int lasttIndex = (int)(Math.random() * lastNames.length); 
	static int randomNumber = (int) (Math.random() * 999) + 1;
	
	static String firstName=firstNames[firstIndex];
	
	static String lastName=lastNames[lasttIndex];
	

	static String Email = firstName+lastName+randomNumber+"@gmail.com";

	static String Password = firstName+lastName+randomNumber+"@";
	static String registerMsg = "Thank you for registering with Main Website Store."; 
	static String WlcomeMsg="Welcome, "+firstName+" "+lastName+"!";

}
