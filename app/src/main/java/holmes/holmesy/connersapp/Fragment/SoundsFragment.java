package holmes.holmesy.connersapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import holmes.holmesy.connersapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SoundsFragment extends Fragment {


    public SoundsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sounds, container, false);
    }

}
