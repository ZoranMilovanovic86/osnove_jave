package d24_05_2022;

public class MainRinglaElSporet {
    public static void main(String[] args) {
        Ringla obicnaMala = new Ringla("obicna", 0.8);
        Ringla obicnaVelika = new Ringla("obicna", 1.6);
        Ringla ekspresMala = new Ringla("ekspres", 1.2);
        Ringla ekspresVelika = new Ringla("ekspres", 2.5);

        ElektricniSporet gorenje = new ElektricniSporet("gorenje", 2,
                2, obicnaMala, obicnaVelika, ekspresMala, ekspresVelika);

        gorenje.pojacajRinglu(1);
        gorenje.pojacajRinglu(2);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(3);
        gorenje.pojacajRinglu(2);
        gorenje.pojacajRinglu(2);
        gorenje.pojacajRinglu(2);
        gorenje.pojacajRinglu(2);
        gorenje.pojacajRinglu(2);
        gorenje.pojacajRinglu(4);

        obicnaMala.print();
        System.out.println();

        obicnaVelika.print();
        System.out.println();

        ekspresMala.print();
        System.out.println();
        ekspresVelika.print();

        gorenje.iskljuciRinglu(1);

        System.out.println(gorenje.potrosnjaSporeta(1));
    }
}
