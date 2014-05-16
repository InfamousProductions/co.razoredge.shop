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
	
	//ID for the menu exit option
    private final int ID_MENU_EXIT = 1;
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
		// call the base class method
    	super.onCreateOptionsMenu(menu);
    
		//the menu option text is defined in resources
		menu.add(R.string.aboutOption);

		//it is better to use final variables for IDs than constant values
		//menu.add(Menu.NONE,1,Menu.NONE,"Exit");

		//get the MenuItem reference
		menu.add(Menu.NONE,ID_MENU_EXIT,Menu.NONE,R.string.exitOption);
		
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	//check selected menu item
    	if(item.getItemId() == ID_MENU_EXIT)
    	{
    		//close the Activity
    		this.finish();
    		return true;
    	}
    	return false;
    }
}
