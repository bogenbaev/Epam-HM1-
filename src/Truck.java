public class Truck extends Vehicle {
    protected int distanceTraveled;
    protected int maxSpeed;
    protected int tonnage;
    protected String color;
    protected Cabin cabin = new Cabin();

    public Truck(int Year, String type, int maxSpeed, String material, int numberOfPassanger,
               int distanceTraveled, String color, int mass,
               String licence, int cost, double volume){
        super.setVolume(mass);
        super.setLicansePlate(licence);
        super.setTypes(type);
        super.setVolume(volume);
        super.setYear(year);
        cabin.setUpholsteryMaterial(material);
        cabin.setNumberOfPassenger(numberOfPassanger);
        this.distanceTraveled = distanceTraveled;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getTonnage(){
        return tonnage;
    }

    public int getDistanceTraveled(){
        return distanceTraveled;
    }

    public String getColor(){
        return color;
    }

    public void setDistanceTraveled(int distance){
        this.distanceTraveled = distance;
    }

    public void setMaxSpeed(int speed){
        this.maxSpeed = speed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setTonnage(int ton){
        this.tonnage = ton;
    }

    public double FuelForDistance(){
        return volume / distanceTraveled * 100;
    }
}
