public class Dieselbil extends Bil {
    private boolean harPartikelfilter;
    private double kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        int partikleSkat = harPartikelfilter ? 1000 : 0;

        if (kmPrL > 20 && kmPrL <= 50) {
            return 330 + 130 + partikleSkat;

        } else if (kmPrL > 15 && kmPrL <= 20) {
            return 1050 + 1390 + partikleSkat;

        } else if (kmPrL > 10 && kmPrL <= 15) {
            return 2340 + 1850 + partikleSkat;

        } else if (kmPrL > 5 && kmPrL <= 10) {
            return 5500 + 2770 + partikleSkat;

        } else {
            return 10470 + 15260 + partikleSkat;
        }

    }
}

