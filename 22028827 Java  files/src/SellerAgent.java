import java.util.ArrayList;
import java.util.List;
class SellerAgent {
    private int Id;
    private String SellerName;
    private List<Product> products;

    public SellerAgent(int Id, String SellerName){
        this.Id=Id;
        this.SellerName=SellerName;
        this.products=new ArrayList<>();
    }

    public String GetSellerName(){
        return SellerName;
    }
    public List<Product> Getproducts(){
        return products;
    }

    public Product GetProduct(String productName){
         Product result = null;
        for(Product product: products){
            if(product.GetProductName().equals(productName)){
                result = product;
            }
        }
        return result;
    }
    public void AddProducts(Product Product){
        this.products.add(Product);
    }
    public boolean HasProducts(String ProductName){
        for(Product Product : products){
            if (Product.GetProductName().equals(ProductName)){
                return true;
            }
        }
        return false;
    }

}
