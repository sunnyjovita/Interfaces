package assignment;

public class Hovercraft implements LandVehicle, SeaVessel{
    String name;
    int maxSpeed;
    int maxPassengers;
    int displacement;
    int NumWheels;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMaxPassengers(){
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getDisplacement(){
        return displacement;
    }

    public void setDisplacement(int displacement){
        this.displacement = displacement;
    }

    public void launch(){
        System.out.println("Launch");
    }

    public int getNumWheels(){
        return NumWheels;
    }

    public void setNumWheels(int NumWheels){
        this.NumWheels = NumWheels;
    }

    public void drive(){
        System.out.println("Driving");
    }

    public void enterLand(){
        System.out.println("Enter land");
    }

    public void enterSea(){
        System.out.println("Enter sea");
    }

    @Override
    public String toString() {
        return "Hovercraft{Name: " +getName() +" Max passengers: " +getMaxPassengers() + " Max Speed: " + getMaxSpeed();
    }
}
