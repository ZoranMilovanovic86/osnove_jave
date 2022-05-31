package Domaci_30_05_2022_zadatak1;

public class MainStudentIspit {
    public static void main(String[] args) {
        Ispit java = new Ispit("Java OOP", 7, "Milan Jov");
        Ispit sql = new Ispit("CRUD SQL", 6, "Vlada Min");
        Ispit manuelno = new Ispit();
        manuelno.setNazivPredmeta("Manuelno testiranje");
        manuelno.setOcena(8);
        manuelno.setPunoImeProfesora("Rada Rad");
        Ispit projekat = new Ispit("Mini projekat", 5, "Aleksandra Ale");


        Student zoran = new Student("32/2022", "Zoran Mil", "master");
        zoran.dodajIspit(java);
        zoran.dodajIspit(sql);
        zoran.dodajIspit(manuelno);
        zoran.dodajIspit(projekat);
        zoran.print();


    }
}
