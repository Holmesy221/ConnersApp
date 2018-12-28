package holmes.holmesy.connersapp.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import holmes.holmesy.connersapp.Fragment.AnimalsFragment;
import holmes.holmesy.connersapp.Fragment.CharactersFragment;
import holmes.holmesy.connersapp.Fragment.ShapesFragment;

import holmes.holmesy.connersapp.Fragment.BodyFeaturesFragment;
import holmes.holmesy.connersapp.R;

public class PageAdapter extends FragmentPagerAdapter {

    Context context;
    public PageAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CharactersFragment();
            case 1:
                return new ShapesFragment();
            case 2:
                return new AnimalsFragment();
            case 3:
                return new BodyFeaturesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }



    @Override
    public CharSequence getPageTitle(int pos){
        switch (pos){
            case 0:
                return context.getString(R.string.colours_fragment);

            case 1:
                return context.getString(R.string.shapes_fragment);

            case 2:
                return context.getString(R.string.animals_fragment);
            case 3:
                return context.getString(R.string.sounds_fragment);

            default:
                return null;
        }
    }





}
