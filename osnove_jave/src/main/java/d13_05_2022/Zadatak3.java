package d13_05_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne u nosi ih korisnik) a zatim se od korisnika
//ucitava pozicija elementa koji zeli da izbaci iz niza. Pre i nakon izbacivanja ispisati niz na ekranu.
//Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomBroj = random.nextInt(10);
            nizBrojeva.add(randomBroj);
        }
        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i));
            if (i < nizBrojeva.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Unesite poziciju za izbacivanje: ");
        int pozicija = s.nextInt();
        if (pozicija < 0 || pozicija > nizBrojeva.size() - 1) {
            System.out.print("Uneli ste nevalidnu poziciju!");
        } else {
            nizBrojeva.remove(pozicija);
            for (int i = 0; i < nizBrojeva.size(); i++) {
                System.out.print(nizBrojeva.get(i));
                if (i < nizBrojeva.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}