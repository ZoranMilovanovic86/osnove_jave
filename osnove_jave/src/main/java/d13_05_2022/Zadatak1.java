package d13_05_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti
// ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad, ispod,
// sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
        for (int i = 0; i < 25; i++) {
            Random random = new Random();
            int randomBroj = random.nextInt(10);
            nizBrojeva.add(randomBroj);
        }

        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.print("Unesite poziciju (od 0 do 24): ");
        int pozicija = s.nextInt();
        int suma = nizBrojeva.get(pozicija);

        if (pozicija % 5 != 0) {
            suma = suma + nizBrojeva.get(pozicija - 1);
        }
        if (pozicija % 5 != 4) {
            suma = suma + nizBrojeva.get(pozicija + 1);
        }
        if (pozicija > 4) {
            suma = suma + nizBrojeva.get(pozicija - 5);
        }
        if (pozicija < 20) {
            suma = suma + nizBrojeva.get(pozicija + 5);
        }
        System.out.print("Suma je " + suma);
    }
}