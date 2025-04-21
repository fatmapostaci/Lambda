package LambdaExpressions.j33lambda;

public class C13University {
    private String Universite;
    private String bolum;
    private int ogrcSayisi;
    private double notOrt;

    public C13University(String universite, String bolum, int ogrcSayisi, double notOrt) {
        Universite = universite;
        this.bolum = bolum;
        this.ogrcSayisi = ogrcSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return Universite;
    }

    public void setUniversite(String universite) {
        Universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrcSayisi() {
        return ogrcSayisi;
    }

    public void setOgrcSayisi(int ogrcSayisi) {
        this.ogrcSayisi = ogrcSayisi;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return
                "Universite='" + Universite + '\'' +
                "bolum='" + bolum + '\'' +
                "ogrcSayisi=" + ogrcSayisi +
                "notOrt=" + notOrt ;
    }
}
