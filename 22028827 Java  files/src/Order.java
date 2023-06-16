
class Order {
    private float Price;
    private int Quantity;
    private String DeliveryOptions;
    private String ProductName;

    public Order(float Price, int Quantity, String DeliveryOptions, String ProductName){
        this.Price=Price;
        this.Quantity= Quantity;
        this.DeliveryOptions=DeliveryOptions;
        this.ProductName=ProductName;
    }
    public float GetPrice(){
        return Price;
    }
    public int GetQuantity(){
        return Quantity;
    }
    public String GetDeliveryOptions(){
        return DeliveryOptions;
    }
    public String GetProductName(){
        return ProductName;
    }
}
