package camp.bso.inf.scoringapps;

/**
 * Created by Nikko Eka Saputra on 01/02/2018.
 */

public class Pertandingan {

    private String timSatu;
    private String timDua;
    private int logoTimSatu;
    private int logoTimDua;

    public Pertandingan(String timSatu, String timDua, int logoTimSatu, int logoTimDua) {
        this.timSatu = timSatu;
        this.timDua = timDua;
        this.logoTimSatu = logoTimSatu;
        this.logoTimDua = logoTimDua;
    }

    public String getTimSatu() {
        return timSatu;
    }

    public String getTimDua() {
        return timDua;
    }

    public int getLogoTimSatu() {
        return logoTimSatu;
    }

    public int getLogoTimDua() {
        return logoTimDua;
    }

}
