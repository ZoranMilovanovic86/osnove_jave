package Domaci_30_05_2022_zadatak1;

import java.util.ArrayList;

public class Student {
    private String brIndex;
    private String punoIme;
    private String tipStudia;
    private ArrayList<Ispit> ispiti = new ArrayList<>();


    public Student() {
    }

    public Student(String brIndex, String punoIme, String tipStudia) {
        this.brIndex = brIndex;
        this.punoIme = punoIme;
        this.tipStudia = tipStudia;
    }

    public String getBrIndex() {
        return this.brIndex;
    }

    public void setBrIndex(String brIndex) {
        this.brIndex = brIndex;
    }

    public String getPunoIme() {
        return this.punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudia() {
        return this.tipStudia;
    }

    public void setTipStudia(String tipStudia) {
        this.tipStudia = tipStudia;
    }

    public ArrayList<Ispit> getIspiti() {
        return this.ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    private double prosekNaStudijama() {
        double suma = 0;
        int counter = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).daLiJeIspitPolozen()) {
                suma = suma + this.ispiti.get(i).getOcena();
                    counter++;
            }
        }
        return suma / counter;
    }

    public void print() {
        System.out.println(this.brIndex + " - " + this.punoIme + " - " + this.tipStudia);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size() ; i++) {
            this.ispiti.get(i).print();

        }
        System.out.println("Prosecna ocena: " + prosekNaStudijama());
    }
}
