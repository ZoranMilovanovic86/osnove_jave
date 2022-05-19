package d18_05_2022;

public class SmartAirCondition {
    public String marka;
    public int temperatura;
    public boolean mod;

    public void stamparija(String marka, int temp, boolean mod) {
        System.out.print("Marka klime: " + marka + " setovana temperatura: " + temp + "C " + "mod rada: ");
        if (mod) {
            System.out.println("na grejanju");
        } else {
            System.out.println("na hladjenju");
        }

    }
}
