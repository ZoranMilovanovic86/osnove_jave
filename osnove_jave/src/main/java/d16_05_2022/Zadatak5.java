package d16_05_2022;

//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 6 7 8 9
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -4 -3 -2 -1 0
//
//Napomena: Resiti bez koriscenja petlji.

public class Zadatak5 {
    public static void main(String[] args) {
    int broja = brojevaIzmedju(5, 18);
        System.out.println("Brojeva izmedju ima: " + broja);

    }

    static int brojevaIzmedju(int a, int b) {
        int x;
        if (a < b) {
            x = b - a - 1;
        } else if (a > b) {
            x = a - b - 1;
        } else {
            x = a - b;
        }
        return x;

    }

}