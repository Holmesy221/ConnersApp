package holmes.holmesy.connersapp.Domain;

import holmes.holmesy.connersapp.R;

public class Characters {



    private int image;
    private String name;



    public static final Characters [] chars = {
           new Characters("Mr Tumble", R.drawable.mr_tumble),
            new Characters("Go Jetters", R.drawable.go_jetters),
            new Characters("Iggle Piggle", R.drawable.iggle_piggle),
            new Characters("Makka Pakka", R.drawable.makka_pakka),
           // new Characters("Kermit", R.drawable.kermit),
            new Characters("Wookie", R.drawable.wookie)
    };


    public Characters(String name, int image){
        this.name = name;
        this.image = image;
    }




    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
