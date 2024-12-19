import java.util.*;
public class Inventory {
    Map<Product,Integer> productList;
    Inventory(){
        this.productList = new HashMap<>();
    }
    boolean addProduct(String name, Integer price){
        Product toAdd = new Product(name, price);
        return productList.put(toAdd,productList.getOrDefault(toAdd, 0) +1) != null;
    }
    // boolean removeProduct(String name, Integer quantity){
    //     Product toAdd = new Product(name, price);
    //     return productList.remove(name)!=null;
    //     // return true;
    // }
    public Map<Product,Integer> getList() {
        return productList;
    }
    public boolean updateQuantity(Product selectProduct) {
        return productList.put(selectProduct,productList.get(selectProduct)-1)!=null;
    }
    public boolean addProduct(String string, int i, int j) {
        for(Product p : productList.keySet()){
            if(p.name==string){
                // Product toAdd = new Product(string, i);
                // System.out.println(productList.get(toAdd));
                return productList.put(p,productList.get(p)+j) != null;
            }
        }
        return false;
    }
}
