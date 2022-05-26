package d24_05_2022;

public class ElektricniSporet {
    private String markaSporeta;
    private int garancija;
    private int maksBrRingliIstovremeno;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    private int counter = 0;


    public ElektricniSporet(String markaSporeta, int garancija, int maksBrRingliIstovremeno,
                            Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.markaSporeta = markaSporeta;
        this.garancija = garancija;
        this.maksBrRingliIstovremeno = maksBrRingliIstovremeno;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarkaSporeta() {
        return markaSporeta;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaksBrRingliIstovremeno() {
        return maksBrRingliIstovremeno;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    public void pojacajRinglu(int pozicija) {

        Ringla x = new Ringla("obicna", 1);
        if (pozicija == 1) {
            x = goreLevo;
        }
        if (pozicija == 2) {
            x = goreDesno;
        }
        if (pozicija == 3) {
            x = doleLevo;
        }
        if (pozicija == 4) {
            x = doleDesno;
        }
        if (counter < this.maksBrRingliIstovremeno || x.daLiJeRinglaUkljucena()) {
            if (pozicija == 1 && !goreLevo.daLiJeRinglaUkljucena()) {
                counter++;
                goreLevo.pojacajRinglu();
            } else if (pozicija == 1 && goreLevo.daLiJeRinglaUkljucena()) {
                goreLevo.pojacajRinglu();
            }
            if (pozicija == 2 && !goreDesno.daLiJeRinglaUkljucena()) {
                counter++;
                goreDesno.pojacajRinglu();
            } else if (pozicija == 2 && goreDesno.daLiJeRinglaUkljucena()) {
                goreDesno.pojacajRinglu();
            }
            if (pozicija == 3 && !doleLevo.daLiJeRinglaUkljucena()) {
                counter++;
                doleLevo.pojacajRinglu();
            } else if (pozicija == 3 && doleLevo.daLiJeRinglaUkljucena()) {
                doleLevo.pojacajRinglu();
            }
            if (pozicija == 4 && !doleDesno.daLiJeRinglaUkljucena()) {
                counter++;
                doleDesno.pojacajRinglu();
            } else if (pozicija == 4 && doleDesno.daLiJeRinglaUkljucena()) {
                doleDesno.pojacajRinglu();
            }
        } else {
            for (int i = 1; i < 5; i++) {
                iskljuciRinglu(i);
                counter = 0;
            }
            x.pojacajRinglu();
            counter++;

        }
    }

    public void iskljuciRinglu(int pozicija) {
        if (pozicija == 1) {
            goreLevo.iskljuciRinglu();
        }
        if (pozicija == 2) {
            goreDesno.iskljuciRinglu();
        }
        if (pozicija == 3) {
            doleLevo.iskljuciRinglu();
        }
        if (pozicija == 4) {
            doleDesno.iskljuciRinglu();
        }
    }
    public double potrosnjaSporeta(double brSati) {
        return this.goreLevo.potrosnjaRingle(brSati) +
                this.goreDesno.potrosnjaRingle(brSati) +
                this.doleLevo.potrosnjaRingle(brSati) +
                this.doleDesno.potrosnjaRingle(brSati);
    }


    public void print() {
        System.out.println(this.markaSporeta + " - " + this.garancija + " god.");
        System.out.println("Ringle: ");
        System.out.println("Gore levo: ");
        this.goreLevo.print();
        System.out.println("Gore desno: ");
        this.goreDesno.print();
        System.out.println("Dole levo: ");
        this.doleLevo.print();
        System.out.println("Dole desno: ");
        this.doleDesno.print();
    }

}

