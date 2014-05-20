package co.razoredge.shop.adapter;

import co.razoredge.shop.ShopFragment;
import co.razoredge.shop.AboutFragment;
import co.razoredge.shop.GalleryFragment;
import co.razoredge.shop.ContactFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Shop fragment activity
			return new ShopFragment();
		case 1:
			// About fragment activity
			return new AboutFragment();
		case 2:
			// Gallery fragment activity
			return new GalleryFragment();
                case 3:
	   		// Contact fragment activity
			return new ContactFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4;
	}

}
