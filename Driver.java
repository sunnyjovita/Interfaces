package assignment;

public class Driver {
    public static void main(String args[]){
        // jeep
        Jeep j = new Jeep();
        j.setName("Jeep");
        j.drive();
        j.soundHorn();
        j.setMaxPassengers(10);
        j.setMaxSpeed(100);
        j.setNumWheels(4);
        System.out.println(j.toString());

        // frigate
        System.out.println();
        Frigate f = new Frigate();
        f.setName("Frigate");
        f.setMaxPassengers(100);
        f.setMaxSpeed(60);
        f.launch();
        System.out.println(f.toString());

        // hovercraft
        System.out.println();
        Hovercraft h = new Hovercraft();
        h.setName("Hovercraft");
        h.setMaxPassengers(40);
        h.setMaxSpeed(70);
        h.enterLand();
        h.enterSea();
        System.out.println(h.toString());

        // police car
        System.out.println();
        PoliceCar p = new PoliceCar();
        p.setName("Police car");
        p.setMaxPassengers(4);
        p.setMaxSpeed(50);
        p.setNumWheels(4);
        p.soundSiren();
        System.out.println(p.toString());
        p.addColor("White");
        p.printColors();

    }
}
