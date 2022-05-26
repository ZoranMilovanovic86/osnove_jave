package d24_05_2022;

public class ZeleniKarton {
    private String punoImeStudent;
    private String brIndex;
    private String nazivPredmeta;
    private String punoImeProfesro;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String nazivPredmeta,
                        String punoImeProfesro,
                        int ocena) {
        this.punoImeStudent = "Student Zoran";
        this.brIndex = "32/22";
        this.nazivPredmeta = nazivPredmeta;
        this.punoImeProfesro = punoImeProfesro;
        this.ocena = ocena;
    }

    public String getPunoImeStudent() {
        return punoImeStudent;
    }

    public void setPunoImeStudent(String punoImeStudent) {
        this.punoImeStudent = punoImeStudent;
    }

    public String getBrIndex() {
        return brIndex;
    }

    public void setBrIndex(String brIndex) {
        this.brIndex = brIndex;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getPunoImeProfesro() {
        return punoImeProfesro;
    }

    public void setPunoImeProfesro(String punoImeProfesro) {
        this.punoImeProfesro = punoImeProfesro;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean daLiJeIspitPolozen() {
        return this.ocena > 5;
    }
    public void print() {
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.punoImeStudent);
        System.out.println("Profesor: " + this.punoImeProfesro);
    }
}
