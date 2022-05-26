package d23_05_2022;

public class Autor {
    private String punoIme;


    public Autor() {
    }

    public Autor(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
    public void print() {
        System.out.println(this.punoIme);
    }
}
