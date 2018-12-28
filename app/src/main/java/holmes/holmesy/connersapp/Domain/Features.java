package holmes.holmesy.connersapp.Domain;

import holmes.holmesy.connersapp.R;

public class Features {


    private String feautre;
    private int image;


public static final Features [] features = {

  new Features("Nose", R.drawable.nose),
  new Features("Eyes", R.drawable.eyes),
  new Features("Ear", R.drawable.ear),
  new Features("Hands", R.drawable.hands),
  new Features("Knees", R.drawable.knees),
  new Features("Feet", R.drawable.feet),
  new Features("Toes", R.drawable.toes)

};

    public Features(String feautre, int image) {
        this.feautre = feautre;
        this.image = image;
    }
    public String getFeautre() {
        return feautre;
    }

    public void setFeautre(String feautre) {
        this.feautre = feautre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }



}
