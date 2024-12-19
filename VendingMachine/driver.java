public class driver {
    public static void main(String[] args) {
        VendingService vendingService = VendingService.getInstance();
        vendingService.addProduct("Milk",10);
        vendingService.addProduct("Biscuit",5);
        System.out.println(VendingService.newInventory.getList().size());
        vendingService.addProduct("Biscuit",5,10);
        vendingService.insertNote(notes.FIVE);
        vendingService.selectProduct("Biscuit", 1);
        vendingService.dispenseProduct();
        // vendingServicege
        vendingService.returnChange();
        // vendingServiceher product
        vendingService.selectProduct("Biscuit",2);
        // vendingServicefficient payment
        vendingService.insertCoin(coins.ONE);
        // vendingServiceense the product
        vendingService.dispenseProduct();
        // vendingService coins
        vendingService.insertCoin(coins.ONE);
        vendingService.insertCoin(coins.ONE);
        vendingService.insertCoin(coins.ONE);
        vendingService.insertCoin(coins.ONE);
        // vendingServicee product
        vendingService.dispenseProduct();
        // vendingServicege
        vendingService.returnChange();
    }
}
