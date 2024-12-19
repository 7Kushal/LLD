import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VendingService {
    private static VendingService instance= null;
    static Inventory newInventory;
    final  VendingMachineState idealState;
    final  VendingMachineState readyState;
    final  VendingMachineState changeState;
    final  VendingMachineState dispenseState;
    private VendingMachineState currentState;
    private Product selectProduct;
    private double totalPayment;

    static VendingService getInstance(){
        if(instance==null)
        {
            instance = new VendingService();
        }
        return instance;
    }
    private VendingService(){
            newInventory = new Inventory();
            readyState    = new ReadyState();
            changeState   = new ChangeState();
            dispenseState = new DispenseState();
            idealState    = new IdealState();
            currentState = idealState;
            totalPayment=0;
            selectProduct=null;
            productList = new HashMap<>();
    }

    Map<Product,Integer> productList;

    boolean selectProduct(String name,Integer quantity){
        Product selected = new Product(name, quantity);
        if(newInventory.getList().containsKey(selected)){
            productList.put(selected,quantity);
            currentState = readyState;
            return true;
        }
        return false;
    }

    public boolean dispenseProduct() {
        if(selectProduct==null)
        return false;

        currentState = readyState;

        // Product product = vendingMachine.getSelectedProduct();
        newInventory.updateQuantity(selectProduct);
        System.out.println("Product dispensed: " + selectProduct.name);
        currentState = changeState; // Change the state to ReturnChangeState
        return true;
    }
    public void insertCoin(coins coin) {
        totalPayment+=coin.getValue();
        System.out.println("Coin inserted: " + coin);
        checkPaymentStatus();
    }
    public void insertNote(notes note) {
        totalPayment+=note.getValue();
        System.out.println("Note inserted: " + note);
        checkPaymentStatus();
    }

    private void checkPaymentStatus() {
       
    }
    public void addProduct(String string, int i) {
        newInventory.addProduct(string, i);
        System.out.println("added the product in the inventory");
    }
    public void returnChange() {
        if(selectProduct==null)
        System.out.println("Please select a product first");
        else{
        double diff = totalPayment-selectProduct.price;
        if(diff>0)
        {
            System.out.println("REturned " + diff);
        }
        else
        System.out.println("Nothing to return");
        // System.out.println();
         }
    }
    public void addProduct(String string, int i, int j) {
        newInventory.addProduct(string, i,j);
    }
    

}
