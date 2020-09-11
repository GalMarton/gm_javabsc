package hu.training360.javase.task2;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        double d = 1.0d + ((double)percent / 100);
        price *= d;
    }

    public int comparePricePerCapacity(Pendrive pendrive) {
        int res = 0;
        double pricePerCapacity = price / capacity;
        double otherPricePerCapacity = pendrive.getPrice() / pendrive.getCapacity();

        if(pricePerCapacity > otherPricePerCapacity) {
            res = 1;
        }
        else if(pricePerCapacity < otherPricePerCapacity) {
            res = -1;
        }

        return res;
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return price < pendrive.getPrice();
    }
}
