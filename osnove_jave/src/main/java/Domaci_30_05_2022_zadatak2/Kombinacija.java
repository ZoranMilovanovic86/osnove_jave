package Domaci_30_05_2022_zadatak2;

import java.util.ArrayList;

public class Kombinacija {
    private String idKombinacije;
    private ArrayList<Integer> nizUJednojKombinaciji = new ArrayList<>();
    private int broj1;
    private int broj2;
    private int broj3;
    private int broj4;
    private int broj5;
    private int broj6;
    private int broj7;

    public Kombinacija(String idKombinacije, int broj1,
                       int broj2, int broj3, int broj4,
                       int broj5, int broj6, int broj7) {
        this.idKombinacije = idKombinacije;
        this.nizUJednojKombinaciji.add(broj1);
        this.nizUJednojKombinaciji.add(broj2);
        this.nizUJednojKombinaciji.add(broj3);
        this.nizUJednojKombinaciji.add(broj4);
        this.nizUJednojKombinaciji.add(broj5);
        this.nizUJednojKombinaciji.add(broj6);
        this.nizUJednojKombinaciji.add(broj7);
    }

    public String getIdKombinacije() {
        return idKombinacije;
    }

    public int getBroj1() {
        return broj1;
    }

    public int getBroj2() {
        return broj2;
    }

    public int getBroj3() {
        return broj3;
    }

    public int getBroj4() {
        return broj4;
    }

    public int getBroj5() {
        return broj5;
    }

    public int getBroj6() {
        return broj6;
    }

    public int getBroj7() {
        return broj7;
    }

    public boolean DaLiJeIstaKombinacija(Kombinacija k) {
        int counter = 0;
        for (int i = 0; i < this.nizUJednojKombinaciji.size(); i++) {
            if (this.nizUJednojKombinaciji.get(i) == k.nizUJednojKombinaciji.get(i)) {
                counter++;
            }
        }
        return counter == 7;
    }

    public void print() {
        System.out.println("ID Kombinacije: " + this.idKombinacije);
        System.out.print("Brojevi: ");
        for (int i = 0; i < this.nizUJednojKombinaciji.size() ; i++) {
            System.out.print(this.nizUJednojKombinaciji.get(i));
            if (i < this.nizUJednojKombinaciji.size() - 1)
                System.out.print(", ");

        } System.out.println();
    }
}
