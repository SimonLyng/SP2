import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> cars = new ArrayList<Bil>();
    private String name;

    public Garage(String name) {
        this.name = name;
    }
    public void addBil(Bil bil){
        cars.add(bil);
    }
    public double beregnGrønAfgiftForBilpark() {
        double skat = 0;
                for(Bil bil : cars){
                    skat += bil.beregnGrønEjerafgift();
                }
                return skat;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                ", name='" + name + '\'' +
                '}';
    }
}
