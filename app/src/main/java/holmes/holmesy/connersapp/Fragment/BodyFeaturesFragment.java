package holmes.holmesy.connersapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import holmes.holmesy.connersapp.Adapter.RecyclerViewAdapter;
import holmes.holmesy.connersapp.R;

import static holmes.holmesy.connersapp.Domain.Features.features;


/**
 * A simple {@link Fragment} subclass.
 */
public class BodyFeaturesFragment extends Fragment {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter adapter;
    public BodyFeaturesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_shapes, container, false);

        String [] featureList = new String [features.length];
        for (int i = 0; i < features.length; i++){
            featureList[i] = features[i].getFeautre();
        }

        int [] image = new int[features.length];
        for (int i = 0; i <features.length ; i++) {
            image[i] = features[i].getImage();
        }

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(featureList, image);
        recyclerView.setAdapter(adapter);



        return recyclerView;

    }

}
