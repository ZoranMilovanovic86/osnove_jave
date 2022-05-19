package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();
        prvi.nazivProizvoda = "Slanina";
        prvi.cenaProizvoda = 1199.99;
        prvi.tezinaProizvoda = 364.45;

        Proizvod drugi = new Proizvod();
        drugi.nazivProizvoda = "Keks";
        drugi.cenaProizvoda = 49.99;
        drugi.tezinaProizvoda = 330.55;


        Proizvod treci = new Proizvod();
        treci.nazivProizvoda = "Secer";
        treci.cenaProizvoda = 99.99;
        treci.tezinaProizvoda = 420.15;

       prvi.stampaj(prvi.nazivProizvoda, prvi.cenaProizvoda, prvi.tezinaProizvoda);
       drugi.stampaj(drugi.nazivProizvoda, drugi.cenaProizvoda, drugi.tezinaProizvoda);
       treci.stampaj(treci.nazivProizvoda, treci.cenaProizvoda, treci.tezinaProizvoda);


    }
}
