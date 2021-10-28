public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage("Penthouse Garage");
        garage.addBil(new Benzinbil(15846527, "Ford", "Mustang mach-1", 2021, 5, 95,10.5 ));
        garage.addBil(new Dieselbil(88553614, "Mercedes", "C200d", 2016, 5, true,21.3));
        garage.addBil(new Elbil(56521478, "Porshe","Taycan", 2021, 3, 79.2, 230, 1));

        System.out.println(garage.toString());
        System.out.println(garage.beregnGrønAfgiftForBilpark());
    }

}
