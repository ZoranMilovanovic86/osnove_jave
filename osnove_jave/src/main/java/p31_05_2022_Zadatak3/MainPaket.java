package p31_05_2022_Zadatak3;

public class MainPaket {
    public static void main(String[] args) {
        EONPaket eonp = new EONPaket("Zoran Mil", 1990, 24);
        eonp.produziUgovor();
        eonp.print();

        DUOPaket eond = new DUOPaket("Ana Muc", 2460, 12, "tablet");
        eond.produziUgovor();
        eond.ubrzajInternet(50);
        eond.print();
    }
}
