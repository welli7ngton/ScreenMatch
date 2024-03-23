package exercicies;

import java.util.ArrayList;

class Carro {
    private final String model;
    private final int year;
    private final double price;

    private final ArrayList<Carro> cars = new ArrayList<>();

    public Carro(String model, int year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void showCarsInfo(){
        System.out.println("array size = " + cars.size());
    }
}


class ModelCar extends Carro{
    public static void main(String[] args) {
        ModelCar corolla = new ModelCar("Corolla", 2018, 75000);
        ModelCar fox = new ModelCar("Fox", 2018, 65000);

        fox.showCarsInfo();
    }

    public ModelCar(String model, int year, double price){

        super(model, year, price);
    }
}