package co.razoredge.shop;

import co.razoredge.shop.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.view.View.*;
import android.content.*;
import android.net.*;
import android.view.*;

public class ShopFragment extends Fragment {
	
	
	private static final String INSTAGRAM = "http://i.instagram.com/razorsedge_co/";
    private static final String MAP = "http://goo.gl/maps/Fq6F2";
    private static final String GOOGLE = "https://plus.google.com/+RazorsEdgeBarbershopJacksonville";
    private static final String FACEBOOK = "https://www.facebook.com/pages/Razors-Edge-Barbershop/179641895580413";

    public ShopFragment() {
        // empty fragment constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_shop, container, false);

        root.findViewById(R.id.facebookButton).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// Been working all day on this. Staying with it. sloppy I know.
					try {
						launchUrl(FACEBOOK);
					} catch (ActivityNotFoundException failToMarket) {
						launchUrl(FACEBOOK);
					}

				}
			});

        root.findViewById(R.id.googleButton).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					
					try {
						launchUrl((GOOGLE));
					} catch (ActivityNotFoundException failToMarket) {
						launchUrl(GOOGLE);
					}

				}
			});
			
		root.findViewById(R.id.mapButton).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					
					try {
						launchUrl((MAP));
					} catch (ActivityNotFoundException failToMarket) {
						launchUrl(MAP);
					}

				}
			});
			
		root.findViewById(R.id.instagramButton).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					try {
						launchUrl((INSTAGRAM));
					} catch (ActivityNotFoundException failToMarket) {
						launchUrl(INSTAGRAM);
					}

				}
			});

        return root;
    }

    private void launchUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent website = new Intent(Intent.ACTION_VIEW, uriUrl);
        getActivity().startActivity(website);
    }

    

}

		
