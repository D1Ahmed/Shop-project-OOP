public class Product {
    String name;
    String id;
    static int idCount=0;
    int price;
    int quantity;
    Product(String name, int price, int quantity )
    {
        this.name=name;
        this.price = price;
        this.quantity=quantity;
        idCount++;
        this.id=String.format("%03d",idCount);
    }

    Product(String name, int price)
    {
        this.name=name;

        this.price = price;
        idCount++;
        this.id=String.format("%03d",idCount);
    }

    Product(String name)
    {
        this.name=name;
        idCount++;
        this.id=String.format("%03d",idCount);
    }

    Product( )
    {
        idCount++;
        this.id=String.format("%03d",idCount);
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String Id)
    {
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public String toString()
    {
        return "Product Name:"+this.getName()+ " ID: "+this.getId() + " PRICE:"+this.getPrice()+ " Quantity:"+this.getQuantity();
    }
}
