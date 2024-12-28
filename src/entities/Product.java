package entities;

public class Product {
    public String name;
    public int price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void
}

