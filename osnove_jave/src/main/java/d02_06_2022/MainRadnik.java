package d02_06_2022;

public class MainRadnik {
    public static void main(String[] args) {
        Sektor administracija = new Sektor("Administracijski", 50000);
        Sektor finansije = new Sektor("Finansijski", 80000);
        Sektor pravni = new Sektor("Pravni", 60000);
        Sektor fizikalija = new Sektor("Tupa Radna Snaga", 37000);

        Menadzer milena = new Menadzer("Milena Djordjevic");
        milena.zaposliUSektor(administracija);
        milena.zaposliUSektor(finansije);
        milena.zaposliUSektor(pravni);

        Magacioner zoran = new Magacioner("Zoran Milovanovic");
        zoran.zaposliUSektor(fizikalija);
        zoran.zaposliUSektor(finansije);
        zoran.zaposliUSektor(administracija);

        System.out.println(milena.plataRadnika());

        System.out.println(zoran.plataRadnika());




    }
}
