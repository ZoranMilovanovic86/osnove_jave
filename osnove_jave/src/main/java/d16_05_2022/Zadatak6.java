package d16_05_2022;

//Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

public class Zadatak6 {
    public static void main(String[] args) {
        int najmanji = najmanjiBroj(5,4,-8);

        System.out.println("Najmanji broj je " + najmanji);


    }

 static int najmanjiBroj(int a, int b, int c) {
        int malisa;
        if (a < b) {
            malisa = a;
        } else {
            malisa = b;
        }
        if (malisa < c) {
            return malisa;
        } else {
            return c;
        }



  }

}