public class Elbil extends Bil {
    private double batterikapacitetKWh;
    private int maxKm;
    private double whPrKm;


    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, double batterikapacitetKWh, int maxKm, double whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        double kmPrL = 100 / (whPrKm / 91.25);

        if (kmPrL > 20 && kmPrL <= 50) {
            return 330;

        } else if (kmPrL > 15 && kmPrL <= 20) {
            return 1050;

        } else if (kmPrL > 10 && kmPrL <= 15) {
            return 2340;

        } else if (kmPrL > 5 && kmPrL <= 10) {
            return 5500;

        } else{
            return 10470;
        }

    }
}
