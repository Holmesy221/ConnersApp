package holmes.holmesy.connersapp.Domain;

import holmes.holmesy.connersapp.R;

public class Shapes {


    private String shape;
    private int image;



    public Shapes(String shape, int image) {
        this.shape = shape;
        this.image = image;
    }




    public static final Shapes[] shapes = {
            new Shapes("Star", R.drawable.star),
            new Shapes("Triangle",R.drawable.triangle),
            new Shapes("Circle", R.drawable.circle),
            new Shapes("Square", R.drawable.square)


    };







    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }








}
