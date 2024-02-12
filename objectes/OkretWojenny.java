public class OkretWojenny {

    private String klasaOkretu;
    private String nazwaOkretu;
    private int atak;
    private int opancerzenie;

    public OkretWojenny() {
        this("Szybki Niszczyciel");
    }

    public OkretWojenny(String nazwaNiszczyciela) {
        this("niszczyciel", nazwaNiszczyciela, 1, 1);
    }

    public OkretWojenny(String klasaOkretu,
            String nazwaOkretu,
            int atak,
            int opancerzenie) {
        this.nazwaOkretu = nazwaOkretu;
        this.klasaOkretu = klasaOkretu;
        this.atak = atak;
        this.opancerzenie = opancerzenie;
    }

    public String getKlasaOkretu() {
        return klasaOkretu;
    }

    public void setKlasaOkretu(String value) {
        nazwaOkretu = value;
    }

    public String getNazwaOkretu() {
        return nazwaOkretu;
    }

    public void setNazwaOkretu(String nazwaOkretu) {
        this.nazwaOkretu = nazwaOkretu;
    }

    public int getAtak() {
        return atak;
    }

    public void setAtak(int atak) {
        this.atak = atak;
    }

    public int getOpancerzenie() {
        return opancerzenie;
    }

    public void setOpancerzenie(int opancerzenie) {
        this.opancerzenie = opancerzenie;
    }

}
