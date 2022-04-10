public class Vehicle extends Mercedes {
    protected String LicansePlate;
    protected int cost;
    protected double volume;
    public double getVolume() {
        return volume;
    }

    public int getCost() {
        return cost;
    }

    public String getLicansePlate(){
        return LicansePlate;
    }

    public void setLicansePlate(String licanse){
        this.LicansePlate = licanse;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public void setCost(int cost){
        this.cost = cost;
    }
}
