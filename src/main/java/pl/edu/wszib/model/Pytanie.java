package pl.edu.wszib.model;

public class Pytanie {
    private int idPytania;
    private int Nagroda;
    private String Pytanie;
    private String A;
    private String B;
    private String C;
    private String D;
    private String PrawidlowaOdpowiedz;

    public Pytanie() {
    }

    public int getIdPytania() {
        return idPytania;
    }

    public void setIdPytania(int idPytania) {
        this.idPytania = idPytania;
    }

    public int getNagroda() {
        return Nagroda;
    }

    public void setNagroda(int nagroda) {
        Nagroda = nagroda;
    }

    public String getPytanie() {
        return Pytanie;
    }

    public void setPytanie(String pytanie) {
        Pytanie = pytanie;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getPrawidlowaOdpowiedz() {
        return PrawidlowaOdpowiedz;
    }

    public void setPrawidlowaOdpowiedz(String prawidlowaOdpowiedz) {
        PrawidlowaOdpowiedz = prawidlowaOdpowiedz;
    }

    @Override
    public String toString() {
        return "Pytanie{" +
                "idPytania=" + idPytania +
                ", Nagroda=" + Nagroda +
                ", Pytanie='" + Pytanie + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                ", PrawidlowaOdpowiedz='" + PrawidlowaOdpowiedz + '\'' +
                '}';
    }
}
