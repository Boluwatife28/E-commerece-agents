class BuyerAgent {
    private int Id;
    private String BuyerName;
    private Order Order;

    public BuyerAgent(int Id, String BuyerName){
        this.Id=Id;
        this.BuyerName=BuyerName;
        this.Order=null;
    }
    public String GetBuyerName(){
        return BuyerName;
    }
    public void MakeOrder(Order Order){
        this.Order=Order;
    }
    public Order GetOrder(){
        return Order;
    }
}
