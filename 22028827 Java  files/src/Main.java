// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //greeting
        System.out.println("Welcome to Keele e-commerce Simulation");
        //create a buyer agent
        BuyerAgent BuyerAgent1= new BuyerAgent(1, "Roxy");
        //create some customer orders
        Order Order1 = new Order(6, 5, "Next Day Delivery", "Ramen");
        Order Order2 = new Order(3, 8, "Pick up at the store", "Ketchup");
        Order Order3 = new Order(10, 4, "2 working days", "Water Bottle");
        Order Order4 = new Order(12, 7, "Next Day Delivery", "Cutlery");
        Order Order5 = new Order(25, 10, "5 working days", "Pan");
        Order Order6 = new Order(1000,1, "Pick up at the store", "Rolex");
        Order Order7 = new Order(11, 3, "Same Day Delivery", "Ramen");
        Order Order8 = new Order(6, 1, "Pick up at the store", "Ketchup");

        // create products
        Product Product1 = new Product(1, "Ramen", 6, "Noodles");
        Product Product2 = new Product(2, "ketchup", 3, "Heinz Ketchup");
        Product Product3 = new Product(3, "Water Bottle", 10, "Plastic Water Bottle");
        Product Product4 = new Product(4, "Cutlery", 12, "Gold Cutlery");
        Product Product5 = new Product(5, "Pan", 25, "Shallow Pan");
        Product Product6 = new Product(6, "Rolex", 1000, "Wrist Watch");
        Product Product7 = new Product(7, "Ramen", 11, "Noodles");
        Product Product8 = new Product(8, "ketchup", 6, "Heinz Ketchup");
        //buyer agent makes an order
        BuyerAgent1.MakeOrder(Order1);
        //BuyerAgent1.MakeOrder(Order6);
        //create a seller agent
        SellerAgent SellerAgent1= new SellerAgent(1, "John");
        SellerAgent SellerAgent2= new SellerAgent(2,"Michael");
        //add products to seller agents
        SellerAgent1.AddProducts(Product3);
        SellerAgent1.AddProducts(Product4);
        SellerAgent1.AddProducts(Product2);
        SellerAgent1.AddProducts(Product7);
        SellerAgent2.AddProducts(Product1);
        SellerAgent2.AddProducts(Product5);
        SellerAgent2.AddProducts(Product8);

        //make broker agent
        BrokerAgent BrokerAgent1 = new BrokerAgent(1, "Anastasia");
        //add seller agents and buyer agents to broker agent
        BrokerAgent1.AddBuyerAgent(BuyerAgent1);
        BrokerAgent1.AddSellerAgent(SellerAgent1);
        BrokerAgent1.AddSellerAgent(SellerAgent2);
        //now the broker agent has a list of the seller agents and buyer agents

        // make a transaction
        BrokerAgent1.Transactions(BuyerAgent1);

        //
    }
}