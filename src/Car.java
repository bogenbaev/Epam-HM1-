public class Car extends Vehicle {
    protected int distanceTraveled;
    protected int maxSpeed;
    protected String color;
    protected Cabin cabin = new Cabin();
    public Car(int Year, String type, int maxSpeed, String material, int numberOfPassanger,
               int distanceTraveled, String color,
               String licence, int cost, double volume){
        super.setLicansePlate(licence);
        super.setTypes(type);
        super.setVolume(volume);
        super.setYear(year);
        cabin.setNumberOfPassenger(numberOfPassanger);
        cabin.setUpholsteryMaterial(material);
        this.distanceTraveled = distanceTraveled;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public int getDistanceTraveled(){
        return distanceTraveled;
    }

    public int getMaxSpeed() {
        return maxSpeed;
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

    public double FuelForDistance(){
        return volume / distanceTraveled * 100;
    }
}
