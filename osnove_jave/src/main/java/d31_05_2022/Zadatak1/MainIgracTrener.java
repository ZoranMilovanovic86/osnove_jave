package d31_05_2022.Zadatak1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MainIgracTrener {
    public static void main(String[] args) {


        Igrac vlada = new Igrac("Vlada Min", "231231237754",
                1989, 11, "Golman", true);
        vlada.print();

        Igrac zoran = new Igrac("Zoran Mil", "271298655774",
                1992, 7, "Napadac", false);
        zoran.print();

        Trener milan = new Trener("Milan Jov", "20059952133",
                1995, 9, "Za igru");
        milan.print();
        Trener milena = new Trener("Milena Iv", "13139862133",
                1986, 15, "Kondicioni");
        milan.print();


        ArrayList<Igrac> listaIgraca = new ArrayList<>();
        ArrayList<Trener> listaTrenera = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj koliko igraca zelite da napravite: ");
        int brojIgraca = s.nextInt();
        for (int i = 0; i < brojIgraca; i++) {
            int redIgraca = i + 1;
            System.out.print("Unesite puno ime za " + redIgraca + ". igraca: ");
            String punoIme = s.next();
            System.out.print("Unesite igracev jmbg: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja: ");
            int godRodjenja = s.nextInt();
            System.out.print("Unesite broj dresa: ");
            int brDresa = s.nextInt();
            System.out.print("Unesite poziciju: ");
            String pozicijaKojuIgra = s.next();
            System.out.print("Unesite da li je kapiten: ");
            boolean kapiten = s.nextBoolean();
            Igrac x = new Igrac(punoIme, jmbg, godRodjenja, brDresa, pozicijaKojuIgra, kapiten);
            listaIgraca.add(x);
        }
        System.out.print("Unesite broj koliko trenera zelite da napravite: ");
        int brojTrenera = s.nextInt();
        for (int i = 0; i < brojTrenera; i++) {
            int redTrenera = i + 1;
            System.out.print("Unesite puno ime za " + redTrenera + ". trenera: ");
            String punoIme = s.next();
            System.out.print("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja: ");
            int godRodjenja = s.nextInt();
            System.out.print("Unesite godina iskustva: ");
            int godIskustva = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tipTrenera = s.next();
            Trener x = new Trener(punoIme, jmbg, godRodjenja, godIskustva, tipTrenera);
            listaTrenera.add(x);

        }

        for (int i = 0; i < listaIgraca.size(); i++) {
            listaIgraca.get(i).print();
        }
        for (int i = 0; i < listaTrenera.size(); i++) {
            listaTrenera.get(i).print();
        }
    }
}