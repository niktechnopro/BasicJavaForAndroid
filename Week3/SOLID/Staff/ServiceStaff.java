package staff;
import Recipes.*;
import Menu.*;

public interface ServiceStaff{
	void takeOrder(int index);
	Recipe giveOrder(Menu menu);
	void deliverOrder();
}