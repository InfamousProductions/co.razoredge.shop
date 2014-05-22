package co.razoredge.shop;

import android.app.*;
import android.os.*;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;
import co.razoredge.shop.*;
import co.razoredge.shop.Services;

import android.support.v4.app.Fragment;
import android.view.View.*;
import android.content.*;
import android.net.*;
import android.sax.*;

public class AboutFragment extends Fragment {

	
	private static final String PRICE2 = "http://www.razoredge.co/our-services.html";
	

    public AboutFragment() {
        // empty fragment constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_about, container, false);

        root.findViewById(R.id.buttonShowPopUp).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// Been working all day on this. Staying with it. sloppy I know.
					try {
						Intent intent = new Intent(getActivity(), Services.class);
						startActivity(intent);
					} catch (ActivityNotFoundException failToMarket) {
						launchUrl(PRICE2);
					}

				}
			}
		);
	return root;
	}
			
			
	private void launchUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent website = new Intent(Intent.ACTION_VIEW, uriUrl);
        getActivity().startActivity(website);
    }
		
	

}
