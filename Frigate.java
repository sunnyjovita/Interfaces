package assignment;

class Frigate implements SeaVessel{
    String name;
    int maxSpeed;
    int maxPassengers;
    int displacement;

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

    public void fireGun(){
        System.out.println("FIREEEEE");
    }

    @Override
    public String toString() {
        return "Frigate{Name: " +getName() +" Max passengers: " +getMaxPassengers() + " Max Speed: " + getMaxSpeed();
    }
}
