public class Car {
    private String colour;
    private int price;

    public Car(int priceCar){
        price = priceCar;
    }
    public Car(String colourCar,int priceCar){
        colour = colourCar;
        price = priceCar;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}



