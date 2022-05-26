package d24_05_2022;

import java.util.ArrayList;

public class MainZeleniKarton {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> nizZelenihKartona = new ArrayList<ZeleniKarton>();
        ZeleniKarton ispit1 = new ZeleniKarton("Manuelno testiranje",
                "Radmila Rada", 6);
        nizZelenihKartona.add(ispit1);
        ZeleniKarton ispit2 = new ZeleniKarton("Automatsko testiranje",
                "Aleksandra Saska", 7);
        nizZelenihKartona.add(ispit2);
        ZeleniKarton ispit3 = new ZeleniKarton("CRUD SQL",
                "Milan Milancic", 8);
        nizZelenihKartona.add(ispit3);
        ZeleniKarton ispit4 = new ZeleniKarton("Uvod u JAVA PJ",
                "Vladmir Petronije", 9);
        nizZelenihKartona.add(ispit4);
        ZeleniKarton ispit5 = new ZeleniKarton("Uvod u JAVA PJ 2",
                "Vladmir Petronije", 8);
        nizZelenihKartona.add(ispit5);
        ZeleniKarton ispit6 = new ZeleniKarton("Uvod u OOP",
                "Milena Milenovic", 6);
        nizZelenihKartona.add(ispit6);
        ZeleniKarton ispit7 = new ZeleniKarton("Uvod u OOP 2",
                "Vlada Vladic", 5);
        nizZelenihKartona.add(ispit7);
        ZeleniKarton ispit8 = new ZeleniKarton("Uvod u Selenium",
                "Mladen Mladenovic", 10);
        nizZelenihKartona.add(ispit8);
        ZeleniKarton ispit9 = new ZeleniKarton("Git i Github",
                "Toza Nervoza", 9);
        nizZelenihKartona.add(ispit9);
        ZeleniKarton ispit10 = new ZeleniKarton("Postman",
                "Milan Milancic", 8);
        nizZelenihKartona.add(ispit10);

        for (int i = 0; i < nizZelenihKartona.size(); i++) {
            nizZelenihKartona.get(i).print();
            System.out.println();
        }
        // za vezbanje
        double suma = 0;
        for (int i = 0; i < nizZelenihKartona.size(); i++) {
            suma = suma + nizZelenihKartona.get(i).getOcena();
        }
        System.out.println("Prosecna ocena: " + suma / nizZelenihKartona.size());

        // za vezbanje
        double suma2 = 0;
        int brPolozenihIspita = 0;
        for (int i = 0; i < nizZelenihKartona.size(); i++) {
            if (nizZelenihKartona.get(i).daLiJeIspitPolozen()) {
                brPolozenihIspita++;
                suma2 = suma2 + nizZelenihKartona.get(i).getOcena();
            }

        }
        System.out.println("Prosecna ocena polozenih ispita je: " + suma2 / brPolozenihIspita);
    }
}