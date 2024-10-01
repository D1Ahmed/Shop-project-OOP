
import java.util.Scanner;

public class Shop {
    Product list[] = new Product[100];
    int productCount=0;
    int revenue=0;

    Scanner input = new Scanner(System.in);

    {
        Product p1= new Product("shoes",50,2);
        Product p2= new Product("viper",10,1);
        Product p3= new Product("socks",20,5);
        Product p4= new Product("cat",1,5);
        Product p5= new Product("dog",2,5);

        list[productCount++]=p1;
        list[productCount++]=p2;
        list[productCount++]=p3;
        list[productCount++]=p4;
        list[productCount++]=p5;
    }

    Shop()
    {

    }
    public void addProduct()
    {
        Product p = new Product();
        System.out.println("Enter the name of product: ");
        p.setName(input.next());
        System.out.println("Enter price: ");
        p.setPrice(input.nextInt());
        System.out.println("Enter quantity: ");
        p.setQuantity(input.nextInt());

       list[productCount]=p;
       productCount++;
    }
    public void display()
    {
        for(int i=0;i<productCount;i++)
        {
            //System.out.println("Product Name:"+list[i].getName()+ " ID: "+list[i].getId() + " PRICE:"+list[i].getPrice()+ " Quantity:"+list[i].getQuantity());
            System.out.println(list[i].toString());
        }
        System.out.println();
    }
    public int search() {
        String id;
        System.out.println("Enter the id of product you want to search: ");
        id = input.next();
        int exists = 0;
        for (int i = 0; i < productCount; i++) {
            if (id.equals(list[i].getId())) {
                System.out.println("product Exists");
                exists = 1;
                break;
            }

        }
        if (exists == 0) {
            System.out.println("Do not exist");

        }
        return exists;
    }

    void modify()
    {
        int exists = 0;
        String id;
        String newName;
        System.out.println("Enter the product id, you want to change: ");
        id=input.next();

        System.out.println("Emter the new name of this product");
        newName=input.next();

        for(int i=0; i<productCount;i++)
        {
            if(list[i].id.equals(id))
            {
                exists=1;
                list[i].setName(newName);
                System.out.println("Product modified!");
            }
        }
        if(exists==0)
        {
            System.out.println("No such product found");
        }
    }

    public void delete()
    {
        String delName;
        boolean del=false;
        System.out.println("Enter the name of Product you want to delete: ");
        delName=input.next();

        for(int i=0;i<productCount;i++)
        {
            if(list[i].getName().equals(delName))
            {
                list[i]=null;
                System.out.println("Product khalaas!");
                del=true;
                productCount--;
                //FIX null pointer exc

                for(int j=i;j<productCount;j++)
                {
                    list[i]=list[i+1];
                    i++; //becasue i wasnt iterating to next index, and if I delete product at index 0, all next indexes will get same products
                }

            }
        }
        if(del==false)
        {
            System.out.println("Product couldn't be deleted");
        }
    }

    public void sale()
    {
        System.out.println("Enter the product name you want to buy: ");
        String name;
        name=input.next();

        for(int i=0;i<productCount;i++)
        {
            if(list[i].getName().equals(name))
            {
                if(list[i].getQuantity()!=0)
                {
                    list[i].setQuantity(list[i].getQuantity()-1);
                    revenue=revenue+list[i].getPrice();
                    System.out.println("Product Sold");
                }
                else{
                    System.out.println("Cant sell it, no more "+list[i].getName() +" left");
                }
                if(list[i].getQuantity()==0){ //if products quantity is 0, I m removing that from my list

                    productCount--;
                    for(int j=i;j<productCount;j++)
                    {
                        list[i]=list[i+1];
                        i++;
                    }

                }
            }
        }

        System.out.println("Total Revenue: "+ revenue);
    }



}
