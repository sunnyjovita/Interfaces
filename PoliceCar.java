package assignment;

public class PoliceCar implements LandVehicle, IsEmergency {
    String name;
    int maxSpeed;
    int maxPassengers;
    int NumWheels;
    private String[] colors;
    private int numColors = 0;
    private int maxColors = 6;

    public PoliceCar(){
        this.numColors = 0;
        this.colors = new String[maxColors];
    }

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

    public void soundSiren(){
        System.out.println("NANINUNENO");
    }

    public boolean addColor(String color){
        for(int i=0; i>numColors; i++){
            if(colors[i].equals(color)){
                System.out.println("color already existed");
                return false;
            }
        }
        colors[numColors++] = color;
        return true;
    }

    public void printColors(){
        for(int i=0; i<numColors; i++){
            System.out.println("Colors existed: " + colors[i]);
        }
    }

    @Override
    public String toString() {
        return "Police car {Name: " +getName() +" Max passengers: " +getMaxPassengers() + " Max Speed: " + getMaxSpeed()+ " Wheels: " +getNumWheels();
    }

}
