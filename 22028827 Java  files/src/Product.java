class Product {
    private int Id;
    private String ProductName;
    private float Price;
    private String Description;

    public Product(int Id, String ProductName, float Price, String Description) {
        this.Id = Id;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Description = Description;
    }

    public String GetProductName() {
        return ProductName;
    }
    public float GetPrice() {
        return Price;
    }
    public String GetDescription() {
        return Description;
    }
   public int GetId() {
        return Id;
   }
}
