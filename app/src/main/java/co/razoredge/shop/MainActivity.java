package co.razoredge.shop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        WebView mainWebView = (WebView) findViewById(R.id.mainWebView);

        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mainWebView.setWebViewClient(new MyCustomWebViewClient());
        mainWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        mainWebView.loadUrl("http://www.razoredge.co/home.html");
    }

    private class MyCustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
	
	//ID for the menu exit options
    private final int ID_MENU_EXIT = 1;
	private final int ID_MENU_ABOUT = 2;
	private final int ID_MENU_CONTACT = 3;
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
		// call the base class method
    	super.onCreateOptionsMenu(menu);
    
		//the menu option text is defined in resources
		menu.add(Menu.NONE,ID_MENU_ABOUT,Menu.NONE,R.string.aboutOption);

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
			
		case ID_MENU_ABOUT:
				//define a new Intent for the second Activity
				Intent intent = new Intent(this,About.class);

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
	
