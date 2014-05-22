package co.razoredge.shop;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.content.*;
import android.view.View;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;
import android.widget.ListView;
import android.net.Uri;
import android.content.res.*;
import android.graphics.drawable.*;


public class Services extends Activity{

	AlertDialog alertDialogStores;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about);
		
		
		
		

	// a button to show the pop up with a list view
	View.OnClickListener handler = new View.OnClickListener(){
		public void onClick(View v) {
			switch (v.getId()) {

				case R.id.buttonShowPopUp:
					showPopUp();
					break;
			}
		}
	};
	findViewById(R.id.buttonShowPopUp).setOnClickListener(handler);

    }

	
	
    

    public void showPopUp(){

    	// add your items, this can be done programatically
    	// your items can be from a database
        ObjectItem[] ObjectItemData = new ObjectItem[12];

        ObjectItemData[0] = new ObjectItem(91, "Flattops , Fades, Military cuts women`s cut and  style Haircuts - 14.00");
        ObjectItemData[1] = new ObjectItem(92, "Haircuts and shave - 20.00");
        ObjectItemData[2] = new ObjectItem(93, "Kids - 10.00");
        ObjectItemData[3] = new ObjectItem(94, "Tape up - 7.00");
        ObjectItemData[4] = new ObjectItem(95, "Full tape up - 10.00");
        ObjectItemData[5] = new ObjectItem(96, "Even cut - 15.00 ");
        ObjectItemData[6] = new ObjectItem(97, "Everything (The works) - 25.00 ");
        ObjectItemData[7] = new ObjectItem(98, "Shave - 10.00 ");
        ObjectItemData[8] = new ObjectItem(99, "Design 10.00 - 40.00 ");
        ObjectItemData[9] = new ObjectItem(100, "Men`s color / cut - 30.00 ");
        ObjectItemData[10] = new ObjectItem(101, "* First Time customer`s half price ");
        ObjectItemData[11] = new ObjectItem(102, "* Ask about Florida Blue, FCSO, DSO discount");



        // our adapter instance
        ArrayAdapterItem adapter = new ArrayAdapterItem(this, R.layout.list_view_row_item, ObjectItemData);

        // create a new ListView, set the adapter and item click listener
        ListView listViewItems = new ListView(this);
        listViewItems.setAdapter(adapter);
        listViewItems.setOnItemClickListener(new OnItemClickListenerListViewItem());

        // put the ListView in the pop up
        alertDialogStores = new AlertDialog.Builder(Services.this)
	        .setView(listViewItems)
	        .setTitle("Prices and specials")
	        .show();

    }
}

