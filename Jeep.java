package assignment;

class Jeep implements LandVehicle{
    String name;
    int maxSpeed;
    int maxPassengers;
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

    public int getNumWheels(){
        return NumWheels;
    }

    public void setNumWheels(int NumWheels){
        this.NumWheels = NumWheels;
    }

    public void drive(){
        System.out.println("Driving");
    }

    public void soundHorn(){
        System.out.println("BEEEP");
    }

    @Override
    public String toString() {
        return "Jeep{Name: " +getName() +" Max passengers: " +getMaxPassengers() + " Max Speed: " + getMaxSpeed()+ " Wheels: " +getNumWheels();
    }
}
