import java.util.HashMap;

public class ContactList {
  public static void main(String[] args) {
		//Create a HashMap with Key telephone number and Value name of contanct.
	  	HashMap<Integer, String> contactlist = new HashMap<Integer, String>();

	  	//Add 5 Contacts
		for (int i = 0; i < 5; i++){
		  contactlist.put((123456+i), "Mary"+i);
		}
	    System.out.println("printing all the contacts: " + contactlist);
	      
	    //Print all the contacts  
	    for (Integer i : contactlist.keySet()) {
	        System.out.println(i + " : " + contactlist.get(i));
	    }
  	}
}
