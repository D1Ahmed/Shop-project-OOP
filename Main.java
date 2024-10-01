import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice=-1;
        Shop m = new Shop();
        Scanner input=new Scanner(System.in);
        while(choice !=0)
        {
            System.out.println("Enter your choice");
            System.out.println("1: Add Products to Shop");
            System.out.println("2: Display");
            System.out.println("3: Search");
            System.out.println("4: Modify");
            System.out.println("5: Delete");
            System.out.println("6: Sale");
            System.out.println();
            System.out.print("Your Choice: ");
            choice=input.nextInt();
            switch (choice)
            {
                case 1:
                    m.addProduct();
                    break;
                case 2:
                    m.display();
                    break;
                case 3:
                    m.search();
                    break;
                case 4:
                    m.modify();
                    break;
                case 5:
                    m.delete();
                    break;
                case 6:
                    m.sale();
                    break;
                default:
                    break;
            }


        }
    }
}