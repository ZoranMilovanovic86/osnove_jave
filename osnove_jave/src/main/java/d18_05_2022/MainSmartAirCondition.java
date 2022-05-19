package d18_05_2022;

public class MainSmartAirCondition {
    public static void main(String[] args) {
        SmartAirCondition prva = new SmartAirCondition();
        prva.marka = "TCL";
        prva.temperatura = 22;
        prva.mod = true;

        SmartAirCondition druga = new SmartAirCondition();
        druga.marka = "Samsung";
        druga.temperatura = 18;
        druga.mod = false;

        SmartAirCondition treca = new SmartAirCondition();
        treca.marka = "Vox";
        treca.temperatura = 31;
        treca.mod = true;

        prva.stamparija(prva.marka, prva.temperatura, prva.mod);
        druga.stamparija(druga.marka, druga.temperatura, druga.mod);
        treca.stamparija(treca.marka, treca.temperatura, treca.mod);
    }





}
