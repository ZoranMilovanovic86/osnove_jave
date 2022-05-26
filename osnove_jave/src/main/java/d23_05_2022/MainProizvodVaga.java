package d23_05_2022;

public class MainProizvodVaga {
    public static void main(String[] args) {
        Proizvod secer = new Proizvod("123",
                "Secer", 100);
        Vaga kg = new Vaga();
        kg.setMernaJedinica("kg");
        kg.setProizvod(secer);
        kg.print(1.5);

        System.out.println();

        Vaga lb = new Vaga();
        lb.setMernaJedinica("lb");
        lb.setProizvod(secer);
        lb.print(8.45);

    }
}
