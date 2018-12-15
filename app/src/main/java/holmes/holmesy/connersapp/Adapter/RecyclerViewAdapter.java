package holmes.holmesy.connersapp.Adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import holmes.holmesy.connersapp.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private String [] name;
    private int[] image;
    private TextView textView;
    private ImageView imageView;
    Drawable drawable;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }

        public RecyclerViewAdapter(String[] name, int[] image) {
            this.image = image;
            this.name = name;
        }


    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view,parent,false);

        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        imageView = cardView.findViewById(R.id.image);
        drawable = ContextCompat.getDrawable(cardView.getContext(),image[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(name[position]);

        textView = cardView.findViewById(R.id.info_text);
        textView.setText(name[position]);
    }



    @Override
    public int getItemCount() {
        return name.length;
    }
}
