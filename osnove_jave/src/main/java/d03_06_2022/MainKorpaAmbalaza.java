package d03_06_2022;

public class MainKorpaAmbalaza {
    public static void main(String[] args) {
        Korpa korpa = new Korpa();
        Tetrapak t = new Tetrapak("2323-32332-221-12", "Jogurt", 998,
                1020, true, 149.99);
        Tetrapak t2 = new Tetrapak("8878787-5454-2251", "Mleko", 998,
                1012, false, 89.99);
        StaklenaAmbalaza s = new StaklenaAmbalaza("123213-3123-21-112", "Sok od maline",
                1000, 1460, 200, false, 299.99);
        StaklenaAmbalaza s2 = new StaklenaAmbalaza("5445574-547-48545", "Gajba piva",
                10000, 17000, 1000, true, 1299.99);
        SuperKartica sk = new SuperKartica("23223/22", "Pera Peric", 0);

        korpa.dodajAmbalazu(t);
        korpa.dodajAmbalazu(t2);
        korpa.dodajAmbalazu(s);
        korpa.dodajAmbalazu(s2);

        t.print();
        t2.print();
        s.print();
        s2.print();
        sk.print();

        System.out.println(korpa.cenaKorpe(sk));



    }
}
