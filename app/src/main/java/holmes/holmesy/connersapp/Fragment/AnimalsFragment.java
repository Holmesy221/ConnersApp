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

import static holmes.holmesy.connersapp.Domain.Animals.animals;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalsFragment extends Fragment {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter adapter;

    public AnimalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        recyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_shapes,
                container, false);


        String [] animalsList = new String[animals.length];
        for (int i = 0; i < animals.length; i++){
            animalsList[i] = animals[i].getAnimal();
        }

        int [] animalImage = new int[animals.length];
        for (int i = 0; i < animals.length; i++) {
            animalImage[i] = animals[i].getImage();
        }


        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(animalsList, animalImage);
        recyclerView.setAdapter(adapter);

        return  recyclerView;
    }

}
