package d19_05_2022;

import d18_05_2022.SmartAirCondition;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning gree = new SmartAirConditioning();
        gree.brend = "Gree";
        gree.potrosnjaNaHladjenju = 0.860;
        gree.potrosnjaNaGrejanju = 1.113;
        gree.setovanaTemp = 26;
        gree.mod = "greje";

        SmartAirConditioning tcl = new SmartAirConditioning();
        tcl.brend = "TCL";
        tcl.potrosnjaNaHladjenju = 0.44;
        tcl.potrosnjaNaGrejanju = 0.95;
        tcl.setovanaTemp = 21;
        tcl.mod = "hladi";

        gree.stampa();
        System.out.println("Mesecna potrosnja: " + gree.mesecnaPotrosnjaEnergije() + " kW");
        System.out.println("Cena na mesecnom nivou: " + gree.potrosnjaUNovcu() + " din");

        System.out.println();

        tcl.stampa();
        System.out.println("Mesecna potrosnja: " + tcl.mesecnaPotrosnjaEnergije() + " kW");
        System.out.println("Cena na mesecnom nivou: " + tcl.potrosnjaUNovcu() + " din");
    }
}
