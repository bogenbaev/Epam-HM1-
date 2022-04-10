public class Cabin {
    public int numberOfPassenger;
    public String upholsteryMaterial;

    public void setUpholsteryMaterial(String material){
        this.upholsteryMaterial = material;
    }

    public void setNumberOfPassenger(int count){
        this.numberOfPassenger = count;
    }

    public int getNumberOfPassenger(){
        return numberOfPassenger;
    }

    public String getUpholsteryMaterial(){
        return upholsteryMaterial;
    }
}
