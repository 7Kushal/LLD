package BuilderDesign;

public class phone {
    int ram;
    int brand;
    int storage;
    boolean screentouch;
    int size;
    int model;

    phone(phoneBuilder b){
        this.ram = b.ram;
        this.brand=b.brand;
        this.model=b.model;
        this.screentouch=b.screentouch;
        this.size=b.size;
        this.storage=b.storage;
    }
    
    @Override
    public String toString() {
        return "phone [ram=" + ram + ", brand=" + brand + ", storage=" + storage + ", screentouch=" + screentouch
                + ", size=" + size + ", model=" + model + "]";
    }

    phone(int brand, int ram, int size){
        this.brand = brand;
        this.ram=ram;
        this.size=size;
    }
    //so the problem is we need multiple constructor for same and 
    phone(int brand, int ram, int size, int model){
        this.brand = brand;
        this.ram=ram;
        this.size=size;
        this.model=model;
    }
}