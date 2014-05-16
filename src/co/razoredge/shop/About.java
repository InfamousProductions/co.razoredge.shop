package co.razoredge.shop;

import android.app.Activity;
import android.os.Bundle;
import android.content.*;
import android.view.View;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;

public class About extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
    }
	
	
	
	//ID for the menu exit options
    private final int ID_MENU_EXIT = 1;
	private final int ID_MENU_MAIN = 2;
	private final int ID_MENU_CONTACT = 3;

	@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
		// call the base class method
    	super.onCreateOptionsMenu(menu);

		//the menu option text is defined in resources
		menu.add(Menu.NONE,ID_MENU_MAIN,Menu.NONE,R.string.mainOption);

		//get the MenuItem reference
		menu.add(Menu.NONE,ID_MENU_CONTACT,Menu.NONE,R.string.contactOption);

		//get the MenuItem reference
		menu.add(Menu.NONE,ID_MENU_EXIT,Menu.NONE,R.string.exitOption);

		return true;
	}

	@Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	//check selected menu item
    	switch(item.getItemId()){
			case ID_MENU_EXIT:

				//close the Activity
				finish();
				break;

			case ID_MENU_MAIN:
				//define a new Intent for the second Activity
				Intent intent = new Intent(this,MainActivity.class);

				//start the second Activity
				this.startActivity(intent);
				break;

			case ID_MENU_CONTACT:
				//define a new Intent for the second Activity
				Intent intent2 = new Intent(this,Contact.class);

				//start the second Activity
				this.startActivity(intent2);

    	}
    	return true;
	} 
}
