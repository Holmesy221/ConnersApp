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

import static holmes.holmesy.connersapp.Domain.Characters.chars;


/**
 * A simple {@link Fragment} subclass.
 */
public class CharactersFragment extends Fragment {


    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    public CharactersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        recyclerView =  (RecyclerView) inflater.inflate(R.layout.fragment_shapes, container, false);


        String[] charsList = new String[chars.length];
        for (int i = 0; i <chars.length; i++) {
            charsList[i] = chars[i].getName();
        }

        int[] charsImage = new int[chars.length];
        for (int i = 0; i <chars.length ; i++) {
            charsImage[i] = chars[i].getImage();
        }


        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(charsList, charsImage);
        recyclerView.setAdapter(adapter);




        return recyclerView;










    }

}
