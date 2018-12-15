package holmes.holmesy.connersapp.Domain;

import holmes.holmesy.connersapp.R;

public class Animals {

    private String animal;
    private int image;



    public static final Animals[] animals = {
            new Animals("Dog", R.drawable.dog),
            new Animals("Cat", R.drawable.cat),
            new Animals("Fish", R.drawable.fish),
            new Animals("Tiger", R.drawable.tiger),
            new Animals("Lion", R.drawable.lion)
    };





    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Animals(String animal, int image) {
        this.animal = animal;
        this.image = image;
    }










}
