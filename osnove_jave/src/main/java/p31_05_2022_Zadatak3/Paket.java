package p31_05_2022_Zadatak3;

public class Paket {
    protected String nazivPaketa;
    protected String punoImeKorisnika;
    protected double mesecnaCena;
    protected int ugovornaObaveza;
    protected double internetDL;
    protected double internetUL;

    public Paket(String nazivPaketa, String punoImeKorisnika, double mesecnaCena,
                 int ugovornaObaveza, double internetDL, double internetUL) {
        this.nazivPaketa = nazivPaketa;
        this.punoImeKorisnika = punoImeKorisnika;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.internetDL = internetDL;
        this.internetUL = internetUL;
    }

    public String getNazivPaketa() {
        return nazivPaketa;
    }

    public String getPunoImeKorisnika() {
        return punoImeKorisnika;
    }

    public double getMesecnaCena() {
        return mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public double getInternetDL() {
        return internetDL;
    }

    public double getInternetUL() {
        return internetUL;
    }

    public void setPunoImeKorisnika(String punoImeKorisnika) {
        this.punoImeKorisnika = punoImeKorisnika;
    }

    public void setMesecnaCena(double mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public void produziUgovor() {
        this.ugovornaObaveza = this.ugovornaObaveza + 12;
    }

    public int brojMeseciPoDinar() {
        return 0;
    }

    public void print() {
        System.out.println(this.punoImeKorisnika);
        System.out.println(this.nazivPaketa + " - brzina: " + internetDL + "/" + internetUL + "Mbps" + " - " + ugovornaObaveza + " meseci");
        System.out.print(this.mesecnaCena + "rsd");
    }


}
