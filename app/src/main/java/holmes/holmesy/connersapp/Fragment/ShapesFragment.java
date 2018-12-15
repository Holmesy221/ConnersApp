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

import static holmes.holmesy.connersapp.Domain.Shapes.shapes;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShapesFragment extends Fragment {


    public ShapesFragment() {
        // Required empty public constructor
    }


    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_shapes,
                container, false);


        String [] shapeList = new String[shapes.length];
        for (int i = 0; i <shapes.length; i++){
            shapeList[i] = shapes[i].getShape();
        }

        int[] shapeImage = new int[shapes.length];
        for (int i=0; i<shapes.length; i++){
            shapeImage[i] = shapes[i].getImage();
        }

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(shapeList, shapeImage);
        recyclerView.setAdapter(recyclerViewAdapter);





        return recyclerView;
    }

}
