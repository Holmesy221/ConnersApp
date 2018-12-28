package holmes.holmesy.connersapp.Domain;

public class Features {


    private String feautre;
    private int image;











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
