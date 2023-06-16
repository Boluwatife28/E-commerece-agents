import java.util.ArrayList;
import java.util.List;
class BrokerAgent {
  //create properties of the class
  private int Id;
  private String BrokerName;
  private List<SellerAgent> SellerAgents;
  private List<BuyerAgent> BuyerAgents;

  //create constructor
  public BrokerAgent(int Id, String BrokerName){
    this.Id=Id;
    this.BrokerName=BrokerName;
    this.SellerAgents=new ArrayList<>();
    this.BuyerAgents=new ArrayList<>();
  }
  //create functions to access properties of class
  public String GetBrokerName(){
    return BrokerName;
  }
  public List<SellerAgent> GetSellerAgents(){
    return SellerAgents;
  }
  public List<BuyerAgent> GetBuyerAgents(){
    return BuyerAgents;
  }
  public void AddSellerAgent(SellerAgent SellerAgent){
    this.SellerAgents.add(SellerAgent);
  }
  public void AddBuyerAgent(BuyerAgent BuyerAgent) {
    this.BuyerAgents.add(BuyerAgent);
  }
  //create transaction function
  public void Transactions(BuyerAgent BAgents){
    Order CurrentOrder= BAgents.GetOrder();
    String ProductName = CurrentOrder.GetProductName();
    float Price= CurrentOrder.GetPrice();
    //broadcast the buyer's order to the sellers
    System.out.println("This Buyer " + BAgents.GetBuyerName()+ " is initiating a purchase for " + ProductName + " with price: " + Price);

    //seller agents make an offer
    List<SellerAgent> InterestedSellers= new ArrayList<>();
    for(SellerAgent SAgent: SellerAgents){
      if (SAgent.HasProducts(ProductName)){
        InterestedSellers.add(SAgent);
      }
    }
    if (InterestedSellers.isEmpty()){
      System.out.println("No seller found with the requested product. ");
    }
    else{
      for(SellerAgent AvailableSeller : InterestedSellers){
        Product CurrentProduct=AvailableSeller.GetProduct(ProductName);
        System.out.println("This seller "+ AvailableSeller.GetSellerName()+ " has " + CurrentProduct.GetProductName() + " with price: " + CurrentProduct.GetPrice());
      }
      //customer to pick best seller option
      System.out.println("Customer picks the best offer from the sellers. ");
      float BestPrice= Float.MAX_VALUE;
      SellerAgent BestSeller= null;
      for(SellerAgent AvailableSeller : InterestedSellers){
        Product CurrentProduct=AvailableSeller.GetProduct(ProductName);
        float SellerPrice = CurrentProduct.GetPrice();
        if(SellerPrice < BestPrice){
          BestPrice = SellerPrice;
          BestSeller = AvailableSeller;
        }
      }
      if (BestSeller != null){
        System.out.println("Buyer picks best offer which is from " + BestSeller.GetSellerName()+ " with price of " + BestPrice);
      }
    }
  }
}
